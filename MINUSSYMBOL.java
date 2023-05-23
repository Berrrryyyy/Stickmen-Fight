/**
 * Das Symbol eines Minuszeichens.
 *
 * @author xy
 * @version 1.0
 */

import java.awt.*;
import javax. swing. *;

class MINUSSYMBOL extends SONDERSYMBOL
{
    
    /**
     * Standardkonstruktor für Objekte der Klasse MINUSSYMBOL.
     * Die Methode paintComponent wird überschrieben. Das Minussymbol wird gezeichnet.
     */
    MINUSSYMBOL()
    {
        super();
        anzeige = new JComponent () {
             // anonyme innere Klasse, Methode paintComponent wird überschrieben
            public void paintComponent (Graphics g)
            {
                g. clearRect (1, 1, groesse - 1, groesse - 1);
                g. setColor (Color. white);
                g. fillRect (1, 1, groesse - 2, groesse - 2);
                g. setColor (Color. yellow);
                g. fillOval(groesse / 4, groesse / 4, groesse / 2, groesse / 2);
                g. setColor (Color. blue);
                g. drawLine (groesse / 4, groesse / 2, 3 * groesse / 4, groesse / 2);
                g. drawLine (groesse / 4 + 1, groesse / 2 - 1, 3 * groesse / 4 - 1, groesse / 2 - 1);
                g. drawLine (groesse / 4 + 1, groesse / 2 + 1, 3 * groesse / 4 - 1, groesse / 2 + 1);
            }
        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        anzeige.setLocation(150,150);
    }

    
}