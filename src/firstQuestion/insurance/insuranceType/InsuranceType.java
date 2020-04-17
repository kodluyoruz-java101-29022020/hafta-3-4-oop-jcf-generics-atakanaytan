package firstQuestion.insurance.insuranceType;

public enum InsuranceType {

    CarInsurance(40),
    HealthInsurance(50),
    ResidenceInsurance(55),
    TravelInsurance(55);

    private final double price;

    InsuranceType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
