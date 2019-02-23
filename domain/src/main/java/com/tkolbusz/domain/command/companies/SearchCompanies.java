package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.PaginationResult;
import com.tkolbusz.domain.repository.CompanyRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

import static com.tkolbusz.domain.Config.REST_PAGE_SIZE;

public class SearchCompanies extends Command<PaginationResult<CompanySmall>, SearchCompanies.Params> {
    private final CompanyRepository companyRepository;

    @Inject
    public SearchCompanies(CommandData commandData, CompanyRepository companyRepository) {
        super(commandData);
        this.companyRepository = companyRepository;
    }

    @Override
    protected Observable<PaginationResult<CompanySmall>> buildObservable(Params params) {
        String query = params.query;
        int page = params.page;        // send empty list
        if (query == null || query.length() == 0)
            return Observable.just(PaginationResult.firstPage());
        return companyRepository.getCompanies(query, page)
                .map(companies -> PaginationResult.from(companies, page + 1, companies.size() != REST_PAGE_SIZE))
                .toObservable();
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