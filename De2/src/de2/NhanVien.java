/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

/**
 *
 * @author myPC
 */
public class NhanVien extends Person{
    protected String Phongban;
    protected Float HeSL;
    protected int Thamnien;
    protected Float LuongCB;

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public Float getHeSL() {
        return HeSL;
    }

    public void setHeSL(Float HeSL) {
        this.HeSL = HeSL;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public int getThamnien() {
        return Thamnien;
    }

    public void setThamnien(int Thamnien) {
        this.Thamnien = Thamnien;
    }

    public Float getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(Float LuongCB) {
        this.LuongCB = LuongCB;
    }

    
    public NhanVien(String Hoten, String Ngaysinh, String Diachi, String Gioitinh, String Phongban,Float HeSL, int Thamnien, Float LuongCB) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Phongban = Phongban;
        this.HeSL = HeSL;
        this.Thamnien = Thamnien;
        this.LuongCB = LuongCB;
    }
    
    public Float LuongThucLinh(){
        return this.getLuongCB() * this.getHeSL() *(1 + this.getThamnien()/100);
    }
    
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("[*] Phong ban: " + this.Phongban);
        System.out.println("[*] He so luong: " + this.HeSL);
        System.out.println("[*] Tham nien: " + this.Thamnien);
        System.out.println("[*] Luong co ban: " + this.LuongCB);
        System.out.println("[*] Luonng thuc linh: " + this.LuongThucLinh());
    }
    
}
