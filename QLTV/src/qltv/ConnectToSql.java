/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author myPC
 */
public class ConnectToSql {
    
    protected String url = "jdbc:mysql://localhost:3306/QLTV?encrypt=false&trustServerCertificate=true&useSSL=false";
    protected String username = "root";
    protected String password = "";
    protected Connection connection;
    protected PreparedStatement statement;
    protected ResultSet result = null;

    public ConnectToSql() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }    

    public void close() {
        try {
            this.result.close();
            this.statement.close();
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
