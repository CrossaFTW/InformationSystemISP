/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author Z.E.N.S
 */
public class pendaftaran extends Speedy {

    public pendaftaran(int idc) {
        super(idc);
        this.idc = idc;
    }
    
    private int idc;
    private String nama;
    private String alamat;
    private int nomor;
    private int paket;
    private String keterangan;
    private koneksi a = new koneksi();
    private Statement statement;

    

    public String setNama(String nm) {
        return this.nama = nm;
    }

    public String setAlamat(String almt) {
        return this.alamat = almt;
    }

    public int setNomor(int nmr) {
        return this.nomor = nmr;
    }

    public int setPaket(int pkt) {
        return this.paket = pkt;
    }

    public String setKet(String ket) {
        return this.keterangan = ket;
    }

    private int getidC() {
        return idc;
    }

    private String getNama() {
        return nama;
    }

    private String getAlamat() {
        return alamat;
    }

    private int getNomor() {
        return nomor;
    }

    private int getPaket() {
        return paket;
    }

    private String getKet() {
        return keterangan;
    }

    public String insert() {
        String simpan;
        a.masuk();
        try {
            statement = a.koneksi.createStatement();
            String sql = "insert into customer values('" + getidC() + "','" + getNama() + "','" + getAlamat() + "','" + getNomor() + "','" + getPaket() + "','" + getKet() + "')";
            statement.executeUpdate(sql);
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
            String sql = "select max(id_c) from customer";
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
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
