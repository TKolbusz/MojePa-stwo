package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Address;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.Management;
import com.tkolbusz.domain.model.Money;
import com.tkolbusz.domain.model.Shareholder;
import com.tkolbusz.provider.dto.CompanyDTO;
import com.tkolbusz.provider.dto.DataObjectDTO;
import com.tkolbusz.provider.dto.DataResponseDTO;
import com.tkolbusz.provider.dto.LayersDTO;
import com.tkolbusz.provider.dto.ManagementDTO;
import com.tkolbusz.provider.dto.ShareholderDTO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Date;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Response;

import static java.util.Collections.emptyList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProviderServiceTest {
    @Mock
    IMojePanstwoApi api;

    @Test
    public void searchCompanies() throws Exception {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setKrsPodmiotyNazwaSkrocona("name");
        companyDTO.setKrsPodmiotyFormaPrawnaStr("llc");
        companyDTO.setKrsPodmiotyKrs("krsNumber");
        companyDTO.setKrsPodmiotyDataRejestracji("2016-09-20");
        companyDTO.setKrsPodmiotyAdresUlica("testStreet");
        companyDTO.setKrsPodmiotyAdresNumer("321");
        companyDTO.setKrsPodmiotyAdresMiejscowosc("cracow");
        companyDTO.setKrsPodmiotyAdresKraj("poland");
        companyDTO.setKrsPodmiotyAdresKodPocztowy("123");

        DataObjectDTO dataObjectDTO = new DataObjectDTO(companyDTO);
        dataObjectDTO.setId(1);
        DataResponseDTO dto = new DataResponseDTO(Arrays.asList(dataObjectDTO));

        Response<DataResponseDTO> dataResponseDTOResponse = Response.success(dto);

        when(api.searchCompanies(any(), anyInt(), anyInt()))
                .thenReturn(Single.just(dataResponseDTOResponse));

        IProviderService instance = getInstance();

        instance.searchCompanies("test", 0, 0)
                .test()
                .assertValue(list -> {
                    CompanySmall c = new CompanySmall(1, "name", "llc", new Address("testStreet", "321", "cracow", "poland", "123"), "krsNumber", new Date(116, 8, 20));
                    return list.size() == 1 && list.get(0).equals(c);
                })
                .assertNoErrors()
                .assertComplete();
    }

    @Test
    public void getCompanyById() {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setKrsPodmiotyNazwaSkrocona("name");
        companyDTO.setKrsPodmiotyFormaPrawnaStr("llc");
        companyDTO.setKrsPodmiotyKrs("krsNumber");
        companyDTO.setKrsPodmiotyDataRejestracji("2016-09-20");
        companyDTO.setKrsPodmiotyAdresUlica("testStreet");
        companyDTO.setKrsPodmiotyAdresNumer("321");
        companyDTO.setKrsPodmiotyAdresMiejscowosc("cracow");
        companyDTO.setKrsPodmiotyAdresKraj("poland");
        companyDTO.setKrsPodmiotyAdresKodPocztowy("123");
        companyDTO.setKrsPodmiotyRegon("regon");
        companyDTO.setKrsPodmiotyNip("1234");
        companyDTO.setKrsPodmiotyWartoscKapitalZakladowy(2d);


        DataObjectDTO dataObjectDTO = new DataObjectDTO(companyDTO);
        dataObjectDTO.setId(1);
        LayersDTO layers = new LayersDTO();
        ManagementDTO managementDTO = new ManagementDTO();
        managementDTO.setFunkcja("Manager");
        managementDTO.setNazwa("Emil Smith");
        layers.setReprezentacja(Arrays.asList(managementDTO));
        ShareholderDTO shareholderDTO = new ShareholderDTO();
        shareholderDTO.setFunkcja("Shareholder");
        shareholderDTO.setUdzialyLiczba(12);
        shareholderDTO.setUdzialyWartosc(12d);
        shareholderDTO.setUdzialyWartoscJedn(1d);
        shareholderDTO.setNazwa("John Walker");

        layers.setWspolnicy(Arrays.asList(shareholderDTO));
        dataObjectDTO.setLayers(layers);

        Response<DataObjectDTO> dataObjectDTOResponse = Response.success(dataObjectDTO);

        when(api.getCompanyById(anyInt(), anyList()))
                .thenReturn(Single.just(dataObjectDTOResponse));

        IProviderService instance = getInstance();

        instance.getCompanyById(1, emptyList())
                .test()
                .assertValue(company -> {
                    Company c = new Company(new CompanySmall(1, "name", "llc", new Address("testStreet", "321", "cracow", "poland", "123"), "krsNumber", new Date(116, 8, 20)), "regon", new Money(2d, "PLN"), Arrays.asList(new Management("Emil Smith", "Manager")), Arrays.asList(new Shareholder("John Walker", 12, new Money(1d, "PLN"), new Money(12d, "PLN"))), "1234");
                    return company.equals(c);
                })
                .assertNoErrors()
                .assertComplete();
    }

    @Test
    public void responseUnsuccessfulThrowsProviderException() {
        Response<DataResponseDTO> response = Response.error(404, ResponseBody.create(null, ""));
        when(api.searchCompanies(any(), anyInt(), anyInt())).thenReturn(Single.just(response));
        getInstance()
                .searchCompanies("test", 0, 0)
                .test()
                .assertError(ProviderException.class);
    }


    @Test
    public void socketTimeoutIsMappedToConnectionException() {
        when(api.getCompanyById(anyInt(), anyList())).thenReturn(Single.error(new SocketTimeoutException()));
        getInstance()
                .getCompanyById(1, emptyList())
                .test()
                .assertError(ConnectionException.class);
    }

    private IProviderService getInstance() {
        return new ProviderService(api);
    }
}