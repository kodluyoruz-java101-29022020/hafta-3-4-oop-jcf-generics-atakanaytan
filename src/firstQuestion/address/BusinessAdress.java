package firstQuestion.address;

public class BusinessAdress implements Address {

    private String companyName;
    private String street;
    private String city;
    private String province;
    private int postalCode;

    public BusinessAdress(String companyName, String street, String city, String province, int postalCode) {
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public int getPostalCode() {
        return this.postalCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusinessAdress{");
        sb.append("street='").append(street).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", postalCode=").append(postalCode);
        sb.append('}');
        return sb.toString();
    }

}
