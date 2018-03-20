package com.admaxim.mvc.mapping.response;

import java.util.List;

public class SeatBid {
    
    private List<Bid> bid;
    private String seat;
    private Integer group;
    private Object ext;


    public List<Bid> getBid() {
        return bid;
    }
    public void setBid(List<Bid> bid) {
        this.bid = bid;
    }

    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Integer getGroup() {
        return group;
    }
    public void setGroup(Integer group) {
        this.group = group;
    }

    public Object getExt() {
        return ext;
    }
    public void setExt(Object ext) {
        this.ext = ext;
    }

}
