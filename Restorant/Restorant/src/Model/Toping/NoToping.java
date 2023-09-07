package Model.Toping;

import Model.Menu.Menu;
import Model.Menu.MenuUser;

public class NoToping implements AddMenu {
    @Override
    public MenuUser addToping (String nama, int harga) {
        Menu noToping = new Menu(0, "No Toping", 0, false);
        MenuUser menuUser = new MenuUser(nama, harga, noToping);
        return menuUser;
    }
}
