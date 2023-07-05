import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// Importiere die erforderlichen Pakete 


/**
 * Eine grafische Benutzeroberfläche.
 *
 * @author xy
 * @version 1.0
 */
// Lass STARTFENSTER von JFrame erben, implementiere die Schnittstellen
public class VIEW extends JFrame implements ActionListener,KeyListener
{
    
    private JLabel text;
    private JButton button;
    private JTextField textfield;
    private JTextField textfield2;
    private JButton starten;
    private JLabel label2;
    private JLabel titel;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel highscore;
    private int punkte;
    private JLabel label6;
    private JLabel label7;
    private JLabel Player1;
    private JLabel Player2;
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
        button.setLocation(550, 550);
        button.setSize (200, 40);
        button.setEnabled(true);
        button.setFont(button.getFont().deriveFont(40f));

        // Initialisiere und konfiguriere das Eingabefeld
        textfield = new JTextField();
        textfield.setText("");
        textfield.setLocation(720, 500);
        textfield.setSize(275, 40);
        textfield.setEnabled(true);
        textfield.setFont(text.getFont().deriveFont(32));
        
        textfield2 = new JTextField();
        textfield2.setText("");
        textfield2.setLocation(320, 500);
        textfield2.setSize(275, 40);
        textfield2.setEnabled(true);
        textfield2.setFont(text.getFont().deriveFont(32));
        
        
        starten = new JButton();
        starten.setText("Starten");
        starten.setLocation(550, 600);
        starten.setSize(200, 75);
        starten.setEnabled(true);
        starten.setFont(button.getFont().deriveFont(30f));
        starten.setBackground(new Color(255, 0, 0));
        //starten.set
        
        Player1 = new JLabel();
        Player1.setText("Wie heißt du?");
        Player1.setLocation(200,600);
        Player1.setSize (900, 200);       
        Player1.setFont(text.getFont().deriveFont(46f));
        Player1.setForeground(new Color(255, 255, 255));
        
        ImageIcon stickman1 = new ImageIcon("Stickmen1.3.2.png");
        
        label2 = new JLabel(stickman1);
        label2.setLocation(675, 100);
        label2.setSize(900, 800);
        
        
        ImageIcon stickman2 = new ImageIcon("Stickmen2.3.2.png");
        
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
        
        
        ImageIcon stickman3 = new ImageIcon("Stickmen3.1.png");
        
        label6 = new JLabel(stickman3);
        label6.setLocation(-300, -30);
        label6.setSize(900, 800);
        label6.addKeyListener(this);
        label6.setFocusable(true);
        label6.requestFocusInWindow();  
        
        ImageIcon stickman4 = new ImageIcon("Stickmen3.2.png");
        
        label7 = new JLabel(stickman4);
        label7.setLocation(300, -35);
        label7.setSize(900, 800);
        
         
        
        punkte = 0;
        //System.out.println(punkte);
        
       
        highscore = new JLabel();
        highscore.setText("Highscore:" +punkte);
        highscore.setLocation(5,-180);
        highscore.setSize(750,400);
        highscore.setFont(titel.getFont().deriveFont(35f));
        highscore.setForeground(new Color(0, 0, 0));
        
        final long time1 = System.currentTimeMillis();
        System.out.println(time1);
        final long time2 = System.currentTimeMillis();
        System.out.println(time2);
        
        long punkte = time2-time1;
        System.out.println(punkte);
        
        
        // Hefte den AktionListener an den Button an
        button.addActionListener(this);
        starten.addActionListener(this);
        
        
        super.add(text);
        super.add(button);
        super.add(textfield);
        super.add(textfield2);
        super.add(starten);
        super.add(label2);
        super.add(titel);
        super.add(label3);
        super.add(label4);
        super.add(label5);
        super.add(label6);
        super.add(label7);
        super.add(highscore);
        super.add(Player1);
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
        textfield2.setVisible(true);
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
        textfield2.setVisible(false);
        starten.setVisible(false);
        label2.setVisible(false);
        titel.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(true);
        highscore.setVisible(true);
        label6.setVisible(true);
         label6.setVisible(true);
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
    @Override   public void keyPressed(KeyEvent e) {
        //if (e.getKeyCode() == KeyEvent.VK_UP) {
          //  label6.setLocation(label6.getLocation().x, label6.getLocation().y - 5);
            //label6.setText("oben");
            //System.out.println("oben");
        //}
        //if (e.getKeyCode() == KeyEvent.VK_DOWN) {
          //  label6.setLocation(label6.getLocation().x, label6.getLocation().y + 5);
            //label6.setText("unten");
            //System.out.println("unten");
        //}
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            label7.setLocation(label7.getLocation().x - 15, label7.getLocation().y);
            //label6.setText("links");
            //System.out.println("links");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            label7.setLocation(label7.getLocation().x + 15, label7.getLocation().y);
            //label6.setText("rechts");
            //System.out.println("rechts");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            label6.setLocation(label6.getLocation().x - 15, label6.getLocation().y);
            //label6.setText("links");
            //System.out.println("links");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            label6.setLocation(label6.getLocation().x + 15, label6.getLocation().y);
            //label6.setText("rechts");
            //System.out.println("rechts");
        }
        
         //if (e.getKeyCode() == KeyEvent.VK_74) {
           // label6.setVisible(false);
           
            
           
       // }
       // if (e.getKeyCode() == KeyEvent.VK_75) {
           // schlangenbild.setLocation(schlangenbild.getLocation().x+5, schlangenbild.getLocation().y );
            
       // }
       
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    
    
}
