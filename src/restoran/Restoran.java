/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;
import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class Restoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        /* 1. Tampil menu makanan + harga (ini itu pakai array multi dimensi)
        2. User akan memilih menu makanannya
        3. Lalu program akan mengeluarkan harga dari makanannya
        4. Program menanyakan apakah anda ingin menambah makanan( ini pakai while itu lo)
        5. User menjawab iya maka mengulang ke array,  jika tidak berhenti ( yang boolean while itu lo)
        */
        System.out.println("=====MENU MAKANAN=====");
        // ini buat nomer 1
        String[][] menu = {{"Nasi Pecel","7000"}, {"Nasi Jagung", "8000"}, {"Nasi Kuning", "10000"},{"Nasi Uduk", "8000"},{"Nasi Campur", "12000"},{"Lontong Sayur", "9000"} };
        
        int i;
        for(i=0; i < menu.length; i++){
            System.out.println(i +". "+menu[i][0]+ " : " +"Rp "+menu[i][1]);
            
        }
        
        System.out.println( );
        Scanner input = new Scanner (System.in);
        // nomor 2 3
        System.out.print("Pilihan menu anda adalah ");
        String pilihMenu[] = new String[5];
        int harga[] = new int[5];
        int pil = input.nextInt();
      
        if(pil == 0){
            pilihMenu[0]= "Nasi Pecel";
            harga[0]=7000;
            System.out.println(pilihMenu[0] +" : "+ harga[0]);
        }else if(pil == 1){
            pilihMenu[1]= "Nasi Jagung";
            harga[1]= 8000;
            System.out.println(pilihMenu[1] +" : "+ harga[1]);
        }else if(pil == 2){
            pilihMenu[2] = "Nasi Kuning";
            harga[2]= 10000;
            System.out.println(pilihMenu[2] +" : "+ harga[2]);
        }else if(pil == 3){
            pilihMenu[3] = "Nasi Uduk";
            harga[3]= 8000;
            System.out.println(pilihMenu[3] +" : "+ harga[3]);
        }else if(pil == 4){
            pilihMenu[4] = "Nasi Campur";
            harga[4] = 12000;  
            System.out.println(pilihMenu[4] +" : "+ harga[4]);
        }else if(pil == 5){
            pilihMenu[5] = "Lontong Sayur";
            harga[5] = 9000;
            System.out.println(pilihMenu[5] +" : "+ harga[5]);
        }else
            System.out.println("Menu yang anda pilih tidak sesuai");
        
        //Nomer 4
        Boolean pilih = true;
        String pilihan;
        
        while(pilih){
            System.out.println(" ");
            System.out.println("Apakah kamu mau menambah menu makanan?");
            System.out.println("Jawab dengan pilihan Iya/Tidak");
            
            pilihan = input.nextLine();
        //nomer 5
            System.out.println(" ");
            if(pilihan.equalsIgnoreCase("Iya")){
                for(i=0; i < menu.length; i++){
                 
                    System.out.println(i +". "+menu[i][0]+ " : " +"Rp "+menu[i][1]);
                }
                
            }else if(pilihan.equalsIgnoreCase("Tidak")){
                pilih = false;
                System.out.println("=====TERIMA KASIH=====");
            }
        
   
        }
    }
    

}