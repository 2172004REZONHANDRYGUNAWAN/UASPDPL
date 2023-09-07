package Model.Toping;

import Model.Menu.Menu;
import Model.Menu.MenuUser;

public class Gehu implements AddMenu {
    @Override
    public MenuUser addToping (String nama, int harga) {
        Menu gehu = new Menu(10, "Gehu", 1700, true);
        MenuUser menuUser = new MenuUser(nama, harga, gehu);
        return menuUser;
    }
}
