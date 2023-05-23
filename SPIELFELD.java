
import java.awt.*;
import javax. swing. *;

class SPIELFELD extends SONDERSYMBOL
{

    /**
     * Standardkonstruktor für Objekte der Klasse PILZSYMBOL.
     * Die Methode paintComponent wird überschrieben. Der Pilz wird gezeichnet.
     */
    SPIELFELD()
    {
        super();
        anzeige = new JComponent () {
             // anonyme innere Klasse, Methode paintComponent wird überschrieben
            public void paintComponent (Graphics g)
            {
                g.clearRect(1, 1, groesse-1, 800);
                g.setColor(Color.white);
                g.fillRect(0, 0, 500, 500);
                g.setColor (new Color (191, 0, 0));
            }
        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        anzeige.setLocation(150,150);
    }

}
