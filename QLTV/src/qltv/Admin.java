/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

/**
 *
 * @author myPC
*/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends Person{

    public Admin(String MaSV, String Password, String HoTen, String Ngaysinh, String GioiTinh, String Lop, String Khoa, int Level) {
        super(MaSV, Password, HoTen, Ngaysinh, GioiTinh, Lop, Khoa, Level);
    }
    
    public ResultSet GetAllUsers(){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Users";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result;
            }else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public int CheckMaSV(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Users WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, MaSV);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int AddUsers(String MaSV, String Password, String Hoten, String Gioitinh, String Ngaysinh, String Lop, String Khoa, int Level){
        ConnectToSql conn = new ConnectToSql();
        try {
            String queryString = "INSERT INTO Users(MaSV, Password, Hoten, Gioitinh, Ngaysinh, Lop, Khoa, Level) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            conn.statement = conn.connection.prepareStatement(queryString);
            conn.statement.setString(1, MaSV);
            conn.statement.setString(2, Password);
            conn.statement.setString(3, Hoten);
            conn.statement.setString(4, Gioitinh);
            conn.statement.setString(5, Ngaysinh);
            conn.statement.setString(6, Lop);
            conn.statement.setString(7, Khoa);
            conn.statement.setInt(8, Level);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int UpdateUsers(String MaSV, String Hoten, String Gioitinh, String Ngaysinh, String Lop, String Khoa, int Level){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Users SET Hoten = ?, Gioitinh = ?, Ngaysinh = ?, Lop = ?, Khoa = ?, Level = ? WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Hoten);
            conn.statement.setString(2, Gioitinh);
            conn.statement.setString(3, Ngaysinh);
            conn.statement.setString(4, Lop);
            conn.statement.setString(5, Khoa);
            conn.statement.setInt(6, Level);
            conn.statement.setString(7, MaSV);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int UpdatePassword(String MaSV, String Password){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Users SET Password = ? WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Password);
            conn.statement.setString(2, MaSV);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int DeleteUsers(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "DELETE FROM Users WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, MaSV);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int CheckMaSach(int ID_Sach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Sach WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setInt(1, ID_Sach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public ResultSet GetAllSach(){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Sach";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result;
            }else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public int AddSach(String Tensach, String Theloai, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "INSERT INTO Sach(Tensach, Theloai, Soluong) VALUES(?, ?, ?)";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Tensach);
            conn.statement.setString(2, Theloai);
            conn.statement.setInt(3, Soluong);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int UpdateSach(int ID_Sach, String Tensach, String Theloai, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Sach SET Tensach = ?, Theloai = ?, Soluong = ? WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Tensach);
            conn.statement.setString(2, Theloai);
            conn.statement.setInt(3, Soluong);
            conn.statement.setInt(4, ID_Sach);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int DeleteSach(int ID_Sach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "DELETE FROM Sach WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, ID_Sach);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int GetSoLuongSachCon(int ID_Sach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM Sach WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setInt(1, ID_Sach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("Soluong");
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int CheckSoLuongSach(int ID_Sach, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM Sach WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setInt(1, ID_Sach);
            conn.result = conn.statement.executeQuery();
            int SoLuong = conn.result.getInt("Soluong");
            if(SoLuong < Soluong){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
        public int UpdateSoLuongSach(int ID_Sach, int Soluong){
            ConnectToSql conn = new ConnectToSql();
            try {
                String querySql = "SELECT Soluong FROM Sach WHERE ID_Sach = ?";
                conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                conn.statement.setInt(1, ID_Sach);
                conn.result = conn.statement.executeQuery();
                if(conn.result.next()){
                    int SoLuong = conn.result.getInt("Soluong");
                    SoLuong = SoLuong - Soluong;
                    querySql = "UPDATE Sach SET Soluong = ? WHERE ID_Sach = ?";
                    conn.statement = conn.connection.prepareStatement(querySql);
                    conn.statement.setInt(1, SoLuong);
                    conn.statement.setInt(2, ID_Sach);
                    int row = conn.statement.executeUpdate();
                    if(row > 0){
                        return 1;
                    }else{
                        return 0;
                    }
                }else{
                    return 0;
                }
            } catch (Exception e) {
                return 0;
            }
        }
        
        
    public int UpdateSLSach(int ID_Sach, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Sach SET Soluong = ? WHERE ID_Sach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Soluong);
            conn.statement.setInt(2, ID_Sach);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
        
    public int GetMaSach(String MaMS){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT ID_Sach FROM MuonSach WHERE Mamuon = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, MaMS);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("ID_Sach");
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public ResultSet GetAllMuonSach(){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM MuonSach";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public int GetSoLuongMuon(String MaMS){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM MuonSach WHERE Mamuon = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, MaMS);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("Soluong");
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int AddMS(String MaMS, String MaSV, int ID_Sach, String Ngayhentra, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "INSERT INTO MuonSach(Mamuon, ID_Sach, MaSV, Soluong, Ngaymuon, Ngayhentra, Tinhtrang) VALUES(?, ?, ?, ?, CONVERT(DATE, GETDATE()), ?, 0)";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, MaMS);
            conn.statement.setInt(2, ID_Sach);
            conn.statement.setString(3, MaSV);
            conn.statement.setInt(4, Soluong);
            conn.statement.setString(5, Ngayhentra);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int CheckMaMS(String MaMS){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM MuonSach WHERE Mamuon = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, MaMS);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int UpdateMS(String MaMS, int ID_Sach, String MaSV, String Ngaymuon, String Ngayhentra, int Tinhtrang){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySQL = "UPDATE MuonSach SET ID_Sach = ?, MaSV = ?, Ngaymuon = ?, Ngayhentra = ?, Tinhtrang = ? WHERE Mamuon = ?";
            conn.statement = conn.connection.prepareStatement(querySQL);
            conn.statement.setInt(1, ID_Sach);
            conn.statement.setString(2, MaSV);
            conn.statement.setString(3, Ngaymuon);
            conn.statement.setString(4, Ngayhentra);
            conn.statement.setInt(5, Tinhtrang);
            conn.statement.setString(6, MaMS);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int SLTraSach(String MaMS){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE MuonSach SET Soluong = 0 WHERE Mamuon = ?";
            conn.statement.setString(1, MaMS);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int UpdateSLTraSach(String MaMS, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE MuonSach SET Soluong = ? WHERE Mamuon = ?";
            conn.statement.setInt(1, Soluong);
            conn.statement.setString(2, MaMS);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int UpdateNgayTra(String MaMS, String Ngaytra){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE MuonSach SET Ngaytra = ? WHERE Mamuon = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Ngaytra);
            conn.statement.setString(2, MaMS);
            int row = conn.statement.executeUpdate();
            if(row > 0){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
