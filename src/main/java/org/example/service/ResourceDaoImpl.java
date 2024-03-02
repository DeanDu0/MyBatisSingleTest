package org.example.service;

import org.example.service.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResource(String url, String password) {
        System.out.println(password.length());
        return password.equals("root");
    }
}
