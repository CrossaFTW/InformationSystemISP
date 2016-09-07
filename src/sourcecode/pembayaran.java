/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Z.E.N.S
 */
public class pembayaran extends Speedy {

    private koneksi a = new koneksi();
    private Statement statement;
    private int idTransasksi;
    private int idC;
    private int harga;
    private String ket;
    private String nm;

    
    public pembayaran(int idc) {
        super(idc);
        this.idC = idc;
    }

    public int setIdpem(int idtran) {
        return this.idTransasksi = idtran;
    }

    public int setHarga(int hrg) {
        return this.harga = hrg;
    }

    public String setKet(String ket) {
        return this.ket = ket;
    }

    private int getIdpem() {
        return idTransasksi;
    }

    public int getIdc() {
        return idC;
    }

    public int getHarga() {
        return harga;
    }

    public String getKet() {
        return ket;
    }
    
    private String setNama(String nm){
        return this.nm=nm;
    }
    
    public String getNama(){
        return nm;
    }

    
    public String search() {
        String cek;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "select * from customer where id_c='" + getIdc() + "';";
            ResultSet set=statement.executeQuery(sql);
            if (set.next()) {
                setNama(set.getString(2));
            }
            cek = "Ketemu";
        } catch (SQLException ae) {
            cek = "Data Tidak Ketemu";
        }
        return cek;
    }

    public String insert() {
        String simpan;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "insert into pembayaran values('" + getIdpem() + "','" + getIdc() + "','" + getHarga() + "','" + getKet() + "')";
            String sql1 = "update customer set ket='" + getKet() + "' where id_c='" + getIdc() + "'";
            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);
            statement.close();
            simpan = "Data Save";
        } catch (SQLException ae) {
            simpan = "Data Tidak Save";
        }
        return simpan;
    }
    
    public int autoNumber(){
        int y=0;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "select max(id_transaksi) from pembayaran";
            ResultSet set=statement.executeQuery(sql);
            while(set.next()){
                y=set.getInt(1);
            }
            statement.close();
        } catch (SQLException ae) {
        }
        return y+1;
        
    }
    
    @Override
    public String toString(){
        return "=========================================";
    }

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public DefaultTableModel search1(int id) {
        DefaultTableModel tb = null;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            tb = new DefaultTableModel();
            tb.addColumn("ID Transaksi");
            tb.addColumn("ID Customer");
            tb.addColumn("Harga");
            tb.addColumn("Date");
            String sql = "select id_transaksi, id_c, harga, date from pembayaran where id_c='" + id + "'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),});
            }
        } catch (SQLException ae) {
        }
        return tb;
    }
    
}
