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

public class laporan_pembayaran extends Speedy {

    private koneksi kon = new koneksi();
    private Statement stat;
    private int id;
    private String dt;

    public laporan_pembayaran(int idc) {
        super(idc);
        this.id = idc;
    }

    public String setDate(String dt) {
        return this.dt = dt;
    }

    public String getDate() {
        return dt;
    }

    public DefaultTableModel search1() {
        DefaultTableModel tb = null;
        kon.masuk();
        try {
            stat = kon.koneksi.createStatement();
            tb = new DefaultTableModel();
            tb.addColumn("ID Transaksi");
            tb.addColumn("ID Customer");
            tb.addColumn("Harga");
            tb.addColumn("Keterangan");
            tb.addColumn("Date");
            String sql = "select * from pembayaran where date='" + getDate() + "'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),});
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
            tb.addColumn("ID Transaksi");
            tb.addColumn("ID Customer");
            tb.addColumn("Harga");
            tb.addColumn("keterangan");
            tb.addColumn("Date");
            String sql = "select * from pembayaran";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),});
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
