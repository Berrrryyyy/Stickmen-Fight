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
    
    private StickMan blue,red;
    
    private JLabel Player1;
    private JLabel Player2;
    // Ergänze das fehlende Referenzattribut
    private Daten myDaten;
            

    /**
     * Standardkonstruktor für Objekte der Klasse STARTFENSTER.
     * Die Komponenten werden hinzugefügt.
     */
    public VIEW()
    {
        myDaten = new Daten();
        
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
        
        
        blue = new StickMan("blue_normal.png","blue_box.png","blue_down.png");
        blue.getLabel().addKeyListener(this);
        
        red = new StickMan("red_normal.png","red_box.png","red_down.png");
        red.getLabel().addKeyListener(this);
        
        
        punkte = 0;
        //System.out.println(punkte);
        
       
        highscore = new JLabel();
        highscore.setText("Highscore: blue " + blue.getHitCnt() + " : red " + red.getHitCnt());
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
        
        super.add(blue.getLabel());
        super.add(red.getLabel());
        /*
        super.add(label6);
        super.add(label8);
        super.add(label9);
        */
        
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
        /*
        label6.setVisible(true);
        label8.setVisible(false);
        label9.setVisible(false);
        */
        blue.setPos(-300,-40);
        red.setPos(700,-40);
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button)
        {
            String name1 = textfield1.getText();
            text1.setText(name1 + " sei bereit!");
            red.setName(name1);
            String name2 = textfield2.getText();
            text2.setText(name2 + " sei bereit!");
            blue.setName(name2);
        }
        else if (e.getSource() == starten)
        {
            FensterAufbauenV2();
        }
        else if (e.getSource() == starten)
        {
            FensterAufbauenV2();
        }
    }
    @Override   public void keyPressed(KeyEvent e) {

        
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
            if (red.getPosX() > blue.getPosX() +100 ){
              red.setPos(red.getPosX() -20, red.getPosY());
            }
            red.setImage(1);
        }
        
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            red.setPos(red.getPosX() +20, red.getPosY());
            red.setImage(1);
        }
        
        if (e.getKeyCode() == KeyEvent.VK_O) {
            red.setPos(red.getPosX() , red.getPosY() );
            red.setImage(2);
               if (red.getPosX() < blue.getPosX() + 105 ){
                red.incHitCnt();
                highscore.setText("Highscore: blue " + blue.getHitCnt() + " : red " + red.getHitCnt());
            }
           /* if (red.getPosX() ) */
        }   
         if (e.getKeyCode() == KeyEvent.VK_P) {
            red.setPos(red.getPosX() , red.getPosY() );
            red.setImage(3);
            
        }

        
        
        
        if (e.getKeyCode() == KeyEvent.VK_A) {         
            blue.setPos(blue.getPosX() -20, blue.getPosY());
            blue.setImage(1);
        }
        
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (blue.getPosX() < red.getPosX() -100 ){
            blue.setPos(blue.getPosX() +20, blue.getPosY());
        }
            blue.setImage(1);
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            blue.setPos(blue.getPosX() , blue.getPosY() );
            blue.setImage(2);
            if (blue.getPosX() < red.getPosX() - 105 ){
                blue.incHitCnt();
                highscore.setText("Highscore:" + blue.getHitCnt() + " : " + red.getHitCnt());
            }
        }
         if (e.getKeyCode() == KeyEvent.VK_G) {
            blue.setPos(blue.getPosX() , blue.getPosY() );
            blue.setImage(3);
            
        }
        
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        if (red.getName() != ""){
            myDaten.DatensatzEinfuegen(red.getName() + " " + red.getHitCnt());
        }
        
        
        if (blue.getName() != ""){
            myDaten.DatensatzEinfuegen(blue.getName() + " " + blue.getHitCnt());
        }
        
        myDaten.AllesAuslesen();
            System.exit(0);
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
