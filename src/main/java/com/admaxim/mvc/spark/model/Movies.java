package com.admaxim.mvc.spark.model;

public class Movies {

    private Long id;
    private String mName;
    private Categorys category;

    public Movies(Long id, String mName, Categorys category) {
        this.id = id;
        this.mName = mName;
        this.category = category;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getmName() { return mName; }
    public void setmName(String mName) { this.mName = mName; }

    public Categorys getCategory() { return category; }
    public void setCategory(Categorys category) { this.category = category; }

    @Override
    public String toString() {
        return "Movies{" + "id=" + id + ", mName='" + mName + '\'' + ", category=" + category + '}';
    }

}
