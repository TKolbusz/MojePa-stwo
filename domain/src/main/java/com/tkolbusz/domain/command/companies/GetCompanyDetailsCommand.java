package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.Command;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.Currency;
import com.tkolbusz.domain.model.Money;

import java.util.Collections;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetCompanyDetailsCommand extends Command<Company, GetCompanyDetailsCommand.Params> {
    @Inject
    public GetCompanyDetailsCommand(CommandData commandData) {
        super(commandData);
    }

    @Override
    protected Observable<Company> buildObservable(Params params) {
        CompanySmall company = params.company;
        return Observable.just(new Company(
                company.getExternalId(),
                company.getName(),
                company.getType(),
                company.getAddress(),
                company.getKrsNumber(),
                company.getRegisterDate(),
                "1234",
                new Money(0d, Currency.PLN),
                Collections.emptyList()
        ));
    }

    public static class Params {
        CompanySmall company;

        public Params(CompanySmall company) {
            this.company = company;
        }
    }
}
