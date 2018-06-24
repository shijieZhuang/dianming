package how2java.mapper;


import how2java.pojo.Account;

import java.util.List;

public interface AccountMapper {

    Account findByUsername(String account_number);
    public List<Account> list();
    int add(Account account);
}