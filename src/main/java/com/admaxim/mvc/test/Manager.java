package com.admaxim.mvc.test;

public class Manager extends Employee {

    public void setSalary(Integer salary) {
        System.out.println("Manager.setSalary():" + salary);
    }

    public static void main(String[] args) {
        Employee ken = new Manager();
        Integer salary = 200;
        ken.setSalary(salary);
    }


}
