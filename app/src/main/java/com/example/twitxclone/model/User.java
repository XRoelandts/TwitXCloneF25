package com.example.twitxclone.model;

public class User {

    static final String N_KEY = "EMAILV";
    static final String DOB_KEY = "DOBV";

   String email;
    String dob;


    public void setName(String email) {
        this.email = email;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }


    public String getDOB() {
        return dob;
    }
}
