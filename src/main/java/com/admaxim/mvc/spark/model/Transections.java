package com.admaxim.mvc.spark.model;

public class Transections {

    private Customer customer;
    private Movies movies;
    private Legend legend;

    public Transections(Customer customer, Movies movies, Legend legend) {
        this.customer = customer;
        this.movies = movies;
        this.legend = legend;
    }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Movies getMovies() { return movies; }
    public void setMovies(Movies movies) { this.movies = movies; }

    public Legend getLegend() { return legend; }
    public void setLegend(Legend legend) { this.legend = legend; }

    @Override
    public String toString() {
        return "Transections{" + "customer=" + customer +
                ", movies=" + movies + ", legend=" + legend + '}';
    }
}
