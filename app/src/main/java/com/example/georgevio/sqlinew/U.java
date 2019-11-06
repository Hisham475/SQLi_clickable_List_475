package com.example.georgevio.sqlinew;

/**
 * Created by Mitch on 2016-05-13.
 */
public class U {
    private String Name;
    private String Phone;
    private String Street;
    private String Place;
    private String Email;

    public U(String dName,String dPhone,String dEmail, String dStreet,String dPlace){
        Name = dName;
        Phone = dPhone;
        Street = dStreet;
        Place = dPlace;
        Place = dEmail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

}
