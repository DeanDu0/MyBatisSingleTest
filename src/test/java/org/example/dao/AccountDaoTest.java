package org.example.dao;

import org.example.config.SpringConfig;
import org.example.domain.Account;
import org.example.service.AccountDaoImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class AccountDaoTest {
    @Autowired
    private AccountDaoImp accountDao;
    @Test
    public void testGetById(){
        Account ac=accountDao.getById(1);
        System.out.println(ac);

    }

}
