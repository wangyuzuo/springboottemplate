package com.myspringboot.template.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: java类作用描述
 * @Package: com.myspringboot.template.starter
 * @ClassName: TemplateApplication
 * @Author: wanggang
 * @CreateDate: 2020/12/27 16:28
 * @Version: 1.0
 */
@ComponentScan("com")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class TemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }
}
