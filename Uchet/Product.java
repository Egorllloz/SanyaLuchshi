package Uchet;

public class Product {
    private String name;
    private double cost;
    private String manufacturer;

    public Product(String name, double cost, String manufacturer){
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getName(){return name;}
    public double getCost(){return cost;}
    public String getManufacturer(){return manufacturer;}



}
