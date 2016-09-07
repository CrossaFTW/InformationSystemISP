/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import komponen.Menu_Utama;
import koneksi.koneksi;

/**
 *
 * @author Z.E.N.S
 */
public class login extends Speedy {

    private koneksi a = new koneksi();
    private Statement statement;
    private int idl;
    private String pass;
    private String type;

    public login(int idc) {
        super(idc);
        this.idl = idc;
    }

    public String setPass(String pass) {
        return this.pass = pass;
    }

    public String setType(String type) {
        return this.type = type;
    }

    private int getID() {
        return idl;
    }

    private String getPass() {
        return pass;
    }

    private String getType() {
        return type;
    }

    public String getLogin() {
        String cek = "";
        if (login()) {
            cek = "Login Correct";
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Menu_Utama().setVisible(true);
                }
            });
        } else {
            cek = "Login Incorrect";
        }
        return cek;
    }

    @Override
    public boolean login() {
        boolean cek = false;
        a.masuk();
        String query = "select * from login where id_k=? and pass_k=? and ket_k=? ";
        try (java.sql.PreparedStatement save = a.koneksi.prepareStatement(query)) {
            save.setInt(1, getID());
            save.setString(2, getPass());
            save.setString(3, getType());
            ResultSet rs = save.executeQuery();
            if (rs.next()) {
                cek = true;
            } 
        } catch (SQLException ae) {
        }
        return cek;
    }
}
