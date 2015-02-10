/**
 * 
 */
package terhi;
import fi.jyu.mit.graphics.EasyWindow;

/**
 * @author Terhi J‰rvenp‰‰
 *
 */
public class Kuvio {
    private int ax;
    private int ay;
    private int bx;
    private int by;
    static EasyWindow window = new EasyWindow();
     
    
    /**
     * @param ax
     * @param ay
     * @param bx
     * @param by
     */
    public Kuvio (int ax, int ay, int bx, int by){
      this.ax = ax;
      this.ay = ay;
      this.bx = bx;
      this.by = by;
    }
    
    /**
     * 
     */
    
    public void piirraViiva(){
        window.addLine(ax, ay, bx, by);
    }
    

    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Kuvio k = new Kuvio(20,100,60,100);
        k.piirraViiva();
        
        Kolmio ko = new Kolmio(20,100,60,100,40,200);
        
        ko.piirraKolmio();

    }



}
