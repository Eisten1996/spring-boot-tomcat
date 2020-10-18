package com.bolasaideas.springboot.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Dipper
 * @project spring-boot-tomcat
 * @created 18/10/2020 - 17:47
 */
public class ServeletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootDataJpaApplication.class);
    }
}
