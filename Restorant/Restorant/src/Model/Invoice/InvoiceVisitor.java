package Model.Invoice;

import Model.Menu.MenuUser;

public interface InvoiceVisitor {
    public String getNamaMenu(MenuUser menuUser);
    public int getHargaMenu(MenuUser menuUser);
    public int getTotal(MenuUser[] menuUser, int index);
}
