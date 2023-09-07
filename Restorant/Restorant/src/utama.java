/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class utama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        int hargatotal = 0;
        int penampung = 0;
        String menu[] = new String [100];
        int harga[] = new int [100];
        String keputusan="Y";

        System.out.println("Daftar Menu Makanan ");
        System.out.println("----------------------------- ");
        System.out.println("1. Nasi Goreng     = Rp 15000 ");
        System.out.println("2. Mie Goreng      = Rp 17000 ");
        System.out.println("3. Bihun Goreneg   = Rp 17000 ");
        System.out.println("4. Capcay          = Rp 16000" );
        System.out.println("Daftar Menu Minuman ");
        System.out.println("----------------------------- ");
        System.out.println("5. Jus Jeruk        = Rp 5000 ");
        System.out.println("6. Es Teh Manis     = Rp 5000 ");
        System.out.println("7. Es Teh Tawar     = Rp 3500 ");
        System.out.println("8. Nutri sari       = Rp 5500");

        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
        System.out.print("Pilihan menu anda  = ");
        int pil = input.nextInt();
        if (pil==1){
            menu[i] = "Nasi Goreng";
            harga[i] = 15000;
        } else if (pil==2) {
            menu[i]= "Mie Goreng";
            harga[i] = 17000;
        } else if (pil==3) {
            menu[i]="Bihun Goreng";
            harga[i] = 17000;
        } else if (pil==4) {
            menu[i]= "Capcay";
            harga[i] = 16000;
        } else if (pil==5) {
            menu[i]= "Jus Jeruk";
            harga[i] = 5000;
        } else if (pil==6) {
            menu[i]="Es Teh Manis";
            harga[i] = 5000;
        } else if (pil==7) {
            menu[i]= "Es Teh Tawar";
            harga[i] = 3500;
        }  else if (pil==7) {
            menu[i]= "Nutri Sari";
            harga[i] = 5500;
        } else {
            System.out.println("Maaf pilihan menu anda tidak tepat ");
            menu[i]= "Tidak Ada";
        }
            System.out.println("Menu yang anda pesan adalah          : "+menu[i]);
            System.out.println("Harga yang harus dibayar             : "+harga[i]);
            System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
        System.out.print("Apakah anda ingin Menambah Gorengan ? Y/T : ");
        try{
            keputusan = input2.readLine();
        }catch(IOException e){
            System.out.println("Gagal Membaca Keyboard");
        }
        if (keputusan.equals("Y")||keputusan.equals("y")) {
            System.out.println("Tambahan Gorengan");
            System.out.println("----------------------------- ");
            System.out.println("1. Bala - bala    = Rp 1500 ");
            System.out.println("2. Gehu      = Rp 1700 ");
            System.out.println("3. Ati & Ampela   = Rp 3700 ");
            System.out.println("4. Usus        = Rp 1600");
        }
        while (keputusan.equals("Y")||keputusan.equals("y"))

        {
            System.out.print("Pilihan menu anda  = ");
            int pil = input.nextInt();
            if (pil==1){
                menu[i] = "bala - bala";
                harga[i] = 1500;
            } else if (pil==2) {
                menu[i]= "gehu";
                harga[i] = 1700;
            } else if (pil==3) {
                menu[i]="Ati & Ampela";
                harga[i] = 3700;
            } else if (pil==4) {
                menu[i]= "Usus";
                harga[i] = 1600;
            }
            System.out.println("Menu yang anda pesan adalah          : "+menu[i]);
            System.out.println("Harga yang harus dibayar             : "+harga[i]);
            System.out.print("Apakah anda ingin Menambah Gorengan ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }

        System.out.println("");
        System.out.println("Menu yang anda pesan adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(menu[a]+", ");
        }
        System.out.println("");
        for (int b = 0; b<i;b++){
            hargatotal = hargatotal + harga[b];
        }
        System.out.println("Total yang harus anda bayar adalah   : Rp."+hargatotal);
    }
}
