/**
 * Das Symbol eines Pilzes.
 *
 * @author xy
 * @version 1.0
 */

import java.awt.*;
import javax. swing. *;

class PILZSYMBOL extends SONDERSYMBOL
{

    /**
     * Standardkonstruktor für Objekte der Klasse PILZSYMBOL.
     * Die Methode paintComponent wird überschrieben. Der Pilz wird gezeichnet.
     */
    PILZSYMBOL()
    {
        super();
        anzeige = new JComponent () {
             // anonyme innere Klasse, Methode paintComponent wird überschrieben
            public void paintComponent (Graphics g)
            {
                g. clearRect (1, 1, groesse - 1, groesse - 1);
                g. setColor (Color. white);
                g. fillRect (1, 1, groesse - 2, groesse - 2);
                g. setColor (new Color (191, 0, 0));
                g. fillArc (groesse / 8, groesse / 8, 3 * groesse / 4, groesse - 2, 0, 180);
                g. setColor (new Color (191, 95, 0));
                g. fillRect (7 * groesse / 16, groesse / 2, groesse / 8, groesse / 2 - 1);
                g. setColor (Color. white);
                g. fillOval (5 * groesse / 16, 5 * groesse / 16, groesse / 8, groesse / 8);
                g. fillOval (9 * groesse / 16, 5 * groesse / 16, groesse / 8, groesse / 8);
                g. fillOval (7 * groesse / 16, 3 * groesse / 16, groesse / 8, groesse / 8);                
            }
        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        anzeige.setLocation(150,150);
    }

}