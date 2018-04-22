package com.company.standard;


public class Student {
    private String name;
    private String num;
    private String email;

    public Student(String num, String name,  String email) {
        this.name = name;
        this.num = num;
        this.email = email;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String toLine()  {
        return num+ "   "+ name + "   "+email;
    }
}
