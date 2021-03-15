/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ASUS TUF A15
 */
public class Siswa1 extends Siswa {
   String nama,gender;
   int nomorpegawai;
   //double tinggibadan;
   public void setNamasiswa(String nama){
       super.nama = nama;
   }
   public void setGender (String gender){
       super.gender = gender;
   }
   public void cetak(){
       super.Identitas();
   }
   public void Profesi(){
       System.out.println("Sebagai : ");
   }
}
