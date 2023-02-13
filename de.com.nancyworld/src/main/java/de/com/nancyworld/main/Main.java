package de.com.nancyworld.main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Nancys World");
		
		GamelPanel gamelPanel = new GamelPanel();
		window.add(gamelPanel);
		
		window.pack(); //he resulting width and height of the window are automatically enlarged 
		
		window.setLocationRelativeTo(null); // window will be shw in the center
		window.setVisible(true);
	}

}
