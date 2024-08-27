package com.demo.beans;

public class Address {
    private int houseNo;
    private String cityStreet;
    private String city;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCityStreet() {
        return cityStreet;
    }

    public void setCityStreet(String cityStreet) {
        this.cityStreet = cityStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", cityStreet='" + cityStreet + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
