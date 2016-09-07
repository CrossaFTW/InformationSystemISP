/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.koneksi;

/**
 *
 * @author Z.E.N.S
 */
public class service extends Speedy {

    private koneksi a = new koneksi();
    private Statement statement;
    private int idService;
    private int idC;
    private String ket, nm;

    public service(int idc) {
        super(idc);
        this.idC = idc;
    }

    public int setService(int ids) {
        return this.idService = ids;
    }

    public String setKet(String ket) {
        return this.ket = ket;
    }

    private int getService() {
        return idService;
    }

    public int getIdC() {
        return idC;
    }

    public String getKet() {
        return ket;
    }

    private String setNama(String nm) {
        return this.nm = nm;
    }

    public String getNama() {
        return nm;
    }

    public String search() {
        String cek;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "select * from customer where id_c='" + getIdC() + "';";
            ResultSet set = statement.executeQuery(sql);
            if (set.next()) {
                setNama(set.getString(2));
                setKet(set.getString(6));
            }
            cek = "Ketemu";
        } catch (SQLException ae) {
            cek = "Data Tidak Ketemu";
        }
        return cek;
    }

     public int autoNumber(){
        int y=0;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "select max(id_s) from service";
            ResultSet set=statement.executeQuery(sql);
            while(set.next()){
                y=set.getInt(1);
            }
            statement.close();
        } catch (SQLException ae) {
        }
        return y+1;
        
    }
    
    public String insert() {
        String simpan;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "insert into service values('" + getService() + "','" + getIdC() + "','" + getKet() + "')";
            String sql1 = "update customer set ket='" + getKet() + "' where id_c='" + getIdC() + "'";
            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);
            statement.close();
            simpan = "Data Save";
        } catch (SQLException ae) {
            simpan = "Data Tidak Save";
        }
        return simpan;
    }

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
