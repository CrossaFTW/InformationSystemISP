/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

/**
 *
 * @author Z.E.N.S
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class laporan_pendaftaran extends Speedy {

    private koneksi kon = new koneksi();
    private Statement stat;
    private int id;

    public laporan_pendaftaran(int idc) {
        super(idc);
        this.id = idc;
    }

    public int getID() {
        return id;
    }

    public DefaultTableModel search1() {
        DefaultTableModel tb = null;
        kon.masuk();
        try {
            stat = kon.koneksi.createStatement();
            tb = new DefaultTableModel();
            tb.addColumn("ID Customer");
            tb.addColumn("Nama");
            tb.addColumn("Alamat");
            tb.addColumn("Nomor HP");
            tb.addColumn("Paketan");
            tb.addColumn("Keterangan");
            tb.addColumn("Tanggal Daftar");
            String sql = "select * from customer where id_c='" + getID() + "'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),});
            }
        } catch (SQLException ae) {
        }
        return tb;
    }

     public DefaultTableModel search2() {
        DefaultTableModel tb = null;
        kon.masuk();
        try {
            stat = kon.koneksi.createStatement();
            tb = new DefaultTableModel();
            tb.addColumn("ID Customer");
            tb.addColumn("Nama");
            tb.addColumn("Alamat");
            tb.addColumn("Nomor HP");
            tb.addColumn("Paketan");
            tb.addColumn("Keterangan");
            tb.addColumn("Tanggal Daftar");
            String sql = "select * from customer";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),});
            }
        } catch (SQLException ae) {
        }
        return tb;
    }
     


    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
