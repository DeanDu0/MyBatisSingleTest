package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Account;

//对应的是@Mapper注解的接口
public interface AccountDao {
    @Select("select * from tbl_acount where id=#{id}")
    public Account getByID(Integer id);

}
