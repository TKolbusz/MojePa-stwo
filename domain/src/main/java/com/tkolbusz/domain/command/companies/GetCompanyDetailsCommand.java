package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.model.Company;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetCompanyDetailsCommand extends Command<Company, GetCompanyDetailsCommand.Params> {
    @Inject
    public GetCompanyDetailsCommand(CommandData commandData) {
        super(commandData);
    }

    @Override
    protected Observable<Company> buildObservable(Params params) {
        return Observable.just(params.company);
    }

    public static class Params {
        Company company;

        public Params(Company company) {
            this.company = company;
        }
    }
}
