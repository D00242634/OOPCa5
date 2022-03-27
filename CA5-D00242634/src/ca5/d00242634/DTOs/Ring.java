package ca5.d00242634.DTOs;
public class Ring {

    private int ID;
    private double price;
    private String available;
    private String materials;
    private double sizes;

    public Ring(int ID, String available, String materials, double price, double sizes) {
        this.ID = ID;
        this.price = price;
        this.available = available;
        this.materials = materials;
        this.sizes = sizes;
    }

    public Ring(String available, String materials, double price, double sizes) {
        this.ID = 0;
        this.price = price;
        this.available = available;
        this.materials = materials;
        this.sizes = sizes;
    }

    public Ring() {
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSizes() {
        return sizes;
    }

    public void setSizes(double sizes) {
        this.sizes = sizes;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", price=" + price + ", materials="
                + materials + ", available=" + available + ", size=" + sizes + '}';
    }

}
