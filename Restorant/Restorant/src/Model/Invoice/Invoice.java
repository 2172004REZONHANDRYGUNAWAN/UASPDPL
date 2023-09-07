package Model.Invoice;

import Model.Menu.MenuUser;

public class Invoice implements InvoiceVisitor {
    @Override
    public String getNamaMenu(MenuUser menuUser) {
        String nama = menuUser.namaMenu();
        if (menuUser.getToping().getIdMenu() != 0) {
            nama = nama + "dengan toping " + menuUser.getToping().namaMenu();
        }
        return nama;
    };

    @Override
    public int getHargaMenu(MenuUser menuUser) {
        int harga = menuUser.hargaMenu();
        if (menuUser.getToping().getIdMenu() != 0) {
            harga += menuUser.getToping().hargaMenu();
        }
        return harga;
    };

    @Override
    public int getTotal(MenuUser[] menuUser, int index){
        int total = 0;
        for (int i = 0; i < index; i++) {
            if (menuUser[i].getToping().getIdMenu() != 0) {
                total += menuUser[i].getToping().hargaMenu();
            }
            total += menuUser[i].hargaMenu();
        }
        return total;
    }
}
