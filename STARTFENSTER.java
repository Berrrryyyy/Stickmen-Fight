import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
// Importiere die erforderlichen Pakete 


/**
 * Eine grafische Benutzeroberfläche.
 *
 * @author xy
 * @version 1.0
 */
// Lass STARTFENSTER von JFrame erben, implementiere die Schnittstellen
public class STARTFENSTER extends JFrame implements ActionListener
{
    
    private JLabel text;
    private JButton button;
    private JTextField textfield;
    private JButton starten;
    private JLabel label2;
    // Ergänze das fehlende Referenzattribut
    

    /**
     * Standardkonstruktor für Objekte der Klasse STARTFENSTER.
     * Die Komponenten werden hinzugefügt.
     */
    public STARTFENSTER()
    {
        text = new JLabel();
        text.setText("Wie heißt du?");
        text.setLocation(300,40);
        text.setSize (900, 200);       
        text.setFont(text.getFont().deriveFont(46f));

        button = new JButton();
        button.setText("Name ändern");
        button.setLocation(840, 250);
        button.setSize (400, 80);
        button.setEnabled(true);
        button.setFont(button.getFont().deriveFont(56f));

        // Initialisiere und konfiguriere das Eingabefeld
        textfield = new JTextField();
        textfield.setText("");
        textfield.setLocation(280, 250);
        textfield.setSize(550, 80);
        textfield.setEnabled(true);
        textfield.setFont(text.getFont().deriveFont(32));
        
        
        starten = new JButton();
        starten.setText("Starten");
        starten.setLocation(575, 400);
        starten.setSize(200, 80);
        starten.setEnabled(true);
        starten.setFont(button.getFont().deriveFont(35f));
        
        ImageIcon schlange = new ImageIcon("schlangenbild.png");
        
        label2 = new JLabel(schlange);
        label2.setLocation(10, 40);
        label2.setSize(900, 800);
        
        // Hefte den AktionListener an den Button an
        button.addActionListener(this);
        starten.addActionListener(this);
        
        
        super.add(text);
        super.add(button);
        super.add(textfield);
        super.add(starten);
        super.add(label2);
        //Füge auch die dritte Komponente in das Fenster ein

       
        FensterAufbauenV1();
        // Das Fenster wird konfiguriert            
        super.setLayout(null);
        super.setSize(1290, 750);
        super.setVisible(true);

    }

    /**
     * Die Komponenten für Version 1 werden in das Fenster eingefügt.
     */
    public void FensterAufbauenV1() {

        text.setVisible(true);
        button.setVisible(true);
        //Das Eingabefeld muss auf sichtbar gestellt werden
        textfield.setVisible(true);
        starten.setVisible(true);
    }
    /**
     * Die Komponenten für Version 2 werden in das Fenster eingefügt.
     */
    public void FensterAufbauenV2() {
        text.setVisible(false);
        button.setVisible(false);
        textfield.setVisible(false);
        starten.setVisible(false);
        label2.setVisible(false);
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button)
        {
            String name = textfield.getText();
            text.setText(name + " sei bereit!");
        }
        else if (e.getSource() == starten)
        {
            FensterAufbauenV2();
        }
    }
}
