package com.git.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO(String name, String salary) {
    }

    @Override
    public String toString() {
        return "\n name = " + name + "\n salary=" + salary;
    }

}
