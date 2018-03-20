package com.admaxim.mvc.mapping.request;

import java.util.List;


// rtb-2.3
public class Site {

    private String id;
    private String name;
    private String domain;
    private List<String> cat;
    private List<String> sectioncat;
    private List<String> pagecat;
    private String page;
    private String ref;
    private String search;
    private Integer mobile;
    private Integer privacypolicy;
    private Publisher publisher;
    private Content content;
    private String keywords;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<String> getCat() {
        return cat;
    }

    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public List<String> getSectioncat() {
        return sectioncat;
    }

    public void setSectioncat(List<String> sectioncat) {
        this.sectioncat = sectioncat;
    }

    public List<String> getPagecat() {
        return pagecat;
    }

    public void setPagecat(List<String> pagecat) {
        this.pagecat = pagecat;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getPrivacypolicy() {
        return privacypolicy;
    }

    public void setPrivacypolicy(Integer privacypolicy) {
        this.privacypolicy = privacypolicy;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}
