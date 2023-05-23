
import java.awt.*;
import javax. swing. *;
/**
 * Das Symbol wird in der Swing-Komponente JComponent dargestellt. Die Groesse wird festgelegt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SONDERSYMBOL
{
    protected JComponent anzeige;
    protected int groesse;

    /**
     * Konstruktor für Objekte der Klasse SONDERSYMBOL
     */
    public SONDERSYMBOL()
    {
        groesse = 500;
    }

    /**
     * Rückgabe der Komponente, in der das Symbol dargestellt wird.
     * @return die Komponente
     */
    JComponent gibKomponente(){
        return anzeige;
    }
}
