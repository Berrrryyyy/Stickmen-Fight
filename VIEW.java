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
    
    private JLabel text1;
    private JLabel text2;
    private JButton button;

    private JTextField textfield;

    private JTextField textfield1;

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
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel Player1;
    private JLabel Player2;
    // Ergänze das fehlende Referenzattribut
    

    /**
     * Standardkonstruktor für Objekte der Klasse STARTFENSTER.
     * Die Komponenten werden hinzugefügt.
     */
    public VIEW()
    {
        text1 = new JLabel();
        text1.setText("PLAYER 1");
        text1.setLocation(750,350);
        text1.setSize (900, 200);       
        text1.setFont(text1.getFont().deriveFont(46f));
        text1.setForeground(new Color(255, 255, 255));
        
        text2 = new JLabel();
        text2.setText("PLAYER 2");
        text2.setLocation(300,350);
        text2.setSize (900, 200);       
        text2.setFont(text2.getFont().deriveFont(46f));
        text2.setForeground(new Color(255, 255, 255));
        
        titel = new JLabel();
        titel.setText("Stickman Fight");
        titel.setLocation(350,-50);
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

        //textfield = new JTextField();
        //textfield.setText("");
        //textfield.setLocation(720, 500);
        //textfield.setSize(275, 40);
        //textfield.setEnabled(true);
        //textfield.setFont(text1.getFont().deriveFont(32));

        textfield1 = new JTextField();
        textfield1.setText("");
        textfield1.setLocation(725, 500);
        textfield1.setSize(275, 40);
        textfield1.setEnabled(true);
        textfield1.setFont(text1.getFont().deriveFont(32));

        
        textfield2 = new JTextField();
        textfield2.setText("");
        textfield2.setLocation(300, 500);
        textfield2.setSize(275, 40);
        textfield2.setEnabled(true);
        textfield2.setFont(text2.getFont().deriveFont(32));
        
        
        starten = new JButton();
        starten.setText("Play");
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
        Player1.setFont(text1.getFont().deriveFont(46f));
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
        
        
        ImageIcon stickman3 = new ImageIcon("Blue.Stickman.png");
        
        label6 = new JLabel(stickman3);
        label6.setLocation(-300, -45);
        label6.setSize(900, 800);
        label6.addKeyListener(this);
        label6.setFocusable(true);
        label6.requestFocusInWindow();  
        
        ImageIcon stickman5 = new ImageIcon("Blue.Stickman.Boxing.1.2.png");
        
        label8 = new JLabel(stickman5);
        label8.setLocation(-300, -45);
        label8.setSize(900, 800);
        label8.addKeyListener(this);
        label8.setFocusable(true);
        label8.requestFocusInWindow();  
        
        ImageIcon stickman6 = new ImageIcon("Blue.Stickmen.D.png");
        
        label9 = new JLabel(stickman6);
        label9.setLocation(-300, -45);
        label9.setSize(900, 800);
        label9.addKeyListener(this);
        label9.setFocusable(true);
        label9.requestFocusInWindow(); 
        
        ImageIcon stickman4 = new ImageIcon("Red.Stickman.1.1.png");
        
        label7 = new JLabel(stickman4);
        label7.setLocation(700, -45);
        label7.setSize(900, 800);
        label7.addKeyListener(this);
        label7.setFocusable(true);
        label7.requestFocusInWindow();  
         
        ImageIcon stickman7 = new ImageIcon("Red.Stickman.1.1.png");
        
        label10 = new JLabel(stickman4);
        label10.setLocation(700, -45);
        label10.setSize(900, 800);
        label10.addKeyListener(this);
        label10.setFocusable(true);
        label10.requestFocusInWindow();  
        
        punkte = 0;
        //System.out.println(punkte);
        
       
        highscore = new JLabel();
        highscore.setText("Highscore:" +punkte);
        highscore.setLocation(5,-180);
        highscore.setSize(750,400);
        highscore.setFont(titel.getFont().deriveFont(35f));
        highscore.setForeground(new Color(0, 0, 0));
        
        final long time1 = System.currentTimeMillis();
        //System.out.println(time1);
        final long time2 = System.currentTimeMillis();
        //System.out.println(time2);
        
        long punkte = time2-time1;
        //System.out.println(punkte);
        
        
        // Hefte den AktionListener an den Button an
        button.addActionListener(this);
        starten.addActionListener(this);
        
        
        super.add(text1);
        super.add(text2);
        super.add(button);

        //super.add(textfield);
        super.add(textfield2);

        super.add(textfield1);
         super.add(textfield2);

        super.add(starten);
        super.add(label2);
        super.add(titel);
        super.add(label3);
        super.add(label4);
        super.add(label5);
        super.add(label6);
        super.add(label7);
        super.add(label8);
        super.add(label9);
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
        text1.setVisible(true);
        button.setVisible(true);
        //Das Eingabefeld muss auf sichtbar gestellt werden

        //textfield.setVisible(true);
        textfield2.setVisible(true);

        textfield1.setVisible(true);

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
        text1.setVisible(false);
        text2.setVisible(false);
        button.setVisible(false);

        //textfield.setVisible(false);

        textfield1.setVisible(false);

        textfield2.setVisible(false);
        starten.setVisible(false);
        label2.setVisible(false);
        titel.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(true);
        highscore.setVisible(true);
        label6.setVisible(true);
        label7.setVisible(true);
        label8.setVisible(false);
        label9.setVisible(false);
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button)
        {
            String name1 = textfield1.getText();
            text1.setText(name1 + " sei bereit!");
            String name2 = textfield2.getText();
            text2.setText(name2 + " sei bereit!");
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

            label7.setLocation(label7.getLocation().x - 20, label7.getLocation().y);
            

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

            //label7.setLocation(label7.getLocation().x + 20, label7.getLocation().y);
           

        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            label6.setLocation(label6.getLocation().x - 20, label6.getLocation().y);
            
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            label6.setLocation(label6.getLocation().x + 20, label6.getLocation().y);
           
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            label8.setLocation(label6.getLocation().x +1,label6.getLocation().y -40);
            label6.setVisible(false);
            label8.setVisible(true);
        }
         if (e.getKeyCode() == KeyEvent.VK_V) {
            label6.setLocation(label8.getLocation().x -1,label8.getLocation().y +40);
            label8.setVisible(false);
            label6.setVisible(true);
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            label6.setLocation(label9.getLocation().x ,label9.getLocation().y -50 );
            label9.setVisible(false);
            label6.setVisible(true);
        }
         if (e.getKeyCode() == KeyEvent.VK_G) {
            label9.setLocation(label6.getLocation().x ,label6.getLocation().y +50 );
            label6.setVisible(false);
            label9.setVisible(true);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    
    
}
