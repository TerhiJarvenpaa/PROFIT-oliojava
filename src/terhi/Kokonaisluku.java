package terhi;
/**
 * 
 * @author Terhi Järvenpää
 * KESKEN!
 */

public class Kokonaisluku {
    /**
     * Luo luokka,jolla on yksi metodi. Metodi osaa tulostaa kaikki kokonaisluvut 0 - 1000,
     * joiden neliöjuuri on kokonaisluku
     * @param args none
     */

 
     
   public static void NeliojuuriKokonaisluku(){
        for (int i=1; i <= 1000; i++) {
            double y;
          
           y =  Math.sqrt(i);
          
           System.out.println(y);
        }
        }

   public static void main(String[] args) {
       NeliojuuriKokonaisluku();
   }

}