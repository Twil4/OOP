/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qltv;

/**
 *
 * @author myPC
 */

public class Person {

    /**
     * @param args the command line arguments
     */
    protected String MaSV;
    protected String Password;
    protected String HoTen;
    protected String Ngaysinh;
    protected String GioiTinh;
    protected String Lop;
    protected String Khoa;
    protected int Level;

    public Person(String MaSV, String Password, String HoTen, String Ngaysinh, String GioiTinh, String Lop, String Khoa, int Level) {
        this.MaSV = MaSV;
        this.Password = Password;
        this.HoTen = HoTen;
        this.Ngaysinh = Ngaysinh;
        this.GioiTinh = GioiTinh;
        this.Lop = Lop;
        this.Khoa = Khoa;
        this.Level = Level;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    
}
