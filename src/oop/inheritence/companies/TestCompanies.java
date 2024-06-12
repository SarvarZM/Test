package oop.inheritence.companies;

public class TestCompanies {
    public static void main(String[] args) {

        Company company = new Company();
        Apple apple = new Apple();
         Google google = new Google();

        System.out.println(google
                .isHiring());
    }
}