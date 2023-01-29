package com.company.enums.review;

public class User {

    public String username;
    public String firstName;
    public String lastName;

    //public String role;

    public Role role;

    public User(String username, String firstName, String lastName, Role role) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
