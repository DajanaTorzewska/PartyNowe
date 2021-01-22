package com.sda.PartyGenerator.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "moj.prefix")
public class MyConfig {
    private String myFieldA;
    private String myFieldB;

    public String getMyFieldA() {
        return myFieldA;
    }

    public String getMyFieldB() {
        return myFieldB;
    }

    public void setMyFieldA(String myFieldA) {
        this.myFieldA = myFieldA;
    }

    public void setMyFieldB(String myFieldB) {
        this.myFieldB = myFieldB;
    }

}
