package terhi;

import java.util.Scanner; // Otetaan Scanner-luokka käyttöön import-lauseella.

/**
 * 
 * @author Terhi Järvenpää
 * KESKEN!
 */
public class LukuTesti {
    private static Scanner lukija = new Scanner(System.in);
    /** main testausta varten 
     * @param args
     * 
     */
    public static void main(String[] args) {
       
        Kokonaisluku luku1 = new Kokonaisluku(1);
        System.out.println("Anna arvo:");
        luku1.arvo = lukija.nextInt();
      

    }

}
