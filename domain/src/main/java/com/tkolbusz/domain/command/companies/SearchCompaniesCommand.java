package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.repository.CompanyRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class SearchCompaniesCommand extends Command<List<Company>, SearchCompaniesCommand.Params> {
    private final CompanyRepository companyRepository;

    @Inject
    public SearchCompaniesCommand(CommandData commandData, CompanyRepository companyRepository) {
        super(commandData);
        this.companyRepository = companyRepository;
    }

    @Override
    protected Observable<List<Company>> buildObservable(Params params) {
        return Observable.fromCallable(() -> companyRepository.getCompanies(params.query));
    }

    public static class Params {
        String query;

        public Params(String query) {
            this.query = query;
        }

    }
}
