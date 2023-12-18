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
    
    public String getGioiTinh(String MaSV) {
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Gioitinh FROM Users WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, MaSV);
            conn.result = conn.statement.executeQuery();
            String Gioitinh = conn.result.getString("Gioitinh");
            if(conn.result.next()){
                return Gioitinh;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public int CheckMaSV(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Gioitinh FROM Users WHERE MaSV = ?";
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
    
    public int CheckMaSach(String Masach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Sach WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, Masach);
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
    
    public int AddSach(String Tensach, String Theloai, int Soluong, String Masach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "INSERT INTO Sach(Tensach, Theloai, Soluong, Masach) VALUES(?, ?, ?, ?)";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Tensach);
            conn.statement.setString(2, Theloai);
            conn.statement.setInt(3, Soluong);
            conn.statement.setString(4, Masach);
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
    
    public int UpdateSach(String Masach, String Tensach, String Theloai, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Sach SET Tensach = ?, Theloai = ?, Soluong = ? WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Tensach);
            conn.statement.setString(2, Theloai);
            conn.statement.setInt(3, Soluong);
            conn.statement.setString(4, Masach);
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
    
    public int DeleteSach(String Masach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "DELETE FROM Sach WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Masach);
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
    
    public int GetSoLuongSachCon(String Masach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM Sach WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, Masach);
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
    
    public int CheckSoLuongSach(String Masach, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM Sach WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, Masach);
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
    
        public int UpdateSoLuongSach(String Masach, int Soluong){
            ConnectToSql conn = new ConnectToSql();
            try {
                String querySql = "SELECT Soluong FROM Sach WHERE Masach = ?";
                conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                conn.statement.setString(1, Masach);
                conn.result = conn.statement.executeQuery();
                if(conn.result.next()){
                    int SoLuong = conn.result.getInt("Soluong");
                    SoLuong = SoLuong - Soluong;
                    querySql = "UPDATE Sach SET Soluong = ? WHERE Masach = ?";
                    conn.statement = conn.connection.prepareStatement(querySql);
                    conn.statement.setInt(1, SoLuong);
                    conn.statement.setString(2, Masach);
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
        
        
    public int UpdateSLSach(String Masach, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Sach SET Soluong = ? WHERE Masach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Soluong);
            conn.statement.setString(2, Masach);
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
        
    public ResultSet GetAllMS(){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Muonsach";
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
    
    public ResultSet GetMuonSachUser(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Muonsach WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, MaSV);
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
    
    public ResultSet GetMuonSachNew(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Muonsach WHERE MaSV = ? ORDER BY Mamuonsach DESC LIMIT 1";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, MaSV);
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
    
    public ResultSet GetInfoMS(String MaSV){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT m.*, s.* FROM muonsach m JOIN sach s ON m.Masach = s.Masach WHERE MaSV = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setString(1, MaSV);
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
    
    public int AddMS(String Masach, String MaSV, int Soluong, String Ngayhentra){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "INSERT INTO Muonsach(Masach, MaSV, Soluong, Ngaymuon, Ngayhentra, Tinhtrang) VALUES(?, ?, ?, DATE_FORMAT(NOW(), '%d-%m-%Y'), ?, 0)";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Masach);
            conn.statement.setString(2, MaSV);
            conn.statement.setInt(3, Soluong);
            conn.statement.setString(4, Ngayhentra);
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
    
    public int CheckMS(int MaMS){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT * FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, MaMS);
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
    
    public String GetMaSach(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Masach FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Mamuonsach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getString("Masach");
            }else{
                return "a";
            }
        } catch (Exception e) {
            return "a";
        }
    }
    
    public int Trasach(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Muonsach SET Tinhtrang = 1, Ngaytra = DATE_FORMAT(NOW(), '%m-%d-%Y') WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Mamuonsach);
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
    
    public int UpdateMS(int Mamuonsach, String Masach, String MaSV, String Ngayhentra, int Soluong){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "UPDATE Muonsach SET Masach = ?, MaSV = ?, Ngayhentra = ?, Soluong = ? WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Masach);
            conn.statement.setString(2, MaSV);
            conn.statement.setString(3, Ngayhentra);
            conn.statement.setInt(4, Soluong);
            conn.statement.setInt(5, Mamuonsach);
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
    
    public String GetMaSOfMS(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Masach FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Mamuonsach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getString("Masach");
            }else{
                return "a";
            }
        } catch (Exception e) {
            return "a";
        }
    }
    
    public int GetTinhTrang(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Tinhtrang FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.statement.setInt(1, Mamuonsach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("Tinhtrang");
            }else{
                return 3;
            }
        } catch (Exception e) {
            return 3;
        }
    }
    
    public int GetSLOfMS(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT Soluong FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Mamuonsach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("Soluong");
            }else{
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
    
    public int DeleteMS(int Mamuonsach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "DELETE FROM Muonsach WHERE Mamuonsach = ?";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setInt(1, Mamuonsach);
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
    
    public int GetSLSachMuon(String Masach){
        ConnectToSql conn = new ConnectToSql();
        try {
            String querySql = "SELECT SUM(Soluong) AS Soluongmuon FROM Muonsach WHERE Masach = ? AND Tinhtrang = 0";
            conn.statement = conn.connection.prepareStatement(querySql);
            conn.statement.setString(1, Masach);
            conn.result = conn.statement.executeQuery();
            if(conn.result.next()){
                return conn.result.getInt("Soluongmuon");
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
