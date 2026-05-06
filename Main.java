// Nama: I Made Restu Manujaya
// NIM: 2515101030
// Kelas: Ilkom A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan No.HP: ");
        String noHp = input.nextLine();

        Customer cust = new Customer(noHp, nama);
        Order order = cust.buatOrder(5000);

        Menu biskuit = new Food("Biskuit",10000,1000,true);
        biskuit.tambahToping("cokelat");
        Menu esAlpukat = new Drink("Es Alpukat",20000,1000,true);
        esAlpukat.tambahToping("chocolatos");
        Menu kue = new Food("Kue Ulang Tahun",200000, 0, false);
        order.tambahBarang(biskuit);
        order.tambahBarang(kue);
        order.tambahBarang(esAlpukat);

        order.tampilkanBarang();

        Boolean running=true;
        while (running) {
            System.out.print("Masukkan produk (-1 untuk keluar): ");
            int no = input.nextInt();
            switch (no) {
                case 1:
                    order.tambahItem(biskuit);
                    break;
                case 2:
                    order.tambahItem(esAlpukat);
                    break;
                case 3:
                    order.tambahItem(kue);
                    break;
                case -1:
                    running=false;
            
                default:
                    break;
            }

        }
        

        order.tampikanTransaksi();
        System.out.print("Masukkan bayaran: ");
        double bayaran = input.nextDouble();
        order.bayar(bayaran,order.hitungTotal());

        input.close();
    }
}