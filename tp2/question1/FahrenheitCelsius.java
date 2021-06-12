package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        //int fahrenheit = 0;
        //float celsius = 0;
        //System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // impos�s
        for (int i=0; i<args.length; i++){
            
            //convertir en entiers
            int j=Integer.parseInt(args[i]);  
            double c = fahrenheitEnCelsius(j);
  
             //Le r�sultat est attendu avec un seul chiffre derri�re la virgule
             c = ((int)c*10)/10.0;
             System.out.println(args[i] + "\u00B0F -> " + c + "\u00B0C");
        }
                                                                                
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static double fahrenheitEnCelsius(int f) {

        //return 0.F; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
                    
                    //La formule de conversion : �C = 5/9 * (�F -32)

         double celsius =(( 5 *(f - 32.0)) / 9.0);
         return celsius;

    }

}
