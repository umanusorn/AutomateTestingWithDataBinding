package com.umitems.espresso.automatetestingworkshop.models;

/**
 * Created by mariya on 7/2/2016 AD.
 */

public class DummyModel {
    public static final int MAX_DUMMY_DATA = 100;
    String name;

    public DummyModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
