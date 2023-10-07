package com.example.BuySell.PART3.collection;

public class LyricHolder implements ContentHolder{

    private String value = "You be the DJ, I'll be the driver";

    @Override
    public String toString() {
        return "LyricHolder: " + "{ "+ value  + " }";
    }
}
