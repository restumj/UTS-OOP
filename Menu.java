public class Menu {
    protected String nama;
    protected double harga;
    protected double diskon;

    public Menu(String nama, double harga, double diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    public void tambahToping(String toping) {
        this.nama += "; Toping: -";
    }

    public String getNama() {
        return this.nama;
    }
    public double getHarga() {
        return this.harga;
    }
    public double getDiskon() {
        return this.diskon;
    }
}