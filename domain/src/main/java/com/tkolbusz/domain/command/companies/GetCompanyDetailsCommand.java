package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.repository.CompanyRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetCompanyDetailsCommand extends Command<Company, GetCompanyDetailsCommand.Params> {
    private final CompanyRepository companyRepository;

    @Inject
    public GetCompanyDetailsCommand(CommandData commandData, CompanyRepository companyRepository) {
        super(commandData);
        this.companyRepository = companyRepository;
    }

    @Override
    protected Observable<Company> buildObservable(Params params) {
        CompanySmall company = params.company;
        return Observable.fromCallable(() -> companyRepository.getCompanyById(company.getExternalId()));
    }

    public static class Params {
        CompanySmall company;

        public Params(CompanySmall company) {
            this.company = company;
        }
    }
}
