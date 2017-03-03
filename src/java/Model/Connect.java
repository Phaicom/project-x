/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jao_3_000
 */
public class Connect {

    public static Connection getConnection() {

        Connection connect = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*connect = DriverManager.getConnection("jdbc:mysql://bootcamp.itkmutt.in.th/projectX"
                    + "?user=undefind&password=junjaolormak");*/
            connect = DriverManager.getConnection("jdbc:mysql://localhost/projectX?useEncoding=true&characterEncoding=UTF-8","root","");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connect;
    }
    public static void main(String[] args) {
        Connect.getConnection();
    }
}
