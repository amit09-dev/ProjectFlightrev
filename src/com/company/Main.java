package com.company;

class Employee {
    private int employeeCode;
    private String name;

    public Employee(int employeeCode, String name) {
        this.employeeCode = employeeCode;
        this.name = name;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SoftwareDeveloper extends Employee{

        String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public SoftwareDeveloper(int employeeCode, String name) {
        super(employeeCode, name);
    }
}

public class Main {

    public static void main(String[] args) {
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(1001, "Ishwar", "Java");
        System.out.println(softwareDeveloper.getDetails());
    }
	// write your code here


    }
}
