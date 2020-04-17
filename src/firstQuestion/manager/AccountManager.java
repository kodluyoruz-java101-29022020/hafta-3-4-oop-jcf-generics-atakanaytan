package firstQuestion.manager;

import firstQuestion.account.Account;
import firstQuestion.account.loginStatus.AuthenticationStatus;
import firstQuestion.exception.InvalidAuthenticationException;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager{

    private TreeSet<Account> accounts;

    public AccountManager(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }

    public Account login (String email, String password) throws InvalidAuthenticationException {


        Iterator<Account> iterate = accounts.iterator();

        while (iterate.hasNext()){

            Account account = iterate.next();

            if (account.login(account, email, password)){

                return account;
            }
        }
        throw new InvalidAuthenticationException(AuthenticationStatus.FAIL.getMessage());
    }


}
