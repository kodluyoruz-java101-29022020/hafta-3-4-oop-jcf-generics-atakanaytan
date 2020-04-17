package firstQuestion.account.impl;

import firstQuestion.account.Account;
import firstQuestion.insurance.Insurance;
import firstQuestion.user.User;

import java.util.List;

public class Enterprise extends Account {

    public Enterprise(List<Insurance> insurances, User user) {
        super(insurances, user);
    }

    @Override
    protected double addProfitMargin(double insurancePrice) {

        double totalCharge = insurancePrice + (insurancePrice * 0.10);

        return totalCharge;
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getEmail().compareTo(o.getUser().getEmail());
    }
}
