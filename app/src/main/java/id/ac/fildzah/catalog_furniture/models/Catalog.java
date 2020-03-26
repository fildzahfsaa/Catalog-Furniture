package id.ac.fildzah.catalog_furniture.models;

public class Catalog {

    private String pict;
    private String name;

    public Catalog(String pict, String name) {
        this.pict = pict;
        this.name = name;
    }

    public String getPict() {
        return pict;
    }

    public void setPict(String pict) {
        this.pict = pict;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
