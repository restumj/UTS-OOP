import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Menu> ListBelanja;
    private List<Menu> ListBarang;
    private double pajak;

    public Order(Customer customer, double pajak) {
        this.customer = customer;
        this.pajak = pajak;
        this.ListBelanja = new ArrayList<>();
        this.ListBarang = new ArrayList<>();
    }

    public void tambahItem(Menu menu) {
        ListBelanja.add(menu);
        System.out.println("Produk berhasil ditambahkan: "+menu.getNama());
    }
    public double hitungTotal() {
        double total=0;
        for (Menu menu : ListBelanja) {
            total += menu.getHarga() - menu.getDiskon();
        }
        return total+this.pajak;
    }
    public void tampikanTransaksi() {
        int no=1;
        System.out.println("\n== Transaksi ==");
        System.out.println("Pembeli: "+this.customer.getNama());
        System.out.println("No. Hp: "+this.customer.getNoHp());
        for (Menu menu : ListBelanja) {
            System.out.println("Produk "+(no++)+")");
            System.out.println("- Nama: "+menu.getNama());
            System.out.println("- Harga: "+menu.getHarga());
            System.out.println("- Diskon: "+menu.getDiskon());
        }
        System.out.println("Pajak: "+this.pajak);
        System.out.println("Total Belanja: "+hitungTotal());
    }
    public void bayar(double bayaran, double total) {
        System.out.println();
        if (bayaran >= total) {
            System.out.println("Kembalian: "+(bayaran-total));
            System.out.println("Bayaran anda mencukupi!\nTerima kasih sudah belanja.");
        } else {
            System.out.println("Bayaran anda tidak mencukupi!\nPesanan gagal dibeli.");
        }
    }
    public void tambahBarang(Menu menu) {
        ListBarang.add(menu);
    }
    public void tampilkanBarang() {
        int no=1;
        System.out.println("\n== Menu ==");
        for (Menu menu : ListBarang) {
            System.out.println("No "+(no++)+")");
            System.out.println("- nama: "+menu.getNama());
            System.out.println("- harga: "+menu.getHarga());
        }
        System.out.println();
    }
}