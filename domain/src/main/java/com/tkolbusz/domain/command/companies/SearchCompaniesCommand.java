package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.Config;
import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.PaginationResult;
import com.tkolbusz.domain.repository.CompanyRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class SearchCompaniesCommand extends Command<PaginationResult<CompanySmall>, SearchCompaniesCommand.Params> {
    private final CompanyRepository companyRepository;

    @Inject
    public SearchCompaniesCommand(CommandData commandData, CompanyRepository companyRepository) {
        super(commandData);
        this.companyRepository = companyRepository;
    }

    @Override
    protected Observable<PaginationResult<CompanySmall>> buildObservable(Params params) {
        String query = params.query;
        int page = params.page;        // send empty list
        if (query == null || query.length() == 0)
            return Observable.just(PaginationResult.firstPage());
        return Observable.create(emitter -> {
            try {
                List<CompanySmall> companies = companyRepository.getCompanies(query, page);
                emitter.onNext(PaginationResult.from(companies, page + 1, companies.size() != Config.REST_PAGE_SIZE));
                emitter.onComplete();
            } catch (ConnectionException | ProviderException e) {
                emitter.tryOnError(e);
            }
        });
    }

    public static class Params {
        String query;
        int page;

        public Params(String query, int page) {
            this.query = query;
            this.page = page;
        }
    }
}