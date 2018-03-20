package com.admaxim.mvc.mapping.request;

import java.util.List;


// rtb-2.3
public class User {

    private String id;
    private String buyerid;
    private Integer yob;
    private String gender;
    private String keywords;
    private String customdate;
    private Geo geo;
    private List<Data> data;
    private Object ext;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public String getBuyeruid() {
//        return buyeruid;
//    }
//
//    public void setBuyeruid(String buyeruid) {
//        this.buyeruid = buyeruid;
//    }

    public Integer getYob() {
        return yob;
    }

    public void setYob(Integer yob) {
        this.yob = yob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCustomdate() {
        return customdate;
    }

    public void setCustomdate(String customdate) {
        this.customdate = customdate;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }
}
