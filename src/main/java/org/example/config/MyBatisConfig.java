package org.example.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


//这里代替的是MyBatis的XML的配置文件，重点就是要实现XML配置一样的效果
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb=new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("org.example.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mscf=new MapperScannerConfigurer();
        mscf.setBasePackage("org.example.dao");
        return mscf;
    }
}
