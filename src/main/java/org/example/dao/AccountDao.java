package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.domain.Account;

//对应的是@Mapper注解的接口
public interface AccountDao {
    @Select("select * from tbl_acount where id=#{id}")
    public Account getByID(Integer id);
    @Update("update tbl_acount set money=#{money} where id=#{id}")
    public void update(@Param("id") Integer id, @Param("money") Integer money);

}
