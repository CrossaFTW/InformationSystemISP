/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import javax.swing.ImageIcon;

/**
 *
 * @author Z.E.N.S
 */
public class Icon {

    private ImageIcon icon;
    private ImageIcon reportPem;
    private ImageIcon reportPend;
    private ImageIcon reportSer;
    private ImageIcon pend;
    private ImageIcon Ser;
    private ImageIcon log;
    private ImageIcon Menu;
    private ImageIcon Pem;

    public Icon() {
        icon = new ImageIcon("jpeg/huruf.png");
        reportPem=new ImageIcon("jpeg/log.jpg");
    }
    
    public ImageIcon getIcon(){
        return icon;
    }
    
    public ImageIcon getReportPem(){
        return reportPem;
    }
    
    public ImageIcon getReportPend(){
        return reportPend;
    }
    
    public ImageIcon getReportSer(){
        return reportSer;
    }
    
    public ImageIcon getPendaftaran(){
        return pend;
    }
    
    public ImageIcon getService(){
        return Ser;
    }
    
    public ImageIcon getPembayaran(){
        return Pem;
    }
    
    public ImageIcon getLogin(){
        return log;
    }
    
    public ImageIcon getMenu(){
        return Menu;
    }
    
    
}
