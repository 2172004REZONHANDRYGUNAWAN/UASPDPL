package Main;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Model.Invoice.Invoice;
import Model.Menu.Menu;
import Model.Menu.MenuUser;
import Model.Momento.Order;
import Model.Toping.*;


public class utama {
    public static MenuUser tambahToping(Menu menu) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        
        NoToping noToping = new NoToping();
        MenuUser menuUser = noToping.addToping(menu.namaMenu(), menu.hargaMenu());
        String keputusan="Y";
        System.out.print("Apakah anda ingin Menambah Gorengan ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                System.out.println("Gagal Membaca Keyboard");
            }

            if (keputusan.equals("Y")||keputusan.equals("y")) {
                System.out.println("Tambahan Gorengan");
                System.out.println("----------------------------");
                System.out.println("1. Bala - bala    = Rp 1500");
                System.out.println("2. Gehu           = Rp 1700");
                System.out.println("3. Ati & Ampela   = Rp 3700");
                System.out.println("4. Usus           = Rp 1600");

                System.out.print("Pilihan menu anda  = ");
                int pilGorengan = input.nextInt();
                if (pilGorengan==1){
                    BalaBala balaBala= new BalaBala();
                    menuUser = balaBala.addToping(menu.namaMenu(), menu.hargaMenu());
                } else if (pilGorengan==2) {
                    Gehu gehu = new Gehu();
                    menuUser = gehu.addToping(menu.namaMenu(), menu.hargaMenu());
                } else if (pilGorengan==3) {
                    AtiAmpela atiAmpela = new AtiAmpela();
                    menuUser = atiAmpela.addToping(menu.namaMenu(), menu.hargaMenu());
                } else if (pilGorengan==4) {
                    Usus usus = new Usus();
                    menuUser = usus.addToping(menu.namaMenu(), menu.hargaMenu());
                }
            }
        return menuUser;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        MenuUser menuUser[] = new MenuUser[100];
        Menu menu[] = {
            new Menu(1, "Nasi Goreng", 15000, true),
            new Menu(2, "Mie Goreng", 17000, true),
            new Menu(3, "Bihun Goreneg", 17000, true),
            new Menu(4, "Capcay", 16000, true),
            new Menu(5, "Jus Jeruk", 5000, false),
            new Menu(6, "Es Teh Manis", 5000, false),
            new Menu(7, "Es Teh Tawar", 3500, false),
            new Menu(8, "Nutri sari", 5500, false)
        };
        String keputusan="Y";

        System.out.println("Daftar Menu Makanan ");
        for (int j = 0; j < menu.length; j++) {
            System.out.println(menu[j].toString());
        }
        System.out.println(9 + ". Undo");

        while (keputusan.equals("Y")||keputusan.equals("y")) {
            Order.Memento memento;
            Order order = new Order();
            order.set(menuUser[i]);
            order.saveOrder();
            memento = order.saveOrder();

            System.out.print("Pilihan menu anda  = ");
            int pil = input.nextInt();
            
            if (pil==1){
                if (menu[0].isMakanan()) {
                    menuUser[i] = tambahToping(menu[0]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[0].namaMenu(), menu[0].hargaMenu(), temp);
                }
            } else if (pil==2) {
                if (menu[1].isMakanan()) {
                    menuUser[i] = tambahToping(menu[1]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[1].namaMenu(), menu[1].hargaMenu(), temp);
                }
            } else if (pil==3) {
                if (menu[2].isMakanan()) {
                    menuUser[i] = tambahToping(menu[2]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[2].namaMenu(), menu[2].hargaMenu(), temp);
                }
            } else if (pil==4) {
                if (menu[3].isMakanan()) {
                    menuUser[i] = tambahToping(menu[3]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[3].namaMenu(), menu[3].hargaMenu(), temp);
                }
            } else if (pil==5) {
                if (menu[4].isMakanan()) {
                    menuUser[i] = tambahToping(menu[i]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[4].namaMenu(), menu[4].hargaMenu(), temp);
                }
            } else if (pil==6) {
                if (menu[5].isMakanan()) {
                    menuUser[i] = tambahToping(menu[i]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[5].namaMenu(), menu[5].hargaMenu(), temp);
                }
            } else if (pil==7) {
                if (menu[6].isMakanan()) {
                    menuUser[i] = tambahToping(menu[i]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[6].namaMenu(), menu[6].hargaMenu(), temp);
                }
            } else if (pil==8) {
                if (menu[7].isMakanan()) {
                    menuUser[i] = tambahToping(menu[i]);
                } else {
                    Menu temp = new Menu(0, "No Toping", 0, false);
                    menuUser[i] = new MenuUser(menu[7].namaMenu(), menu[7].hargaMenu(), temp);
                }
            } else if (pil==9) {
                i--;
                order.undoOrder(memento);
                menuUser[i] = order.menuUser;
            } else {
                System.out.println("Maaf pilihan menu anda tidak tepat ");
                menuUser[i].setNama("-");
                menuUser[i].setHarga(0);
            }

            System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            if (pil!=9) {
                System.out.println("Menu yang anda pesan adalah          : "+menuUser[i].namaMenu());
                System.out.println("Harga yang harus dibayar             : "+menuUser[i].hargaMenu());
                
                System.out.println("Toping yang anda pesan adalah        : "+menuUser[i].getToping().namaMenu());
                System.out.println("Harga Toping yang harus dibayar      : "+menuUser[i].getToping().hargaMenu());
                i++;
            }
        }

        System.out.println("");
        System.out.println("Menu yang anda pesan adalah          : "+i);
        Invoice invoice = new Invoice();
        for (int a = 0; a<i;a++){
            System.out.println(invoice.getNamaMenu(menuUser[a]) + " Seharga    Rp." + invoice.getHargaMenu(menuUser[a]));
        }
        System.out.println("");
        System.out.println("Total yang harus anda bayar adalah   : Rp."+invoice.getTotal(menuUser, i));
    }
}
