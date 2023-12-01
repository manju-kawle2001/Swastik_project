package com.swastik.model;

import java.io.Serializable;

public class BranchDao implements Serializable {

<<<<<<< HEAD
    private String branchId;
=======
    private int branchId;
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    private String ifscCode;
    private String branchName;
    private String branchAddess;

<<<<<<< HEAD
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
=======
    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
        this.branchId = branchId;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddess() {
        return branchAddess;
    }

    public void setBranchAddess(String branchAddess) {
        this.branchAddess = branchAddess;
    }
}
