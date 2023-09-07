package Model.Toping;

import Model.Menu.Menu;
import Model.Menu.MenuUser;

public class Usus implements AddMenu {
    @Override
    public MenuUser addToping (String nama, int harga) {
        Menu usus = new Menu(12, "Usus", 1500, true);
        MenuUser menuUser = new MenuUser(nama, harga, usus);
        return menuUser;
    }
}
