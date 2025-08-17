package model;

public class Product {
    private String name;
    private String type;
    private double quantity;

    public Product(String name, String type, double quantity){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double newQuantity){
        this.quantity = newQuantity;
    }

}
