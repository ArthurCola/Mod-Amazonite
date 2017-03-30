package IHM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel { 

	  public void paintComponent(Graphics g){
		  
		  Font font = new Font("Courier", Font.PLAIN, 15);
		    g.setFont(font);
		    g.setColor(Color.BLACK);          
		    g.drawString("Faites les calculs suivants :", 10, 20);             
	
	     
 }
}               
	
