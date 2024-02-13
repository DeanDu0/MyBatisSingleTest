package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring的核心就是IOC思想，Spring实现了IOC思想，Spring提供一个容器及IOC容器，充当所谓的外部，负责对象的实例化创建等
 * spring配置类
 */
@Configuration
@ComponentScan({"org.example"})
@PropertySource({"jdbc.properties"})
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
