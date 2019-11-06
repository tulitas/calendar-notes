package com;

//import org.hibernate.jpa.HibernatePersistenceProvider;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.entities")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("com.Models")

public class DataConfig {

    private static final String PROP_DATABASE_PASSWORD = "spring.db.password";
    private static final String PROP_DATABASE_URL = "spring.db.url";
    private static final String PROP_DATABASE_USERNAME = "spring.db.username";
    private static final String PROP_HIBERNATE_DIALECT = "spring.hibernate.dialect";
    private static final String PROP_HIBERNATE_SHOW_SQL = "spring.jpa.show_sql";
    private static final String PROP_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packagesToScan";
    private static final String PROP_HIBERNATE_HBM2DDL_AUTO = "spring.jpa.hibernate.hbm2ddl.auto";

    @Resource
    private Environment env;

//    @Bean
private DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        System.out.println("test 0,2");

        System.out.println("test 0,3");

        dataSource.setUrl(env.getRequiredProperty(PROP_DATABASE_URL));
        System.out.println("test 0,4");

        dataSource.setUsername(env.getRequiredProperty(PROP_DATABASE_USERNAME));
        System.out.println("test 0,5");

        dataSource.setPassword(env.getRequiredProperty(PROP_DATABASE_PASSWORD));
        System.out.println("test 1");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        System.out.println("test 2");
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        System.out.println("2,3");
        entityManagerFactoryBean.setDataSource(dataSource());
        System.out.println("test 2,8");
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        System.out.println("test 2,9");
        entityManagerFactoryBean.setPackagesToScan(env.getRequiredProperty(PROP_ENTITYMANAGER_PACKAGES_TO_SCAN));
        System.out.println("test 3");
        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
        System.out.println("test 3,1");
        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        System.out.println("test 4");
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        System.out.println("test 4,5");
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        System.out.println("test 5");
        return transactionManager;
    }

    private Properties getHibernateProperties() {
        System.out.println("test 6");
        Properties properties = new Properties();
        System.out.println("test 7");
        properties.put(PROP_HIBERNATE_DIALECT, env.getRequiredProperty(PROP_HIBERNATE_DIALECT));
        System.out.println("test 8");
        properties.put(PROP_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROP_HIBERNATE_SHOW_SQL));
        System.out.println("test 9");
        properties.put(PROP_HIBERNATE_HBM2DDL_AUTO, env.getRequiredProperty(PROP_HIBERNATE_HBM2DDL_AUTO));

        return properties;
    }

}
