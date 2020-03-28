package id.ac.fildzah.catalog_furniture.models;

public class Catalog {

    private static int pict;
    private static String name;

    public Catalog(int pict, String name) {
        this.pict = pict;
        this.name = name;
    }

    public static int getPict() {
        return pict;
    }

    public void setPict(int pict) {
        this.pict = pict;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
