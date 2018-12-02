
package com.tkolbusz.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class DataDTO {

    @SerializedName("krs_podmioty.data_wyrejestrowania_przedsiebiorcy")
    @Expose
    private Object krsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy;
    @SerializedName("krs_podmioty.data_wykreslenia_stowarzyszenia")
    @Expose
    private Object krsPodmiotyDataWykresleniaStowarzyszenia;
    @SerializedName("krs_podmioty.data_sprawdzenia")
    @Expose
    private String krsPodmiotyDataSprawdzenia;
    @SerializedName("krs_podmioty.adres_lokal")
    @Expose
    private String krsPodmiotyAdresLokal;
    @SerializedName("krs_podmioty.adres_miejscowosc")
    @Expose
    private String krsPodmiotyAdresMiejscowosc;
    @SerializedName("krs_podmioty.liczba_czlonkow_komitetu_zal")
    @Expose
    private String krsPodmiotyLiczbaCzlonkowKomitetuZal;
    @SerializedName("krs_podmioty.regon")
    @Expose
    private String krsPodmiotyRegon;
    @SerializedName("krs_podmioty.akcept")
    @Expose
    private String krsPodmiotyAkcept;
    @SerializedName("krs_podmioty.forma_prawna_typ_id")
    @Expose
    private String krsPodmiotyFormaPrawnaTypId;
    @SerializedName("krs_podmioty.liczba_zmian_umow")
    @Expose
    private String krsPodmiotyLiczbaZmianUmow;
    @SerializedName("krs_podmioty.siedziba")
    @Expose
    private String krsPodmiotySiedziba;
    @SerializedName("krs_podmioty.wartosc_kapital_zakladowy")
    @Expose
    private Integer krsPodmiotyWartoscKapitalZakladowy;
    @SerializedName("krs_podmioty.rejestr_stowarzyszen")
    @Expose
    private String krsPodmiotyRejestrStowarzyszen;
    @SerializedName("krs_podmioty.nazwa")
    @Expose
    private String krsPodmiotyNazwa;
    @SerializedName("krs_podmioty.adres_kod_pocztowy")
    @Expose
    private String krsPodmiotyAdresKodPocztowy;
    @SerializedName("krs_podmioty.empty")
    @Expose
    private String krsPodmiotyEmpty;
    @SerializedName("krs_podmioty.nip")
    @Expose
    private String krsPodmiotyNip;
    @SerializedName("krs_podmioty.liczba_prokurentow")
    @Expose
    private String krsPodmiotyLiczbaProkurentow;
    @SerializedName("krs_podmioty.nieprzedsiebiorca")
    @Expose
    private String krsPodmiotyNieprzedsiebiorca;
    @SerializedName("krs_podmioty.www")
    @Expose
    private String krsPodmiotyWww;
    @SerializedName("krs_podmioty.forma_prawna_str")
    @Expose
    private String krsPodmiotyFormaPrawnaStr;
    @SerializedName("krs_podmioty.nazwa_organu_reprezentacji")
    @Expose
    private String krsPodmiotyNazwaOrganuReprezentacji;
    @SerializedName("krs_podmioty.wczesniejsza_rejestracja_str")
    @Expose
    private String krsPodmiotyWczesniejszaRejestracjaStr;
    @SerializedName("krs_podmioty.adres")
    @Expose
    private String krsPodmiotyAdres;
    @SerializedName("krs_podmioty.id")
    @Expose
    private String krsPodmiotyId;
    @SerializedName("krs_podmioty.liczba_akcji_wszystkich_emisji")
    @Expose
    private String krsPodmiotyLiczbaAkcjiWszystkichEmisji;
    @SerializedName("krs_podmioty.dotacje_ue_beneficjent_id")
    @Expose
    private String krsPodmiotyDotacjeUeBeneficjentId;
    @SerializedName("krs_podmioty.person_id")
    @Expose
    private List<String> krsPodmiotyPersonId = null;
    @SerializedName("krs_podmioty.liczba_emisji_akcji")
    @Expose
    private String krsPodmiotyLiczbaEmisjiAkcji;
    @SerializedName("krs_podmioty.twitter_account_id")
    @Expose
    private String krsPodmiotyTwitterAccountId;
    @SerializedName("krs_podmioty.data_dokonania_wpisu")
    @Expose
    private String krsPodmiotyDataDokonaniaWpisu;
    @SerializedName("krs_podmioty.nazwa_organu_nadzoru")
    @Expose
    private String krsPodmiotyNazwaOrganuNadzoru;
    @SerializedName("krs_podmioty.wartosc_czesc_kapitalu_wplaconego")
    @Expose
    private Integer krsPodmiotyWartoscCzescKapitaluWplaconego;
    @SerializedName("krs_podmioty.rejestr")
    @Expose
    private String krsPodmiotyRejestr;
    @SerializedName("krs_podmioty.wartosc_nominalna_podwyzszenia_kapitalu")
    @Expose
    private Integer krsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu;
    @SerializedName("krs_podmioty.data_rejestracji_przedsiebiorcy")
    @Expose
    private String krsPodmiotyDataRejestracjiPrzedsiebiorcy;
    @SerializedName("krs_podmioty.firma")
    @Expose
    private String krsPodmiotyFirma;
    @SerializedName("krs_podmioty.opp")
    @Expose
    private String krsPodmiotyOpp;
    @SerializedName("krs_podmioty.liczba_dzialalnosci")
    @Expose
    private String krsPodmiotyLiczbaDzialalnosci;
    @SerializedName("krs_podmioty.numer_wpisu")
    @Expose
    private String krsPodmiotyNumerWpisu;
    @SerializedName("krs_podmioty.file_id")
    @Expose
    private String krsPodmiotyFileId;
    @SerializedName("krs_podmioty.deleted_on_request")
    @Expose
    private String krsPodmiotyDeletedOnRequest;
    @SerializedName("krs_podmioty.adres_ulica")
    @Expose
    private String krsPodmiotyAdresUlica;
    @SerializedName("krs_podmioty.liczba_jedynych_akcjonariuszy")
    @Expose
    private String krsPodmiotyLiczbaJedynychAkcjonariuszy;
    @SerializedName("krs_podmioty.data_rejestracji_stowarzyszenia")
    @Expose
    private Object krsPodmiotyDataRejestracjiStowarzyszenia;
    @SerializedName("krs_podmioty.liczba_nadzorcow")
    @Expose
    private String krsPodmiotyLiczbaNadzorcow;
    @SerializedName("krs_podmioty.sposob_reprezentacji")
    @Expose
    private String krsPodmiotySposobReprezentacji;
    @SerializedName("krs_podmioty.wykreslony")
    @Expose
    private String krsPodmiotyWykreslony;
    @SerializedName("krs_podmioty.gmina_id")
    @Expose
    private String krsPodmiotyGminaId;
    @SerializedName("krs_podmioty.wojewodztwo_id")
    @Expose
    private String krsPodmiotyWojewodztwoId;
    @SerializedName("krs_podmioty.liczba_zmian")
    @Expose
    private String krsPodmiotyLiczbaZmian;
    @SerializedName("krs_podmioty.sygnatura_akt")
    @Expose
    private String krsPodmiotySygnaturaAkt;
    @SerializedName("krs_podmioty.liczba_wspolnikow")
    @Expose
    private String krsPodmiotyLiczbaWspolnikow;
    @SerializedName("krs_podmioty.cel_dzialania")
    @Expose
    private Object krsPodmiotyCelDzialania;
    @SerializedName("krs_podmioty.nazwa_skrocona")
    @Expose
    private String krsPodmiotyNazwaSkrocona;
    @SerializedName("krs_podmioty.data_ostatni_wpis")
    @Expose
    private Object krsPodmiotyDataOstatniWpis;
    @SerializedName("krs_podmioty.liczba_reprezentantow")
    @Expose
    private String krsPodmiotyLiczbaReprezentantow;
    @SerializedName("krs_podmioty.email")
    @Expose
    private String krsPodmiotyEmail;
    @SerializedName("krs_podmioty.adres_poczta")
    @Expose
    private String krsPodmiotyAdresPoczta;
    @SerializedName("krs_podmioty.kod_pocztowy_id")
    @Expose
    private String krsPodmiotyKodPocztowyId;
    @SerializedName("krs_podmioty.data_wpisu_opp")
    @Expose
    private Object krsPodmiotyDataWpisuOpp;
    @SerializedName("krs_podmioty.wartosc_kapital_docelowy")
    @Expose
    private Integer krsPodmiotyWartoscKapitalDocelowy;
    @SerializedName("krs_podmioty.adres_numer")
    @Expose
    private String krsPodmiotyAdresNumer;
    @SerializedName("krs_podmioty.powiat_id")
    @Expose
    private String krsPodmiotyPowiatId;
    @SerializedName("krs_podmioty.adres_kraj")
    @Expose
    private String krsPodmiotyAdresKraj;
    @SerializedName("krs_podmioty.wartosc_nominalna_akcji")
    @Expose
    private Integer krsPodmiotyWartoscNominalnaAkcji;
    @SerializedName("krs_podmioty.gpw_spolka_id")
    @Expose
    private String krsPodmiotyGpwSpolkaId;
    @SerializedName("krs_podmioty.miejscowosc_id")
    @Expose
    private String krsPodmiotyMiejscowoscId;
    @SerializedName("krs_podmioty.knf_ostrzezenie_id")
    @Expose
    private String krsPodmiotyKnfOstrzezenieId;
    @SerializedName("krs_podmioty.krs")
    @Expose
    private String krsPodmiotyKrs;
    @SerializedName("krs_podmioty.data_zawieszenia_dzialanosci")
    @Expose
    private Object krsPodmiotyDataZawieszeniaDzialanosci;
    @SerializedName("krs_podmioty.data_rejestracji")
    @Expose
    private String krsPodmiotyDataRejestracji;
    @SerializedName("krs_podmioty.ostatni_wpis_id")
    @Expose
    private String krsPodmiotyOstatniWpisId;
    @SerializedName("krs_podmioty.data_uprawomocnienia_wykreslenia")
    @Expose
    private Object krsPodmiotyDataUprawomocnieniaWykreslenia;
    @SerializedName("krs_podmioty.forma_prawna_id")
    @Expose
    private String krsPodmiotyFormaPrawnaId;
    @SerializedName("krs_podmioty.liczba_oddzialow")
    @Expose
    private String krsPodmiotyLiczbaOddzialow;
    @SerializedName("krs_podmioty.data_wznowienia_dzialanosci")
    @Expose
    private Object krsPodmiotyDataWznowieniaDzialanosci;
    @SerializedName("krs_podmioty.umowa_spolki_cywilnej")
    @Expose
    private String krsPodmiotyUmowaSpolkiCywilnej;
    @SerializedName("krs_podmioty.oznaczenie_sadu")
    @Expose
    private String krsPodmiotyOznaczenieSadu;

    public Object getKrsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy() {
        return krsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy;
    }

    public void setKrsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy(Object krsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy) {
        this.krsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy = krsPodmiotyDataWyrejestrowaniaPrzedsiebiorcy;
    }

    public Object getKrsPodmiotyDataWykresleniaStowarzyszenia() {
        return krsPodmiotyDataWykresleniaStowarzyszenia;
    }

    public void setKrsPodmiotyDataWykresleniaStowarzyszenia(Object krsPodmiotyDataWykresleniaStowarzyszenia) {
        this.krsPodmiotyDataWykresleniaStowarzyszenia = krsPodmiotyDataWykresleniaStowarzyszenia;
    }

    public String getKrsPodmiotyDataSprawdzenia() {
        return krsPodmiotyDataSprawdzenia;
    }

    public void setKrsPodmiotyDataSprawdzenia(String krsPodmiotyDataSprawdzenia) {
        this.krsPodmiotyDataSprawdzenia = krsPodmiotyDataSprawdzenia;
    }

    public String getKrsPodmiotyAdresLokal() {
        return krsPodmiotyAdresLokal;
    }

    public void setKrsPodmiotyAdresLokal(String krsPodmiotyAdresLokal) {
        this.krsPodmiotyAdresLokal = krsPodmiotyAdresLokal;
    }

    public String getKrsPodmiotyAdresMiejscowosc() {
        return krsPodmiotyAdresMiejscowosc;
    }

    public void setKrsPodmiotyAdresMiejscowosc(String krsPodmiotyAdresMiejscowosc) {
        this.krsPodmiotyAdresMiejscowosc = krsPodmiotyAdresMiejscowosc;
    }

    public String getKrsPodmiotyLiczbaCzlonkowKomitetuZal() {
        return krsPodmiotyLiczbaCzlonkowKomitetuZal;
    }

    public void setKrsPodmiotyLiczbaCzlonkowKomitetuZal(String krsPodmiotyLiczbaCzlonkowKomitetuZal) {
        this.krsPodmiotyLiczbaCzlonkowKomitetuZal = krsPodmiotyLiczbaCzlonkowKomitetuZal;
    }

    public String getKrsPodmiotyRegon() {
        return krsPodmiotyRegon;
    }

    public void setKrsPodmiotyRegon(String krsPodmiotyRegon) {
        this.krsPodmiotyRegon = krsPodmiotyRegon;
    }

    public String getKrsPodmiotyAkcept() {
        return krsPodmiotyAkcept;
    }

    public void setKrsPodmiotyAkcept(String krsPodmiotyAkcept) {
        this.krsPodmiotyAkcept = krsPodmiotyAkcept;
    }

    public String getKrsPodmiotyFormaPrawnaTypId() {
        return krsPodmiotyFormaPrawnaTypId;
    }

    public void setKrsPodmiotyFormaPrawnaTypId(String krsPodmiotyFormaPrawnaTypId) {
        this.krsPodmiotyFormaPrawnaTypId = krsPodmiotyFormaPrawnaTypId;
    }

    public String getKrsPodmiotyLiczbaZmianUmow() {
        return krsPodmiotyLiczbaZmianUmow;
    }

    public void setKrsPodmiotyLiczbaZmianUmow(String krsPodmiotyLiczbaZmianUmow) {
        this.krsPodmiotyLiczbaZmianUmow = krsPodmiotyLiczbaZmianUmow;
    }

    public String getKrsPodmiotySiedziba() {
        return krsPodmiotySiedziba;
    }

    public void setKrsPodmiotySiedziba(String krsPodmiotySiedziba) {
        this.krsPodmiotySiedziba = krsPodmiotySiedziba;
    }

    public Integer getKrsPodmiotyWartoscKapitalZakladowy() {
        return krsPodmiotyWartoscKapitalZakladowy;
    }

    public void setKrsPodmiotyWartoscKapitalZakladowy(Integer krsPodmiotyWartoscKapitalZakladowy) {
        this.krsPodmiotyWartoscKapitalZakladowy = krsPodmiotyWartoscKapitalZakladowy;
    }

    public String getKrsPodmiotyRejestrStowarzyszen() {
        return krsPodmiotyRejestrStowarzyszen;
    }

    public void setKrsPodmiotyRejestrStowarzyszen(String krsPodmiotyRejestrStowarzyszen) {
        this.krsPodmiotyRejestrStowarzyszen = krsPodmiotyRejestrStowarzyszen;
    }

    public String getKrsPodmiotyNazwa() {
        return krsPodmiotyNazwa;
    }

    public void setKrsPodmiotyNazwa(String krsPodmiotyNazwa) {
        this.krsPodmiotyNazwa = krsPodmiotyNazwa;
    }

    public String getKrsPodmiotyAdresKodPocztowy() {
        return krsPodmiotyAdresKodPocztowy;
    }

    public void setKrsPodmiotyAdresKodPocztowy(String krsPodmiotyAdresKodPocztowy) {
        this.krsPodmiotyAdresKodPocztowy = krsPodmiotyAdresKodPocztowy;
    }

    public String getKrsPodmiotyEmpty() {
        return krsPodmiotyEmpty;
    }

    public void setKrsPodmiotyEmpty(String krsPodmiotyEmpty) {
        this.krsPodmiotyEmpty = krsPodmiotyEmpty;
    }

    public String getKrsPodmiotyNip() {
        return krsPodmiotyNip;
    }

    public void setKrsPodmiotyNip(String krsPodmiotyNip) {
        this.krsPodmiotyNip = krsPodmiotyNip;
    }

    public String getKrsPodmiotyLiczbaProkurentow() {
        return krsPodmiotyLiczbaProkurentow;
    }

    public void setKrsPodmiotyLiczbaProkurentow(String krsPodmiotyLiczbaProkurentow) {
        this.krsPodmiotyLiczbaProkurentow = krsPodmiotyLiczbaProkurentow;
    }

    public String getKrsPodmiotyNieprzedsiebiorca() {
        return krsPodmiotyNieprzedsiebiorca;
    }

    public void setKrsPodmiotyNieprzedsiebiorca(String krsPodmiotyNieprzedsiebiorca) {
        this.krsPodmiotyNieprzedsiebiorca = krsPodmiotyNieprzedsiebiorca;
    }

    public String getKrsPodmiotyWww() {
        return krsPodmiotyWww;
    }

    public void setKrsPodmiotyWww(String krsPodmiotyWww) {
        this.krsPodmiotyWww = krsPodmiotyWww;
    }

    public String getKrsPodmiotyFormaPrawnaStr() {
        return krsPodmiotyFormaPrawnaStr;
    }

    public void setKrsPodmiotyFormaPrawnaStr(String krsPodmiotyFormaPrawnaStr) {
        this.krsPodmiotyFormaPrawnaStr = krsPodmiotyFormaPrawnaStr;
    }

    public String getKrsPodmiotyNazwaOrganuReprezentacji() {
        return krsPodmiotyNazwaOrganuReprezentacji;
    }

    public void setKrsPodmiotyNazwaOrganuReprezentacji(String krsPodmiotyNazwaOrganuReprezentacji) {
        this.krsPodmiotyNazwaOrganuReprezentacji = krsPodmiotyNazwaOrganuReprezentacji;
    }

    public String getKrsPodmiotyWczesniejszaRejestracjaStr() {
        return krsPodmiotyWczesniejszaRejestracjaStr;
    }

    public void setKrsPodmiotyWczesniejszaRejestracjaStr(String krsPodmiotyWczesniejszaRejestracjaStr) {
        this.krsPodmiotyWczesniejszaRejestracjaStr = krsPodmiotyWczesniejszaRejestracjaStr;
    }

    public String getKrsPodmiotyAdres() {
        return krsPodmiotyAdres;
    }

    public void setKrsPodmiotyAdres(String krsPodmiotyAdres) {
        this.krsPodmiotyAdres = krsPodmiotyAdres;
    }

    public String getKrsPodmiotyId() {
        return krsPodmiotyId;
    }

    public void setKrsPodmiotyId(String krsPodmiotyId) {
        this.krsPodmiotyId = krsPodmiotyId;
    }

    public String getKrsPodmiotyLiczbaAkcjiWszystkichEmisji() {
        return krsPodmiotyLiczbaAkcjiWszystkichEmisji;
    }

    public void setKrsPodmiotyLiczbaAkcjiWszystkichEmisji(String krsPodmiotyLiczbaAkcjiWszystkichEmisji) {
        this.krsPodmiotyLiczbaAkcjiWszystkichEmisji = krsPodmiotyLiczbaAkcjiWszystkichEmisji;
    }

    public String getKrsPodmiotyDotacjeUeBeneficjentId() {
        return krsPodmiotyDotacjeUeBeneficjentId;
    }

    public void setKrsPodmiotyDotacjeUeBeneficjentId(String krsPodmiotyDotacjeUeBeneficjentId) {
        this.krsPodmiotyDotacjeUeBeneficjentId = krsPodmiotyDotacjeUeBeneficjentId;
    }

    public List<String> getKrsPodmiotyPersonId() {
        return krsPodmiotyPersonId;
    }

    public void setKrsPodmiotyPersonId(List<String> krsPodmiotyPersonId) {
        this.krsPodmiotyPersonId = krsPodmiotyPersonId;
    }

    public String getKrsPodmiotyLiczbaEmisjiAkcji() {
        return krsPodmiotyLiczbaEmisjiAkcji;
    }

    public void setKrsPodmiotyLiczbaEmisjiAkcji(String krsPodmiotyLiczbaEmisjiAkcji) {
        this.krsPodmiotyLiczbaEmisjiAkcji = krsPodmiotyLiczbaEmisjiAkcji;
    }

    public String getKrsPodmiotyTwitterAccountId() {
        return krsPodmiotyTwitterAccountId;
    }

    public void setKrsPodmiotyTwitterAccountId(String krsPodmiotyTwitterAccountId) {
        this.krsPodmiotyTwitterAccountId = krsPodmiotyTwitterAccountId;
    }

    public String getKrsPodmiotyDataDokonaniaWpisu() {
        return krsPodmiotyDataDokonaniaWpisu;
    }

    public void setKrsPodmiotyDataDokonaniaWpisu(String krsPodmiotyDataDokonaniaWpisu) {
        this.krsPodmiotyDataDokonaniaWpisu = krsPodmiotyDataDokonaniaWpisu;
    }

    public String getKrsPodmiotyNazwaOrganuNadzoru() {
        return krsPodmiotyNazwaOrganuNadzoru;
    }

    public void setKrsPodmiotyNazwaOrganuNadzoru(String krsPodmiotyNazwaOrganuNadzoru) {
        this.krsPodmiotyNazwaOrganuNadzoru = krsPodmiotyNazwaOrganuNadzoru;
    }

    public Integer getKrsPodmiotyWartoscCzescKapitaluWplaconego() {
        return krsPodmiotyWartoscCzescKapitaluWplaconego;
    }

    public void setKrsPodmiotyWartoscCzescKapitaluWplaconego(Integer krsPodmiotyWartoscCzescKapitaluWplaconego) {
        this.krsPodmiotyWartoscCzescKapitaluWplaconego = krsPodmiotyWartoscCzescKapitaluWplaconego;
    }

    public String getKrsPodmiotyRejestr() {
        return krsPodmiotyRejestr;
    }

    public void setKrsPodmiotyRejestr(String krsPodmiotyRejestr) {
        this.krsPodmiotyRejestr = krsPodmiotyRejestr;
    }

    public Integer getKrsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu() {
        return krsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu;
    }

    public void setKrsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu(Integer krsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu) {
        this.krsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu = krsPodmiotyWartoscNominalnaPodwyzszeniaKapitalu;
    }

    public String getKrsPodmiotyDataRejestracjiPrzedsiebiorcy() {
        return krsPodmiotyDataRejestracjiPrzedsiebiorcy;
    }

    public void setKrsPodmiotyDataRejestracjiPrzedsiebiorcy(String krsPodmiotyDataRejestracjiPrzedsiebiorcy) {
        this.krsPodmiotyDataRejestracjiPrzedsiebiorcy = krsPodmiotyDataRejestracjiPrzedsiebiorcy;
    }

    public String getKrsPodmiotyFirma() {
        return krsPodmiotyFirma;
    }

    public void setKrsPodmiotyFirma(String krsPodmiotyFirma) {
        this.krsPodmiotyFirma = krsPodmiotyFirma;
    }

    public String getKrsPodmiotyOpp() {
        return krsPodmiotyOpp;
    }

    public void setKrsPodmiotyOpp(String krsPodmiotyOpp) {
        this.krsPodmiotyOpp = krsPodmiotyOpp;
    }

    public String getKrsPodmiotyLiczbaDzialalnosci() {
        return krsPodmiotyLiczbaDzialalnosci;
    }

    public void setKrsPodmiotyLiczbaDzialalnosci(String krsPodmiotyLiczbaDzialalnosci) {
        this.krsPodmiotyLiczbaDzialalnosci = krsPodmiotyLiczbaDzialalnosci;
    }

    public String getKrsPodmiotyNumerWpisu() {
        return krsPodmiotyNumerWpisu;
    }

    public void setKrsPodmiotyNumerWpisu(String krsPodmiotyNumerWpisu) {
        this.krsPodmiotyNumerWpisu = krsPodmiotyNumerWpisu;
    }

    public String getKrsPodmiotyFileId() {
        return krsPodmiotyFileId;
    }

    public void setKrsPodmiotyFileId(String krsPodmiotyFileId) {
        this.krsPodmiotyFileId = krsPodmiotyFileId;
    }

    public String getKrsPodmiotyDeletedOnRequest() {
        return krsPodmiotyDeletedOnRequest;
    }

    public void setKrsPodmiotyDeletedOnRequest(String krsPodmiotyDeletedOnRequest) {
        this.krsPodmiotyDeletedOnRequest = krsPodmiotyDeletedOnRequest;
    }

    public String getKrsPodmiotyAdresUlica() {
        return krsPodmiotyAdresUlica;
    }

    public void setKrsPodmiotyAdresUlica(String krsPodmiotyAdresUlica) {
        this.krsPodmiotyAdresUlica = krsPodmiotyAdresUlica;
    }

    public String getKrsPodmiotyLiczbaJedynychAkcjonariuszy() {
        return krsPodmiotyLiczbaJedynychAkcjonariuszy;
    }

    public void setKrsPodmiotyLiczbaJedynychAkcjonariuszy(String krsPodmiotyLiczbaJedynychAkcjonariuszy) {
        this.krsPodmiotyLiczbaJedynychAkcjonariuszy = krsPodmiotyLiczbaJedynychAkcjonariuszy;
    }

    public Object getKrsPodmiotyDataRejestracjiStowarzyszenia() {
        return krsPodmiotyDataRejestracjiStowarzyszenia;
    }

    public void setKrsPodmiotyDataRejestracjiStowarzyszenia(Object krsPodmiotyDataRejestracjiStowarzyszenia) {
        this.krsPodmiotyDataRejestracjiStowarzyszenia = krsPodmiotyDataRejestracjiStowarzyszenia;
    }

    public String getKrsPodmiotyLiczbaNadzorcow() {
        return krsPodmiotyLiczbaNadzorcow;
    }

    public void setKrsPodmiotyLiczbaNadzorcow(String krsPodmiotyLiczbaNadzorcow) {
        this.krsPodmiotyLiczbaNadzorcow = krsPodmiotyLiczbaNadzorcow;
    }

    public String getKrsPodmiotySposobReprezentacji() {
        return krsPodmiotySposobReprezentacji;
    }

    public void setKrsPodmiotySposobReprezentacji(String krsPodmiotySposobReprezentacji) {
        this.krsPodmiotySposobReprezentacji = krsPodmiotySposobReprezentacji;
    }

    public String getKrsPodmiotyWykreslony() {
        return krsPodmiotyWykreslony;
    }

    public void setKrsPodmiotyWykreslony(String krsPodmiotyWykreslony) {
        this.krsPodmiotyWykreslony = krsPodmiotyWykreslony;
    }

    public String getKrsPodmiotyGminaId() {
        return krsPodmiotyGminaId;
    }

    public void setKrsPodmiotyGminaId(String krsPodmiotyGminaId) {
        this.krsPodmiotyGminaId = krsPodmiotyGminaId;
    }

    public String getKrsPodmiotyWojewodztwoId() {
        return krsPodmiotyWojewodztwoId;
    }

    public void setKrsPodmiotyWojewodztwoId(String krsPodmiotyWojewodztwoId) {
        this.krsPodmiotyWojewodztwoId = krsPodmiotyWojewodztwoId;
    }

    public String getKrsPodmiotyLiczbaZmian() {
        return krsPodmiotyLiczbaZmian;
    }

    public void setKrsPodmiotyLiczbaZmian(String krsPodmiotyLiczbaZmian) {
        this.krsPodmiotyLiczbaZmian = krsPodmiotyLiczbaZmian;
    }

    public String getKrsPodmiotySygnaturaAkt() {
        return krsPodmiotySygnaturaAkt;
    }

    public void setKrsPodmiotySygnaturaAkt(String krsPodmiotySygnaturaAkt) {
        this.krsPodmiotySygnaturaAkt = krsPodmiotySygnaturaAkt;
    }

    public String getKrsPodmiotyLiczbaWspolnikow() {
        return krsPodmiotyLiczbaWspolnikow;
    }

    public void setKrsPodmiotyLiczbaWspolnikow(String krsPodmiotyLiczbaWspolnikow) {
        this.krsPodmiotyLiczbaWspolnikow = krsPodmiotyLiczbaWspolnikow;
    }

    public Object getKrsPodmiotyCelDzialania() {
        return krsPodmiotyCelDzialania;
    }

    public void setKrsPodmiotyCelDzialania(Object krsPodmiotyCelDzialania) {
        this.krsPodmiotyCelDzialania = krsPodmiotyCelDzialania;
    }

    public String getKrsPodmiotyNazwaSkrocona() {
        return krsPodmiotyNazwaSkrocona;
    }

    public void setKrsPodmiotyNazwaSkrocona(String krsPodmiotyNazwaSkrocona) {
        this.krsPodmiotyNazwaSkrocona = krsPodmiotyNazwaSkrocona;
    }

    public Object getKrsPodmiotyDataOstatniWpis() {
        return krsPodmiotyDataOstatniWpis;
    }

    public void setKrsPodmiotyDataOstatniWpis(Object krsPodmiotyDataOstatniWpis) {
        this.krsPodmiotyDataOstatniWpis = krsPodmiotyDataOstatniWpis;
    }

    public String getKrsPodmiotyLiczbaReprezentantow() {
        return krsPodmiotyLiczbaReprezentantow;
    }

    public void setKrsPodmiotyLiczbaReprezentantow(String krsPodmiotyLiczbaReprezentantow) {
        this.krsPodmiotyLiczbaReprezentantow = krsPodmiotyLiczbaReprezentantow;
    }

    public String getKrsPodmiotyEmail() {
        return krsPodmiotyEmail;
    }

    public void setKrsPodmiotyEmail(String krsPodmiotyEmail) {
        this.krsPodmiotyEmail = krsPodmiotyEmail;
    }

    public String getKrsPodmiotyAdresPoczta() {
        return krsPodmiotyAdresPoczta;
    }

    public void setKrsPodmiotyAdresPoczta(String krsPodmiotyAdresPoczta) {
        this.krsPodmiotyAdresPoczta = krsPodmiotyAdresPoczta;
    }

    public String getKrsPodmiotyKodPocztowyId() {
        return krsPodmiotyKodPocztowyId;
    }

    public void setKrsPodmiotyKodPocztowyId(String krsPodmiotyKodPocztowyId) {
        this.krsPodmiotyKodPocztowyId = krsPodmiotyKodPocztowyId;
    }

    public Object getKrsPodmiotyDataWpisuOpp() {
        return krsPodmiotyDataWpisuOpp;
    }

    public void setKrsPodmiotyDataWpisuOpp(Object krsPodmiotyDataWpisuOpp) {
        this.krsPodmiotyDataWpisuOpp = krsPodmiotyDataWpisuOpp;
    }

    public Integer getKrsPodmiotyWartoscKapitalDocelowy() {
        return krsPodmiotyWartoscKapitalDocelowy;
    }

    public void setKrsPodmiotyWartoscKapitalDocelowy(Integer krsPodmiotyWartoscKapitalDocelowy) {
        this.krsPodmiotyWartoscKapitalDocelowy = krsPodmiotyWartoscKapitalDocelowy;
    }

    public String getKrsPodmiotyAdresNumer() {
        return krsPodmiotyAdresNumer;
    }

    public void setKrsPodmiotyAdresNumer(String krsPodmiotyAdresNumer) {
        this.krsPodmiotyAdresNumer = krsPodmiotyAdresNumer;
    }

    public String getKrsPodmiotyPowiatId() {
        return krsPodmiotyPowiatId;
    }

    public void setKrsPodmiotyPowiatId(String krsPodmiotyPowiatId) {
        this.krsPodmiotyPowiatId = krsPodmiotyPowiatId;
    }

    public String getKrsPodmiotyAdresKraj() {
        return krsPodmiotyAdresKraj;
    }

    public void setKrsPodmiotyAdresKraj(String krsPodmiotyAdresKraj) {
        this.krsPodmiotyAdresKraj = krsPodmiotyAdresKraj;
    }

    public Integer getKrsPodmiotyWartoscNominalnaAkcji() {
        return krsPodmiotyWartoscNominalnaAkcji;
    }

    public void setKrsPodmiotyWartoscNominalnaAkcji(Integer krsPodmiotyWartoscNominalnaAkcji) {
        this.krsPodmiotyWartoscNominalnaAkcji = krsPodmiotyWartoscNominalnaAkcji;
    }

    public String getKrsPodmiotyGpwSpolkaId() {
        return krsPodmiotyGpwSpolkaId;
    }

    public void setKrsPodmiotyGpwSpolkaId(String krsPodmiotyGpwSpolkaId) {
        this.krsPodmiotyGpwSpolkaId = krsPodmiotyGpwSpolkaId;
    }

    public String getKrsPodmiotyMiejscowoscId() {
        return krsPodmiotyMiejscowoscId;
    }

    public void setKrsPodmiotyMiejscowoscId(String krsPodmiotyMiejscowoscId) {
        this.krsPodmiotyMiejscowoscId = krsPodmiotyMiejscowoscId;
    }

    public String getKrsPodmiotyKnfOstrzezenieId() {
        return krsPodmiotyKnfOstrzezenieId;
    }

    public void setKrsPodmiotyKnfOstrzezenieId(String krsPodmiotyKnfOstrzezenieId) {
        this.krsPodmiotyKnfOstrzezenieId = krsPodmiotyKnfOstrzezenieId;
    }

    public String getKrsPodmiotyKrs() {
        return krsPodmiotyKrs;
    }

    public void setKrsPodmiotyKrs(String krsPodmiotyKrs) {
        this.krsPodmiotyKrs = krsPodmiotyKrs;
    }

    public Object getKrsPodmiotyDataZawieszeniaDzialanosci() {
        return krsPodmiotyDataZawieszeniaDzialanosci;
    }

    public void setKrsPodmiotyDataZawieszeniaDzialanosci(Object krsPodmiotyDataZawieszeniaDzialanosci) {
        this.krsPodmiotyDataZawieszeniaDzialanosci = krsPodmiotyDataZawieszeniaDzialanosci;
    }

    public String getKrsPodmiotyDataRejestracji() {
        return krsPodmiotyDataRejestracji;
    }

    public void setKrsPodmiotyDataRejestracji(String krsPodmiotyDataRejestracji) {
        this.krsPodmiotyDataRejestracji = krsPodmiotyDataRejestracji;
    }

    public String getKrsPodmiotyOstatniWpisId() {
        return krsPodmiotyOstatniWpisId;
    }

    public void setKrsPodmiotyOstatniWpisId(String krsPodmiotyOstatniWpisId) {
        this.krsPodmiotyOstatniWpisId = krsPodmiotyOstatniWpisId;
    }

    public Object getKrsPodmiotyDataUprawomocnieniaWykreslenia() {
        return krsPodmiotyDataUprawomocnieniaWykreslenia;
    }

    public void setKrsPodmiotyDataUprawomocnieniaWykreslenia(Object krsPodmiotyDataUprawomocnieniaWykreslenia) {
        this.krsPodmiotyDataUprawomocnieniaWykreslenia = krsPodmiotyDataUprawomocnieniaWykreslenia;
    }

    public String getKrsPodmiotyFormaPrawnaId() {
        return krsPodmiotyFormaPrawnaId;
    }

    public void setKrsPodmiotyFormaPrawnaId(String krsPodmiotyFormaPrawnaId) {
        this.krsPodmiotyFormaPrawnaId = krsPodmiotyFormaPrawnaId;
    }

    public String getKrsPodmiotyLiczbaOddzialow() {
        return krsPodmiotyLiczbaOddzialow;
    }

    public void setKrsPodmiotyLiczbaOddzialow(String krsPodmiotyLiczbaOddzialow) {
        this.krsPodmiotyLiczbaOddzialow = krsPodmiotyLiczbaOddzialow;
    }

    public Object getKrsPodmiotyDataWznowieniaDzialanosci() {
        return krsPodmiotyDataWznowieniaDzialanosci;
    }

    public void setKrsPodmiotyDataWznowieniaDzialanosci(Object krsPodmiotyDataWznowieniaDzialanosci) {
        this.krsPodmiotyDataWznowieniaDzialanosci = krsPodmiotyDataWznowieniaDzialanosci;
    }

    public String getKrsPodmiotyUmowaSpolkiCywilnej() {
        return krsPodmiotyUmowaSpolkiCywilnej;
    }

    public void setKrsPodmiotyUmowaSpolkiCywilnej(String krsPodmiotyUmowaSpolkiCywilnej) {
        this.krsPodmiotyUmowaSpolkiCywilnej = krsPodmiotyUmowaSpolkiCywilnej;
    }

    public String getKrsPodmiotyOznaczenieSadu() {
        return krsPodmiotyOznaczenieSadu;
    }

    public void setKrsPodmiotyOznaczenieSadu(String krsPodmiotyOznaczenieSadu) {
        this.krsPodmiotyOznaczenieSadu = krsPodmiotyOznaczenieSadu;
    }

}
