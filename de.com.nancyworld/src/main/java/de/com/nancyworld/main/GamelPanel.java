package de.com.nancyworld.main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamelPanel extends JPanel implements Runnable{
	
	private final int ORIGINAL_TILE_SIZE = 16; //16x16 pixels Tile
	
	private final int SCALE = 3;
	
	private final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE; //46x46
	
	private final int MAX_SCREEN_COL = 16;
	
	private final int MAX_SCREEN_ROW = 12;
	
	private final int SCREEN_WIDTH = TILE_SIZE * MAX_SCREEN_COL; // 768 pixels
	
	private final int SCREEN_HIGHT = TILE_SIZE * MAX_SCREEN_ROW; // 576 pixels
	
	private Thread gameThread;
	
	GamelPanel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HIGHT));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
