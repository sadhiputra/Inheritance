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
public class Tabung extends Lingkaran {
      double t=10;
      Lingkaran bulat = new Lingkaran ();
      public void Input(){
            System.out.println("Jari-jari Lingkaran :"+jari); // Menampilkan Hasil Jari-jari;
            System.out.println("'V'Lingkaran        :"+v); // Menampilkan Hasil V;
      }
      public void LuasKelilinglingkaran(){
            System.out.println("Luas Lingkaran:"+bulat.LuasLingkaran()); // Menampilkan Hasil Luas Lingkaran;
            System.out.println("Keliling Lingkaran:"+bulat.KelilingLingkaran()); // Menampilkan Keliling Lingkaran;
                            
      }
      public double Tabung(){
            return LuasLingkaran()*t; // Kembali Pada Luas Lingkaran;
      }
      public double LuasTabung(){
            return (2*LuasLingkaran())+(KelilingLingkaran()*t); // Kembali Pada Keliling Lingkaran;
      }
}
