public class Food extends Menu {
    private Boolean kering;

    public Food(String nama, double harga, double diskon, Boolean kering) {
        super(nama,harga,diskon);
        this.kering = kering;
        this.nama += "; Kering: "+this.kering;
    }

    @Override
    public void tambahToping(String toping) {
        this.nama += "; Toping: "+toping;
    }

    public Boolean getKering() {
        return this.kering;
    }
}
