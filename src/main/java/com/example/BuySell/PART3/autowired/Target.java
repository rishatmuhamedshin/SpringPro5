package com.example.BuySell.PART3.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {

    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public Target(){
    }

    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo,Bar) called");
    }

    public Target(Foo foo){
        System.out.println("Target(Foo) called");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("PART3/autowired/app-context-xml.xml");
        Target t = null;

        System.out.println("Using byName");
        t = (Target) ctx.getBean("targetByName");


        System.out.println("Using Constructor");
        t = (Target) ctx.getBean("targetByConstructor");

        System.out.println("Using byType");
        t = (Target) ctx.getBean("targetByType");


        ctx.close();
    }
}
