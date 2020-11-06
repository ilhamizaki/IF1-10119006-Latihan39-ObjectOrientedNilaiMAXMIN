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
 * Deskripsi Program : class menentukan nilai max dan min
 */
public class NilaiMaxMin {
    Scanner scanner = new Scanner(System.in);
    public int jmlhMhs;
    public int[] nilai;
    public int max = -1000;
    public int min = 1000;
    
    public void inputNilai() {
        nilai = new int[jmlhMhs];
        for (int i = 1; i <= jmlhMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilai[i-1] = scanner.nextInt();
        }
    }
    
    public void tampilNilai() {
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa======");
        for(int i = 1; i <= jmlhMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i-1]);
        }
    }
    
    public void cariMaxMin() {
        for(int i=0; i < nilai.length; i++) {
            if(nilai[i] > max) {
                max = nilai[i];
            }
            if(nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}
