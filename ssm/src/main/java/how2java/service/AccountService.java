package how2java.service;


import how2java.pojo.Account;


import java.util.List;

public interface AccountService {
    Account get(String account_number, String login_credent, int landing_type);
    public List<Account> list();
    int add(Account account);
}
