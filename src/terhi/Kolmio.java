/**Peri Kuviosata Kolmio luokka
 * 
 */
package terhi;

/**
 * @author Terhi J‰rvenp‰‰
 *
 */
public class Kolmio extends Kuvio {
    private Kuvio k1;
    private Kuvio k2;
    private Kuvio k3;
  

    /**
     * @param ax
     * @param ay
     * @param bx
     * @param by
     * @param cx
     * @param cy
     */
    Kolmio (int ax, int ay, int bx, int by, int cx, int cy) {
        k1 = new Kuvio (ax, ay, bx, by);
        k2 = new Kuvio(bx, by, cx, cy);
        k3 = new Kuvio(cx, cy, ax, ay);
        
    }
    
    /**
     * 
     */
    public void piirraKolmio(){
        k1.piirraViiva();
        k2.piirraViiva();
        k3.piirraViiva();
    }

}
