package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	
	//This is a constructor
	public GamePanel () {
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(100, 100, 200, 50);
		
	}
	

}
