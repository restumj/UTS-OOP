public class Customer {
    private String noHp;
    private String nama;
    private Order order;

    public Customer(String noHp, String nama) {
        this.noHp = noHp;
        this.nama = nama;
    }
    

    public Order buatOrder(double pajak) {
        this.order = new Order(this, pajak);
        return this.order;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNoHp() {
        return this.noHp;
    }
}