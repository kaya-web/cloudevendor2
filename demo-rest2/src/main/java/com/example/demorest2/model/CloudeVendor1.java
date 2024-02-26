package com.example.demorest2.model;

public class CloudeVendor1
{
    private String Id;
    private String Name;
    private String PhoneNo;
    private String Address;

    public CloudeVendor1()
    {
    }

    public CloudeVendor1(String id, String name, String phoneNo, String address)
    {
        Id = id;
        Name = name;
        PhoneNo = phoneNo;
        Address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}
