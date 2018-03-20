package com.admaxim.mvc.mapping;

import com.admaxim.mvc.mapping.response.SeatBid;

import java.util.List;

/**
 * <h1>RtbResponse</h1>
 * <p>
 * The @class RtbResponse Will Send the "OPEN-RTB-RESPONSE" after the "OPEN-RTB-REQUEST"
 * Process.
 * </p>
 *
 * @author  Nabeel Ahmed
 * @version 1.0
 * @since   2016-03-12
 *
 *
 */
// rtb-2.3
public class RtbResponse {


    private  String id;
    private List<SeatBid> seatbid;
    private  String bidid;
    private  String cur;
    private  String customdata;
    private  Integer nbr;
    private  Object ext;


    /**
     * Get Id method is used to get Id of RTB-RESPONSE
     * @return id This returns id of RTB-RESPONSE.
     */
    public String getId() {
        return id;
    }

    /**
     * This method is used to set id. This is
     * a the simplest form of a class method, just to
     * @param id This "id" used as parameter assign
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get seatbid method is used to get seatbid of RTB-RESPONSE
     * @return seatbid This returns seatbid of RTB-RESPONSE.
     */
    public List<SeatBid> getSeatbid() {
        return seatbid;
    }

    /**
     * This method is used to set seatbid. This is
     * a the simplest form of a class method, just to
     * @param seatbid This "seatbid" used as parameter assign
     */
    public void setSeatbid(List<SeatBid> seatbid) {
        this.seatbid = seatbid;
    }

    public String getBidid() {
        return bidid;
    }

    public void setBidid(String bidid) {
        this.bidid = bidid;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getCustomdata() {
        return customdata;
    }

    public void setCustomdata(String customdata) {
        this.customdata = customdata;
    }

    public Integer getNbr() {
        return nbr;
    }

    public void setNbr(Integer nbr) {
        this.nbr = nbr;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}
