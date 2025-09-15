package com.walking.Lesson_56;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();

        // Департамент 1: IT Department
        Department itDepartment = new Department();
        itDepartment.setName("CIT Department");
        itDepartment.setVacancyAmount(2);
        itDepartment.setEmployees(new ArrayList<>());

        // Добавляем сотрудников в IT Department
        itDepartment.getEmployees().add(new Employee("Anna", false, "QA Engineer", 25));
        itDepartment.getEmployees().add(new Employee("Dmitry", true, "Senior Developer", 35));
        itDepartment.getEmployees().add(new Employee("Pavel", true, "DevOps", 29));
        itDepartment.getEmployees().add(new Employee("Svetlana", false, "Analyst", 31));
        itDepartment.getEmployees().add(new Employee("Maxim", true, "Team Lead", 40));
        itDepartment.getEmployees().add(new Employee("Ivan", true, "Junior Developer", 23));
        itDepartment.getEmployees().add(new Employee("Ekaterina", false, "HR Manager", 28));
        itDepartment.getEmployees().add(new Employee("Sergey", true, "Middle Developer", 32));
        itDepartment.getEmployees().add(new Employee("Olga", false, "Accountant", 45));
        itDepartment.getEmployees().add(new Employee("Mikhail", true, "SysAdmin", 38));
        itDepartment.getEmployees().add(new Employee("Natalia", false, "Sales Manager", 27));
        itDepartment.getEmployees().add(new Employee("Alexey", true, "Director", 50));

        // Департамент 2: Sales Department
        Department salesDepartment = new Department();
        salesDepartment.setName("BSales Department");
        salesDepartment.setVacancyAmount(1);
        salesDepartment.setEmployees(new ArrayList<>());

        // Добавляем сотрудников в Sales Department
        salesDepartment.getEmployees().add(new Employee("Andrey", true, "Sales Manager", 26));
        salesDepartment.getEmployees().add(new Employee("Elena", false, "Director", 48));
        salesDepartment.getEmployees().add(new Employee("Konstantin", true, "Sales Manager", 33));
        salesDepartment.getEmployees().add(new Employee("Tatyana", false, "Accountant", 41));
        salesDepartment.getEmployees().add(new Employee("Alexander", true, "Senior Developer", 37));
        salesDepartment.getEmployees().add(new Employee("Irina", false, "HR Manager", 30));
        salesDepartment.getEmployees().add(new Employee("Maxim", true, "Sales Manager", 28));
        salesDepartment.getEmployees().add(new Employee("Maria", false, "Analyst", 29));
        salesDepartment.getEmployees().add(new Employee("Dmitry", true, "Team Lead", 42));
        salesDepartment.getEmployees().add(new Employee("Yulia", false, "Sales Manager", 24));

        // Департамент 3: HR Department
        Department hrDepartment = new Department();
        hrDepartment.setName("AHR Department");
        hrDepartment.setVacancyAmount(0);
        hrDepartment.setEmployees(new ArrayList<>());

        // Добавляем сотрудников в HR Department
        hrDepartment.getEmployees().add(new Employee("Ekaterina", false, "HR Manager", 32));
        hrDepartment.getEmployees().add(new Employee("Sergey", true, "Director", 51));
        hrDepartment.getEmployees().add(new Employee("Anna", false, "HR Manager", 27));
        hrDepartment.getEmployees().add(new Employee("Pavel", true, "Accountant", 39));
        hrDepartment.getEmployees().add(new Employee("Olga", false, "HR Manager", 36));
        hrDepartment.getEmployees().add(new Employee("Ivan", true, "Analyst", 31));
        hrDepartment.getEmployees().add(new Employee("Natalia", false, "HR Manager", 29));
        hrDepartment.getEmployees().add(new Employee("Andrey", true, "Sales Manager", 34));

        // Добавляем все департаменты в список
        departments.add(itDepartment);
        departments.add(salesDepartment);
        departments.add(hrDepartment);

        //Предоставьте список всех сотрудников компании.
        System.out.println("------Задача_1------");

        departments.forEach(System.out::println);

        //Предоставьте полный перечень оригинальных имен сотрудников компании.
        System.out.println("------Задача_2------");

        List<Employee> allEmployee = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .toList();
        allEmployee.stream().map(employee -> employee.getName()).distinct().forEach(System.out::println);

        //Предоставьте полный перечень оригинальных имен сотрудников по каждому департаменту.
        System.out.println("------Задача_3------");

        departments.forEach(department -> {
            System.out.println(department.getName());
            department.getEmployees().stream()
                    .toList()
                    .stream()
                    .map(Employee::getName)
                    .distinct()
                    .forEach(System.out::println);
        });

        //Предоставьте список всех департаментов в алфавитном порядке в виде LinkedList
        System.out.println("------Задача_4------");

        departments.stream()
                .map(Department::getName)
                .sorted()
                .toList()
                .forEach(System.out::println);

        //Предоставьте самого старшего обладателя каждого из имен. Попробуйте сделать это без использования downstream.
        System.out.println("------Задача_5------");

        departments.stream()
                .flatMap(department -> department.getEmployees()
                        .stream()).collect(Collectors.toMap(
                                Employee::getName,
                                employee -> employee,
                                (existing, replacement) ->
                                        existing.getAge() > replacement.getAge() ? existing : replacement
                        ))
                .values()
                .forEach(employee -> System.out.println(employee.getName() + ": " + employee.getAge()));

        //Предоставьте информацию о проценте открытых вакансий относительно текущего числа сотрудников по каждому департаменту.
        System.out.println("------Задача_6------");
        

    }
}
