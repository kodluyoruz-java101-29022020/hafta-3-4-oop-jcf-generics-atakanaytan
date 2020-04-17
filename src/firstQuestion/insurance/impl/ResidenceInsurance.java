package firstQuestion.insurance.impl;

import firstQuestion.insurance.Insurance;
import firstQuestion.insurance.insuranceType.InsuranceType;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }


    @Override
    public double calculateInsurancePrice() {

        long milisecondDiff = super.getStartDate().getTime() - super.getEndDate().getTime();
        long timeDiffAsDays = TimeUnit.DAYS.convert(milisecondDiff, TimeUnit.MILLISECONDS);

        double charge = InsuranceType.ResidenceInsurance.getPrice() * timeDiffAsDays;

        return charge;
    }
}
