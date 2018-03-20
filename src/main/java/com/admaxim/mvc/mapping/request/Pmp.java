package com.admaxim.mvc.mapping.request;

import java.util.List;

// rtb-2.3
public class Pmp {

    private Integer private_auction;
    private List<Deal> deals;
    private Object ext;

    public Integer getPrivate_auction() {
        return private_auction;
    }

    public void setPrivate_auction(Integer private_auction) {
        this.private_auction = private_auction;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}
