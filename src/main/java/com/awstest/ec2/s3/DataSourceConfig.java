package com.awstest.ec2.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private String url ="jdbc:postgresql://spring-server-test-db.csryyziosifd.us-east-1.rds.amazonaws.com:5432/postgres";

    private String username = System.getenv("DBusername");

    private String password = System.getenv("DBpassword");

//    private String driverClassName = "org.postgresql.Driver";

    @Bean
    public DataSource datasource() {
        System.out.println(System.getenv("DBusername")+"why is it null");
        return DataSourceBuilder.create()
                .url(url)
                .username(username)
                .password(password)
//                .driverClassName(driverClassName)
                .build();
    }
}
