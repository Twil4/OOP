/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de2;

/**
 *
 * @author myPC
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    protected String Hoten;
    protected String Ngaysinh;
    protected String Diachi;
    protected String Gioitinh;

    public Person(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }
    
    public void HienThi(){
        System.out.println("[*] Ho ten: " + this.Hoten);
        System.out.println("[*] Ngay sinh: " + this.Ngaysinh);
        System.out.println("[*] Dia chi: " + this.Diachi);
        System.out.println("[*] Gioi tinh: " + this.Gioitinh);
    }
    
}
