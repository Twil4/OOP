/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de1;

/**
 *
 * @author myPC
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    protected String HoTen;
    protected String NgaySinh;
    protected String DiaChi;
    protected String GioiTinh;

    public Person(String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
     
    public void HienThi(){
        System.out.println("[*] Ho ten: " + this.HoTen);
        System.out.println("[*] Ngay sinh: " + this.NgaySinh);
        System.out.println("[*] Dia chi: " + this.DiaChi);
        System.out.println("[*] Gioi tinh: " + this.GioiTinh);
    }
    
}
