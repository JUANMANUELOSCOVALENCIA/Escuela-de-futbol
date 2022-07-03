/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author osco
 */
public class conexion_bd {
    Connection cn;
public Connection conectar(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
        System.out.println("conectado");
    }catch (Exception e){
        System.out.println("error"+e);
    }
    return cn;
}

    Connection getConcection() {
        return cn;
    }

}

