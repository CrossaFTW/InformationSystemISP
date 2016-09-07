/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Z.E.N.S
 */
public class koneksi {
    String username="postgres";
    String password="53534039604";
    String url="jdbc:postgresql://localhost/speedy";
    String driver="org.postgresql.Driver";
    public java.sql.Connection koneksi;
    
    public java.sql.Connection masuk(){
        try{
            Class.forName(driver).newInstance();
            koneksi= DriverManager.getConnection(url,username,password);
            System.out.println("Masuk");
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ae){
            System.out.println("Tidak Masuk");
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        koneksi a=new koneksi();
        a.masuk();
    }
}
