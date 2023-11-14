/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author myPC
 */
public class ConnectToSql {
    
    protected String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QL_Diem;encrypt=false;trustServerCertificate=true";
    protected String username = "sa";
    protected String password = "123456";
    protected Connection connection;
    protected Statement statement;

    public ConnectToSql() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
            this.statement = this.connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public int Test(){
        try {
            String querySQL = "SELECT * FROM Users";
            ResultSet result = this.statement.executeQuery(querySQL);
            return 1;
        } catch (SQLException e) {
            return 0;
        }
    }
    
    
    
}
