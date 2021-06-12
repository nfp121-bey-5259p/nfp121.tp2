package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        //int fahrenheit = 0;
        //float celsius = 0;
        //System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // imposés
        for (int i=0; i<args.length; i++){
            
            //convertir en entiers
            int j=Integer.parseInt(args[i]);  
            double c = fahrenheitEnCelsius(j);
  
             //Le résultat est attendu avec un seul chiffre derrière la virgule
             c = ((int)c*10)/10.0;
             System.out.println(args[i] + "\u00B0F -> " + c + "\u00B0C");
        }
                                                                                
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static double fahrenheitEnCelsius(int f) {

        //return 0.F; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
                    
                    //La formule de conversion : °C = 5/9 * (°F -32)

         double celsius =(( 5 *(f - 32.0)) / 9.0);
         return celsius;

    }

}
