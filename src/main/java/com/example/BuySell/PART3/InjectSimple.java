package com.example.BuySell.PART3;

import org.springframework.stereotype.Component;

@Component("InjectSimple")
public class InjectSimple {

    private int age = 10;
    private String name = "Ришат";
    private int height = 123;
    private String city = "город";

    @Override
    public String toString() {
        return "InjectSimple{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", city='" + city + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
