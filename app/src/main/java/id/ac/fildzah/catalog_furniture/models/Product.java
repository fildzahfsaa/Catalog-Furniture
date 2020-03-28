package id.ac.fildzah.catalog_furniture.models;

public class Product {

    private int pict;
    private String name;

    public Product(int pict, String name) {
        this.pict = pict;
        this.name = name;
    }

    public int getPict() {
        return pict;
    }

    public void setPict(int pict) {
        this.pict = pict;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
