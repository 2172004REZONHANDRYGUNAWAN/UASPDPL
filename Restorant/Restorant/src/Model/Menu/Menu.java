package Model.Menu;
public class Menu implements MenuInterface {
    private int idMenu;
    private String nama;
    private int harga;
    private boolean makanan;

    public Menu(int idMenu, String nama, int harga, boolean makanan) {
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
        this.makanan = makanan;
    }

    public int getIdMenu() {
        return idMenu;
    }
    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public boolean isMakanan() {
        return makanan;
    }
    public void setMakanan(boolean makanan) {
        this.makanan = makanan;
    }

    @Override
    public String namaMenu() {
        return this.nama;
    }
    @Override
    public int hargaMenu() {
        return this.harga;
    }
    public String toString(){
        return (idMenu + ". " + nama + "   Rp." + harga);
     }
}
