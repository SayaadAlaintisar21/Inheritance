/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Acer Swift3
 */
public class TI2E extends matkul_PBO{

    @Override

    public void tampil(){
    System.out.println("Nama : "+nama);
    System.out.println("NIM : "+nim);

    }

    public void nilai(){
    System.out.println("Nilai Teori PBO : "+nilaiPBO_T);
    System.out.println("Nilai Praktikum PBO : "+nilaiPBO_P);
    System.out.println("Nilai Praktikum PBO : "+status);
    System.out.println("=======================");
    }
}