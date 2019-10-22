/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan49;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas e = new Emas();
        e.setHarga(570000);
        System.out.println("Harga 1 Gram Emas : "+e.getHarga());
        System.out.println("Beli Emas seberat 15.7 gram");
        System.out.println("Biaya yang dibutuhkan adalah Rp. "+e.beliEmas(15.7));
    }

}
