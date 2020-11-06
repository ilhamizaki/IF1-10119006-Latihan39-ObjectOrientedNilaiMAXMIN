/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main NilaiMaxMin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMaxMin value = new NilaiMaxMin();
        
        System.out.println("====Program Nilai terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukkan banyaknya Nilai Mahassiwa : ");
        value.jmlhMhs = scanner.nextInt();
        
        value.inputNilai();
        value.tampilNilai();
        
        value.cariMaxMin();
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + value.max);
        System.out.println("Nilai Terkecil adalah " + value.min);
        System.out.println();
        System.out.println("Petugas : " + petugas);
    }
    
}
