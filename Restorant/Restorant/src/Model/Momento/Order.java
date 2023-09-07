package Model.Momento;

import Model.Menu.MenuUser;

public class Order {
    public MenuUser menuUser;

    public void set(MenuUser menuUser) {
        this.menuUser = menuUser;
    }
    public Memento saveOrder() {
        return new Memento(menuUser);
    }
    public void undoOrder(Memento memento) {
        menuUser = memento.getSavedOrder();
    }
  
    public class Memento {
        private final MenuUser menuUser;
  
        public Memento(MenuUser saveMenuUser) {
            menuUser = saveMenuUser;
        }
  
        public MenuUser getSavedOrder() {
            return menuUser;
        }
    }
}
