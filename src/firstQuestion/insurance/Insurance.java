package firstQuestion.insurance;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {

    protected String name;
    protected double price;
    protected Date startDate;
    protected Date endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = calculateInsurancePrice();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public abstract double calculateInsurancePrice();


}
