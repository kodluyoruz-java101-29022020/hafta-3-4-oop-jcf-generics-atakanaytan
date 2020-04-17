package firstQuestion.account;

import firstQuestion.account.loginStatus.AuthenticationStatus;
import firstQuestion.insurance.Insurance;
import firstQuestion.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    protected List<Insurance> insurances;
    protected User user;
    protected AuthenticationStatus authenticationStatus;

    public Account(List<Insurance> insurances, User user, AuthenticationStatus authenticationStatus) {
        this.insurances = insurances;
        this.user = user;
        this.authenticationStatus = authenticationStatus;
    }

    public Account(List<Insurance> insurances, User user) {
        this.insurances = insurances;
        this.user = user;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public final void showInfo(User user){

        if (user != null) {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(user.getName()).append('\'');
        sb.append(", surname='").append(user.getSurname()).append('\'');
        sb.append(", email='").append(user.getEmail()).append('\'');
        sb.append(", job='").append(user.getJob()).append('\'');
        sb.append(", age=").append(user.getJob());
        sb.append(", addressList=").append(user.getAddressList());
        sb.append('}');

        System.out.println(sb.toString());

        } else {

            System.out.println("There is no valid user to show");
        }
    }

    public boolean login (Account account, String email, String password) {

        if (email.equals(account.getUser().getEmail()) &&

                password.equals(account.getUser().getPassword())) {
                authenticationStatus = authenticationStatus.SUCCESSFUL;
        } else {

            authenticationStatus = authenticationStatus.FAIL;
        }

        return authenticationStatus.isLogin();
    }

    public boolean addInsurance(Account account, Insurance insurance) {

        if (account.getInsurances().isEmpty()){

            List<Insurance> insuranceList = new ArrayList<Insurance>();

            insuranceList.add(insurance);
            account.setInsurances(insuranceList);

            return true;
        } else {

            account.getInsurances().add(insurance);

            return true;
        }

    }

    public void removeInsurance(Account account, Insurance insurace) {

        if (account.getInsurances().contains(insurace)) {

            account.getInsurances().remove(insurace);
        } else {
            System.out.println("There ise no insurance to delete");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getInsurances(), account.getInsurances()) &&
                Objects.equals(getUser(), account.getUser()) &&
                getAuthenticationStatus() == account.getAuthenticationStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInsurances(), getUser(), getAuthenticationStatus());
    }

    protected abstract double addProfitMargin(double insurancePrice);

}
