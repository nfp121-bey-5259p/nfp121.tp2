package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      //int fahrenheit = 0; // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      //float celsius = 0F; // à compléter, en appelant la méthode ad'hoc de la question2 
      // un test ici pour le zéro absolu (-273.1)
     
        
             
            //convertir en entiers
            String j=entree.getText();  
            int fahrenheit = Integer.parseInt(j);
            double c = fahrenheitEnCelsius(fahrenheit);
  
            if(fahrenheit < -273.1F) 
      { 
          fahrenheit = -273;
        }
             //Le résultat est attendu avec un seul chiffre derrière la virgule
             c = ((int)c*10)/10.0;
            // System.out.println(fahrenheit + "\u00B0F -> " + c + "\u00B0C");

             
             sortie.setText( Double.toString( c));
    }catch(NumberFormatException nfe){
      sortie.setText("error ! " + nfe.getMessage());
    }
    
  }
  
  
     public static double fahrenheitEnCelsius(int f) {

        //return 0.F; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
                    
                    //La formule de conversion : °C = 5/9 * (°F -32)

         double celsius =(( 5 *(f - 32.0)) / 9.0);
         return celsius;

    }
    
  public static void main(String[] args){
      
      try
      {
           new IHMFahrenheit();
      }
      catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
      }
    
    }
}
