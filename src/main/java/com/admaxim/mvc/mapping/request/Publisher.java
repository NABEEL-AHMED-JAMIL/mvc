package com.admaxim.mvc.mapping.request;

import java.util.List;

public class Publisher {

    private String id;
    private String name;
    private List<String> cat;
    private String domain;
    private Object ext;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCat() {
        return cat;
    }
    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Object getExt() {
        return ext;
    }
    public void setExt(Object ext) {
        this.ext = ext;
    }

}
