package com.umitems.espresso.automatetestingworkshop.models;

/**
 * Created by mariya on 7/2/2016 AD.
 */

public class User {
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;
    private String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

}