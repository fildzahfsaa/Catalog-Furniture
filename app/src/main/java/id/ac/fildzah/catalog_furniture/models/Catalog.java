package id.ac.fildzah.catalog_furniture.models;

public class Catalog {

    private int pict;
    private String name;
    private String RowID;

    public Catalog(int pict, String name, String rowID) {
        this.pict = pict;
        this.name = name;
        this.RowID = rowID;
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

    public String getRowID() {
        return RowID;
    }

    public void setRowID(String rowID) {
        RowID = rowID;
    }




}
