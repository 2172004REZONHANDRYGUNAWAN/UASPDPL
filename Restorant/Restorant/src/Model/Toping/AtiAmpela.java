package Model.Toping;

import Model.Menu.Menu;
import Model.Menu.MenuUser;

public class AtiAmpela implements AddMenu {
    @Override
    public MenuUser addToping (String nama, int harga) {
        Menu atiAmpela = new Menu(11, "Ati & Ampela", 3700, true);
        MenuUser menuUser = new MenuUser(nama, harga, atiAmpela);
        return menuUser;
    }
}
