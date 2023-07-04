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
    
    // Ergänze das fehlende Referenzattribut
    

    /**
     * Standardkonstruktor für Objekte der Klasse STARTFENSTER.
     * Die Komponenten werden hinzugefügt.
     */
    public VIEW()
    {
        text1 = new JLabel();
        text1.setText("PLAYER 1");
        text1.setLocation(650,350);
        text1.setSize (900, 200);       
        text1.setFont(text1.getFont().deriveFont(46f));
        text1.setForeground(new Color(255, 255, 255));
        
        text2 = new JLabel();
        text2.setText("PLAYER 2");
        text2.setLocation(350,350);
        text2.setSize (900, 200);       
        text2.setFont(text2.getFont().deriveFont(46f));
        text2.setForeground(new Color(255, 255, 255));
        
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
        textfield1 = new JTextField();
        textfield1.setText("");
        textfield1.setLocation(250, 500);
        textfield1.setSize(275, 40);
        textfield1.setEnabled(true);
        textfield1.setFont(text1.getFont().deriveFont(32));
        
        textfield2 = new JTextField();
        textfield2.setText("");
        textfield2.setLocation(550, 500);
        textfield2.setSize(275, 40);
        textfield2.setEnabled(true);
        textfield2.setFont(text1.getFont().deriveFont(32));
        
        starten = new JButton();
        starten.setText("Starten");
        starten.setLocation(550, 575);
        starten.setSize(200, 75);
        starten.setEnabled(true);
        starten.setFont(button.getFont().deriveFont(30f));
        starten.setBackground(new Color(255, 0, 0));
        //starten.set
        
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
        label7.setLocation(800, -30);
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
        text1.setVisible(true);
        button.setVisible(true);
        //Das Eingabefeld muss auf sichtbar gestellt werden
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
        label6.setVisible(true);
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
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            label7.setLocation(label7.getLocation().x - 20, label7.getLocation().y);
            
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            label7.setLocation(label7.getLocation().x + 20, label7.getLocation().y);
           
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            label6.setLocation(label6.getLocation().x - 20, label6.getLocation().y);
            
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            label6.setLocation(label6.getLocation().x + 20, label6.getLocation().y);
           
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
