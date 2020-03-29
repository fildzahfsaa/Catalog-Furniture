package id.ac.fildzah.catalog_furniture.models;

public class Product {

    private static int pict;
    private static String name;
    private static String kode;
    private static String warna;
    private static String harga;

    public Product(int pict, String name, String kode, String warna, String harga) {
        this.pict = pict;
        this.name = name;
        this.kode = kode;
        this.warna = warna;
        this.harga = harga;
    }

    public Product() {

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

    public static String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public static String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public static String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


}
