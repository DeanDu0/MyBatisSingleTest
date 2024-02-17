package org.example.service;

import org.example.dao.AccountDao;
import org.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDaoImp {
    @Autowired
    private AccountDao accountDao;
    public Account getById(Integer id){
        return accountDao.getByID(id);
    }

}
