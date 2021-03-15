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
public class Siswa2 extends Siswa {
    public void setSiswa(String nama){
      super.nama=nama;  
    }
    public void cetak(){
        super.Identitas();
    }
    public void setGender(String gender){
        super.gender=gender;
        
    }
    public void profesi(){
        System.out.println("Sebagai : ");
    }
    
}
