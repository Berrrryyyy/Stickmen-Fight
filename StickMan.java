import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javafx.scene.input.KeyEvent;
import java.awt.event.ActionEvent;

/**
 * Write a description of class StickMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StickMan extends JFrame
{
    // instance variables - replace the example below with your own
    private int x,y;
    private JLabel label;
    private ImageIcon stickman_normal,stickman_box,stickman_down;
    private int hits;

    /**
     * Constructor for objects of class StickMan
     */
    public StickMan(String p1,String p2,String p3)
    {
        // initialise instance variables
        x = 0;
        y = 0;
        hits = 0;
        
        stickman_normal = new ImageIcon(p1);
        stickman_box    = new ImageIcon(p2);
        stickman_down   = new ImageIcon(p3);
        
        label = new JLabel(stickman_normal);
        label.setLocation(-300, -45);
        label.setSize(900, 800);
        label.setFocusable(true);
        label.requestFocusInWindow(); 
        label.setVisible(true);
        
        super.add(label);
    }

    public void setImage(int p1){
        
        if (p1 == 1){
          label.setIcon(stickman_normal);
        } else if (p1 == 2){
          label.setIcon(stickman_box);
        } else if (p1 == 3){
          label.setIcon(stickman_down);
        } 
        label.setSize(900, 800);
        label.setFocusable(true);
        label.requestFocusInWindow(); 
        label.setVisible(true);

    }
    
    public void setPos(int p1, int p2){
        x = p1;
        y = p2;
        
        label.setLocation(x, y);
        label.setVisible(true);
    }
    
    public int getPosX(){
      return x;
    }
    
    public int getPosY(){
      return y;
    }
    
    public JLabel getLabel(){
        return label;
    
    }
    
    public void incHitCnt(){
        hits = hits + 1;
    }
    
    public int getHitCnt(){
        return hits;
    }
}
