package com.swastik.model;

import java.io.Serializable;
import java.security.Timestamp;

public class CustomerOpenDao implements Serializable {

    private int customerId;
    private String password;
    private String name;
    private String father;
    private String mother;
    private String gender;
    private String dob;
    private String mobile;
    private String email;
    private String adhar;
    private Timestamp dateTime;
    private String pan;
    private String maritail;
    private String occupation;
    private String address;
    private String city;
    private String pincode;
    private String state;

    public Timestamp getRegiDate() {
        return dateTime;
    }

    public void setRegiDate(Timestamp regiDate) {
        this.dateTime = regiDate;
    }

    public String getMaritail() {
        return maritail;
    }

    public void setMaritail(String maritail) {
        this.maritail = maritail;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getPan() {
        return pan;
    }

    public CustomerOpenDao(String password, String name, String father, String mother, String gender, String dob, String mobile, String email, String adhar, String maritail, String occupation, String address, String city, String pincode, String state, String pan) {
        this.password = password;
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.gender = gender;
        this.dob = dob;
        this.mobile = mobile;
        this.email = email;
        this.adhar = adhar;
        this.maritail = maritail;
        this.occupation = occupation;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.pan = pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public CustomerOpenDao() {
    }
}