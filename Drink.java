public class Drink extends Menu {
    private Boolean dingin;

    public Drink(String nama, double harga, double diskon, Boolean dingin) {
        super(nama,harga,diskon);
        this.dingin = dingin;
        this.nama += "; Dingin: "+dingin;
    }

    @Override
    public void tambahToping(String toping) {
        this.nama += "; Toping: "+toping;
    }

    public Boolean getDingin() {
        return this.dingin;
    }
}
