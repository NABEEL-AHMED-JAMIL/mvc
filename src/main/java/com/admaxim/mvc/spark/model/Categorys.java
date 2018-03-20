package com.admaxim.mvc.spark.model;

import java.util.List;

public class Categorys {

    private Long id;
    private String type;
    private List<Movies> movies;

    public Categorys(Long id, String type, List<Movies> movies) {
        this.id = id;
        this.type = type;
        this.movies = movies;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public List<Movies> getMovies() { return movies; }
    public void setMovies(List<Movies> movies) { this.movies = movies; }

    @Override
    public String toString() {
        return "Categorys{" + "id=" + id +
                ", type='" + type + '\'' + ", movies=" + movies + '}';
    }
}
