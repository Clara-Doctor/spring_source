package com.geek.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements BeanNameAware, EnvironmentAware {

    private Integer id;

    private String userName;

    private String beanName;

    private Environment environment;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}