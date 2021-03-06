/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.projeto.praticas.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private Connection connection;
    private String classDriver;
    private Properties info;
    private String url;

    public ConnectionFactory() {
        this.info = new Properties();
        info.setProperty("user", "root");
        this.classDriver = "com.mysql.jdbc.Driver";
        info.setProperty("password", "123");
        url = "jdbc:mysql://localhost:3306/pp1";
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(classDriver);
        return DriverManager.getConnection(url, info);
    }

}
