package com.example.BuySell.PART3.collection;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private Map<String, Object> map;
    private Properties properties;
    private Set set;
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("PART3/collection/app-context-xml.xml");
        CollectionInjection instance = (CollectionInjection)
                ctx.getBean("injectionCollection");
        instance.displayInfo();
        ctx.close();

    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void displayInfo(){
        System.out.println("Map contents:\n");
        map.entrySet().stream()
                .forEach(e-> System.out.println("Key: "
                + e.getKey() + " Value" + e.getValue()));

        System.out.println("\nProperties contents:\n");
        properties.entrySet().stream()
                .forEach(e-> System.out.println("Key: "
                        + e.getKey() + " Value " + e.getValue()));

        System.out.println("\nSet contents:\n");
        set.forEach(obj-> System.out.println("Value " + obj));

        System.out.println("\nlist contents:\n");
        list.forEach(obj-> System.out.println("Value " + obj));

    }
}
