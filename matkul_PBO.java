/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Acer Swift3
 */
public class matkul_PBO{

String nama ;
int nim;
float nilaiPBO_T;
float nilaiPBO_P;
String status;

public void statuskelulusan(){

    if (((nilaiPBO_T + nilaiPBO_P)/2) >= 50)
    {
        status="lulus";
    }
    else 
    {
        status="tidak lulus";
    }
    System.out.print (status);
    }



    public void tampil(){
    System.out.println("Menampilkan nama, nim, nilai Teori PBO dan Praktikum PBO dan status kelulusan.");
    System.out.println("===============================================");
    }
}