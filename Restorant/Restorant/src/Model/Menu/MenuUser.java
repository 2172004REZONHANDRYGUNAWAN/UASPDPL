package Model.Menu;

public class MenuUser implements MenuInterface {
    private String nama;
    private int harga;
    private Menu toping;

    public MenuUser(String nama, int harga, Menu toping) {
        this.nama = nama;
        this.harga = harga;
        this.toping = toping;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public Menu getToping() {
        return toping;
    }
    public void setToping(Menu toping) {
        this.toping = toping;
    }
    
    @Override
    public String namaMenu() {
        return this.nama;
    }
    @Override
    public int hargaMenu() {
        return this.harga;
    }
}
