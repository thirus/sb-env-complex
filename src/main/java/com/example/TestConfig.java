package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test")
@Configuration
public class TestConfig {
    private Map<String, Domain> domains = new HashMap<>();
    private List<Domain> lst = new ArrayList<>();
    private List<String> a = new ArrayList<>();

    public TestConfig() {
    }

    public List<String> getA() {
        return a;
    }

    public void setA(final List<String> a) {
        this.a = a;
    }

    public List<Domain> getLst() {
        return lst;
    }

    public void setLst(final List<Domain> lst) {
        this.lst = lst;
    }

    public Map<String, Domain> getDomains() {
        return domains;
    }

    public void setDomains(final Map<String, Domain> domains) {
        this.domains = domains;
    }
}


