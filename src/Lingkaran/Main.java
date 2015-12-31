/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author Microsoft
 */
public class Main {
      public static void main(String[]args){
            Tabung gelas=new Tabung();
            System.out.println("========Lingkaran=========");// Menampilkan Lingkaran
            gelas.Input();
            gelas.LuasKelilinglingkaran();
            System.out.println();
            System.out.println("==========Tabung==========");// Menampilkan Tabung
            System.out.println("volume Tabung adalah:"+gelas.Tabung()); // Menampilkan Volume tabung
            System.out.println("Luas Tabung adalah:"+gelas.LuasTabung()); // Menampilkan Luas tabung
      }
}
