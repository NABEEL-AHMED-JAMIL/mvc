package com.admaxim.mvc.spark.model;

public enum Legend {

    ONE(1L),TWO(2L),THREE(3L),FOUR(4L),FIVE(5L);

    private Long rateting;

    Legend(Long rateting) { this.rateting = rateting; }

    public Long getRateting() { return rateting; }
    public void setRateting(Long rateting) { this.rateting = rateting; }

    @Override
    public String toString() {
        return "Legend{" + "rateting=" + rateting + '}';
    }
}
