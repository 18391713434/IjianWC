package com.sjz.management;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan(basePackages = "com.sjz.management.mapper")
public class IjianwcManagementApplication
{
    public static void main(String args[]){
        {
            SpringApplication.run(IjianwcManagementApplication.class, args);
        }
        }
}
