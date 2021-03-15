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
public class tampildata {
    public static void main(String[] args){
        
    
    Siswa1 t=new Siswa1();
    Siswa2 r=new Siswa2();
    Kelas1 prof1=new Kelas1();
    Kelas2 prof2=new Kelas2();
    
    t.setNamasiswa("Eko");
    t.setGender("Laki-Laki");
    t.cetak();
    prof1.setnomorabsen(20);
    prof1.cetak();
        System.out.println(prof1.getnomorabsen());
        prof1.keterangan();
        prof1.gajiayah(3000000);
        prof1.gajiibu(3000000);
        
        System.out.println("==========================");
        
        r.setSiswa("Ike");
        r.setGender("Perempuan");
        r.cetak();
        prof2.setnomorabsen(14);
        prof2.cetak();
        System.out.println(prof2.getnomorabsen());
        prof2.keterangan();
        prof2.gajiayah(3500000);
        prof2.gajiibu(4000000);
            }
}
