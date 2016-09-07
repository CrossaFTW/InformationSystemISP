/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

/**
 *
 * @author Z.E.N.S
 */
public abstract class Speedy {

    private int idC;

    Speedy(int idc) {
        this.idC = idc;
    }
    
    abstract public boolean login();

    public int toInteger() {
        return idC;
    }
}
