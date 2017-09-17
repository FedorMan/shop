package com.shop.entity;

import javax.persistence.Entity;

/**
 * Created by Равиль on 17.09.2017.
 */
@Entity
public class Client {

    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private String password;

    public Client(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Client(String firstName, String lastName, String email, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
