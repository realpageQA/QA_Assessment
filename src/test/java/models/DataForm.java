package models;

import java.util.List;

public class DataForm {

    private String FristName;
    private String LastName;
    private String Password;
    private String FirstNameAddress;
    private String LasNameAddress;
    private String Company;
    private String Address;
    private String Address2;
    private String City;
    private String Zip;
    private String Information;
    private String Phone;
    private String MobilePhone;
    private String Alias;


    public DataForm (List<String> data) {

        this.FristName=data.get(0);
        this.LastName=data.get(1);
        this.Password=data.get(2);
        this.FirstNameAddress=data.get(3);
        this.LasNameAddress=data.get(4);
        this.Company=data.get(5);
        this.Address=data.get(6);
        this.Address2=data.get(7);
        this.City=data.get(8);
        this.Zip=data.get(9);
        this.Information=data.get(10);
        this.Phone=data.get(11);
        this.MobilePhone=data.get(12);
        this.Alias=data.get(13);
    }


    public String getFristName() {
        return FristName;
    }


    public void setFristName(String fristName) {
        FristName = fristName;
    }


    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }


    public String getFirstNameAddress() {
        return FirstNameAddress;
    }


    public void setFirstNameAddress(String firstNameAddress) {
        FirstNameAddress = firstNameAddress;
    }


    public String getLasNameAddress() {
        return LasNameAddress;
    }


    public void setLasNameAddress(String lasNameAddress) {
        LasNameAddress = lasNameAddress;
    }


    public String getCompany() {
        return Company;
    }


    public void setCompany(String company) {
        Company = company;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public String getAddress2() {
        return Address2;
    }


    public void setAddress2(String address2) {
        Address2 = address2;
    }


    public String getCity() {
        return City;
    }


    public void setCity(String city) {
        City = city;
    }


    public String getZip() {
        return Zip;
    }


    public void setZip(String zip) {
        Zip = zip;
    }


    public String getInformation() {
        return Information;
    }


    public void setInformation(String information) {
        Information = information;
    }


    public String getPhone() {
        return Phone;
    }


    public void setPhone(String phone) {
        Phone = phone;
    }


    public String getMobilePhone() {
        return MobilePhone;
    }


    public void setMobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
    }


    public String getAlias() {
        return Alias;
    }


    public void setAlias(String alias) {
        Alias = alias;
    }


}

