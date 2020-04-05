package id.ac.fildzah.catalog_furniture.models;

public class Product {

    private int pict;
    private String name;
    private String kode;
    private String warna;
    private String harga;

    public Product(int pict, String name, String kode, String warna, String harga) {
        this.pict = pict;
        this.name = name;
        this.kode = kode;
        this.warna = warna;
        this.harga = harga;
    }

    public Product() {

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

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


}
