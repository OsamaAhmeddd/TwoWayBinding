package com.osama.twowaybindingexample;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {

    private String name;
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.osama.twowaybindingexample.BR.email);
    }
}