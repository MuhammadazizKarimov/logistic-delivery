package model;

public class Customer {
    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address){
        this.name = name;
        this.address =address;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }


}
