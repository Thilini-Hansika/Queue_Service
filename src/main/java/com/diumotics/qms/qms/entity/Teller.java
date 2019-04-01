package com.diumotics.qms.qms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Thilini Hansika on 3/14/2019.
 */
@Entity
public class Teller {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int lid;
    private String userName;
    private String brancName;
    private String language;
    private String email;
    private String contactNo;
    private String password;
    private String address;
    private String date;

    public Teller() {
    }

    public Teller(String userName) {
        this.userName = userName;
    }

    public Teller(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Teller( String userName, String brancName, String language, String email, String contactNo, String password, String address, String date) {
//        this.lid = lid;
        this.userName = userName;
        this.brancName = brancName;
        this.language = language;
        this.email = email;
        this.contactNo = contactNo;
        this.password = password;
        this.address = address;
        this.date = date;
    }

//    public int getLid() {
//        return lid;
//    }
//
//    public void setLid(int lid) {
//        this.lid = lid;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBrancName() {
        return brancName;
    }

    public void setBrancName(String brancName) {
        this.brancName = brancName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Teller{" +
                "userName='" + userName + '\'' +
                ", brancName='" + brancName + '\'' +
                ", language='" + language + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
