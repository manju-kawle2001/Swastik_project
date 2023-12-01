package com.swastik.model;

import java.io.Serializable;
import java.security.Timestamp;

public class ManagerInformationDao implements Serializable {

    private int adminId;
    private String password;
    private String name;
    private String email;
    private String dob;
    private Timestamp doh;
<<<<<<< HEAD
    private String salary;
=======
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    private String mobile;

    public Timestamp getDoh() {
        return doh;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    public void setDoh(Timestamp doh) {
        this.doh = doh;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
<<<<<<< HEAD
    
     public String getSalary() {
        return salary;
    }

    public void setSalary(String mobile) {
        this.salary = salary;
    }

    
=======

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
