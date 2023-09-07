package Model.Toping;

import Model.Menu.Menu;
import Model.Menu.MenuUser;

public class BalaBala implements AddMenu {
    @Override
    public MenuUser addToping (String nama, int harga) {
        Menu balaBala = new Menu(9, "Bala-Bala", 1500, true);
        MenuUser menuUser = new MenuUser(nama, harga, balaBala);
        return menuUser;
    }
}
