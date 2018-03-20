package com.admaxim.mvc.mapping.request;


import java.util.List;


// rtb-2.3
public class Data {

    private String id;
    private String name;
    private List<Segment> segment;
    private Object ext;


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Segment> getSegment() { return segment; }
    public void setSegment(List<Segment> segment) { this.segment = segment; }

    public Object getExt() { return ext; }
    public void setExt(Object ext) { this.ext = ext; }


}
