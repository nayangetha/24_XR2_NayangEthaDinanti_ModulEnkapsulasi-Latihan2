/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET1
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Membuat objek busBesar dari kelas Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang
        busBesar.cetak();
        
        //Penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
        
    
    }
    
}
