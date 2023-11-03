/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author myPC
 */
public class Student extends Person{
    protected String MaSV;
    protected String Email;
    protected Float DiemTK;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Float getDiemTK() {
        return DiemTK;
    }

    public void setDiemTK(Float DiemTK) {
        this.DiemTK = DiemTK;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Student(String MaSV, String Email, Float DiemTK, String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        super(HoTen, NgaySinh, DiaChi, GioiTinh);
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }
    
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("[*] Ma SV: " + this.MaSV);
        System.out.println("[*] Email: " + this.Email);
        System.out.println("[*] Diem: " + this.DiemTK);
    }
}
