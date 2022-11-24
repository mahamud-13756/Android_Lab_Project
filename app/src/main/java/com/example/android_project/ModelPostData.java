package com.example.android_project;

public class ModelPostData
{
    int studentID,contact;
    String name,email,batchNo,address;

    public ModelPostData(int studentID, int contact, String name, String email, String batchNo, String address) {
        this.studentID = studentID;
        this.contact = contact;
        this.name = name;
        this.email = email;
        this.batchNo = batchNo;
        this.address = address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
