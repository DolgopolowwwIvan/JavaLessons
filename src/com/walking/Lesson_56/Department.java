package com.walking.Lesson_56;

import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;
    private int vacancyAmount;

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getVacancyAmount() {
        return vacancyAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setVacancyAmount(int vacancyAmount) {
        this.vacancyAmount = vacancyAmount;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", vacancyAmount=" + vacancyAmount +
                '}';
    }
}
