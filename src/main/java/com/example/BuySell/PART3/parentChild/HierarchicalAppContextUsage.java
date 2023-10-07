package com.example.BuySell.PART3.parentChild;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String... args) {
        GenericXmlApplicationContext parent =new GenericXmlApplicationContext();
        parent.load("PART3/annotation/parent-context.xml");
        parent.refresh();

        GenericXmlApplicationContext child =new GenericXmlApplicationContext();
        child.load("PART3/annotation/child-context.xml");
        child.setParent(parent);
        child.refresh();

        Song song1 = (Song) child.getBean("song1");
        Song song2 = (Song) child.getBean("song2");
        Song song3 = (Song) child.getBean("song3");

        System.out.println("from parent ctx:" + song1.getTitle());
        System.out.println("from child ctx:" + song2.getTitle());
        System.out.println("from parent ctx:" + song3.getTitle());

        child.close();
        parent.close();
    }
}
