/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btl.oop;

/**
 *
 * @author myPC
 */
public class Person{

    /**
     * @param args the command line arguments
     */
    protected int ID;
    protected String Username;
    protected String Password;
    protected String HoTen;
    protected String GioiTinh;
    protected int Level;

    public Person(int ID, String Username, String Password, String HoTen, String GioiTinh, int Level) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.Level = Level;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int Login(String UsernameString, String Password){
        ConnectToSql conn = new ConnectToSql();
        String querySQL = "SELECT * FROM Users WHERE Username = ? AND Password = ?";
        conn.statement  = conn.connection.prepareStatement(querySQL);
        conn.statement.s
    }
}
