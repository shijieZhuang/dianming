package how2java.service.impl;


import how2java.mapper.AccountMapper;
import how2java.pojo.Account;
import how2java.pojo.Student;
import how2java.service.AccountService;
import how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account get(String account_number, String login_credent, int landing_type){
        Account account =accountMapper.findByUsername(account_number);
        System.out.println(account.getLogin_credent());
        System.out.println(account.getLanding_type());
        System.out.println(account.getAccount_number());
        if(account != null && account.getLogin_credent().equals(login_credent) && account.getLanding_type()==landing_type){
            return account;
        }
        return null;
    }
    @Override
    public int add(Account account){
        return accountMapper.add(account);
    }
    @Override
    public List<Account> list() {
        return accountMapper.list();
    }
}
