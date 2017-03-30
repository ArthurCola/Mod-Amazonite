package IHM;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
  public Fenetre(){
	
	JPanel pan = new JPanel();
	  
	this.setResizable(false); 
    this.setTitle("Calcul mental");
    this.setSize(800, 800);
    this.setLocationRelativeTo(null);
    pan.setBackground(Color.GRAY);     
    this.setContentPane(pan);    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    
  }
}