/**
 * Das Symbol eines Apfels.
 *
 * @author xy
 * @version 1.0
 */

import java.awt.*;
import javax. swing. *;

class APFELSYMBOL extends SONDERSYMBOL
{

    /**
     * Standardkonstruktor für Objekte der Klasse APFELSYMBOL.
     * Die Methode paintComponent wird überschrieben. Der Apfel wird gezeichnet.
     * 
     */
    APFELSYMBOL()
    {
        super();
        anzeige = new JComponent () {
            // anonyme innere Klasse, Methode paintComponent wird überschrieben
            public void paintComponent (Graphics g)
            {
                g. clearRect (1, 1, groesse - 1, groesse - 1);
                g. setColor (Color. white);
                g. fillRect (1, 1, groesse - 2, groesse - 2);
                g. setColor (Color. red);
                g. fillOval(groesse / 4, 3 * groesse / 8, groesse / 2, groesse / 2);
                g. setColor (Color. green);
                g. drawLine (groesse / 2 - 1, 3 * groesse / 8, 5 * groesse / 8 - 1, groesse / 8);
                g. drawLine (groesse / 2, 3 * groesse / 8, 5 * groesse / 8, groesse / 8);
                g. drawLine (groesse / 2 + 1, 3 * groesse / 8, 5 * groesse / 8 + 1, groesse / 8);
                g. drawLine (groesse / 2 - 1, 3 * groesse / 8, groesse / 4 - 1, groesse / 8);
                g. drawLine (groesse / 2, 3 * groesse / 8, groesse / 4, groesse / 8);
                g. drawLine (groesse / 2 + 1, 3 * groesse / 8, groesse / 4 + 1, groesse / 8);
                g. setColor (new Color (200, 100, 0));
                g. drawLine (groesse / 2 - 1, 3 * groesse / 8, 3 * groesse / 8 - 1, groesse / 8);
                g. drawLine (groesse / 2, 3 * groesse / 8, 3 * groesse / 8, groesse / 8);
                g. drawLine (groesse / 2 + 1, 3 * groesse / 8, 3 * groesse / 8 + 1, groesse / 8);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        anzeige.setLocation(150,150);
    }

}