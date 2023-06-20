import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color.*;
// Importiere die erforderlichen Pakete 


/**
 * Eine grafische Benutzeroberfläche.
 *
 * @author xy
 * @version 1.0
 */
// Lass STARTFENSTER von JFrame erben, implementiere die Schnittstellen
public class VIEW extends JFrame implements ActionListener
{
    
    private JLabel text;
    private JButton button;
    private JTextField textfield;
    private JButton starten;
    private JLabel label2;
    private JLabel titel;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel highscore;
    private int punkte;
    
    // Ergänze das fehlende Referenzattribut
    

    /**
     * Standardkonstruktor für Objekte der Klasse STARTFENSTER.
     * Die Komponenten werden hinzugefügt.
     */
    public VIEW()
    {
        text = new JLabel();
        text.setText("Wie heißt du?");
        text.setLocation(500,350);
        text.setSize (900, 200);       
        text.setFont(text.getFont().deriveFont(46f));
        text.setForeground(new Color(255, 255, 255));
        
        titel = new JLabel();
        titel.setText("Stickman Fight");
        titel.setLocation(400,-50);
        titel.setSize(900,400);
        titel.setFont(titel.getFont().deriveFont(70f));
        titel.setForeground(new Color(255, 255, 255));
        
        button = new JButton();
        button.setText("Enter");
        button.setLocation(700, 500);
        button.setSize (200, 40);
        button.setEnabled(true);
        button.setFont(button.getFont().deriveFont(40f));

        // Initialisiere und konfiguriere das Eingabefeld
        textfield = new JTextField();
        textfield.setText("");
        textfield.setLocation(400, 500);
        textfield.setSize(275, 40);
        textfield.setEnabled(true);
        textfield.setFont(text.getFont().deriveFont(32));
        
        
        starten = new JButton();
        starten.setText("Starten");
        starten.setLocation(550, 575);
        starten.setSize(200, 75);
        starten.setEnabled(true);
        starten.setFont(button.getFont().deriveFont(30f));
        starten.setBackground(new Color(255, 0, 0));
        //starten.set
        
        ImageIcon stickman1 = new ImageIcon("Stickman1.3.2.png");
        
        label2 = new JLabel(stickman1);
        label2.setLocation(675, 100);
        label2.setSize(900, 800);
        
        
        ImageIcon stickman2 = new ImageIcon("Stickman2.3.2.png");
        
        label3 = new JLabel(stickman2);
        label3.setLocation(-250, 100);
        label3.setSize(900, 800);
        
        
        ImageIcon hintergrund = new ImageIcon("Hintergrund2.png");
        
        label4 = new JLabel(hintergrund);
        label4.setLocation(0, 0);
        label4.setSize(1290, 750);
        
        
        ImageIcon boden = new ImageIcon("Boden.png");
        
        label5 = new JLabel(boden);
        label5.setLocation(0, 500);
        label5.setSize(1290, 250);
         
        
        punkte = 0;
        //System.out.println(punkte);
        
       
        highscore = new JLabel();
        highscore.setText("Highscore:" +punkte);
        highscore.setLocation(5,-180);
        highscore.setSize(750,400);
        highscore.setFont(titel.getFont().deriveFont(35f));
        highscore.setForeground(new Color(0, 0, 0));
        
        
        // Hefte den AktionListener an den Button an
        button.addActionListener(this);
        starten.addActionListener(this);
        
        
        super.add(text);
        super.add(button);
        super.add(textfield);
        super.add(starten);
        super.add(label2);
        super.add(titel);
        super.add(label3);
        super.add(label4);
        super.add(label5);
        super.add(highscore);
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
        label5.setVisible(true);
        text.setVisible(true);
        button.setVisible(true);
        //Das Eingabefeld muss auf sichtbar gestellt werden
        textfield.setVisible(true);
        starten.setVisible(true);
        label2.setVisible(true);
        titel.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        
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
        titel.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(true);
        highscore.setVisible(true);
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
