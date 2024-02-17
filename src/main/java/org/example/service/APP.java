package org.example.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.AccountDao;
import org.example.domain.Account;

import java.io.InputStream;

public class APP {
    public static void main(String[] args) throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream inputStream= Resources.getResourceAsStream("sqlConfig.xml");
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AccountDao accountDao=sqlSession.getMapper(AccountDao.class);
        Account ac=accountDao.getByID(1);
        System.out.println(ac);
        sqlSession.close();
    }
}
