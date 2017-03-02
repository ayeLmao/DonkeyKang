import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DonkeyKangGameMap extends GameMap {
	private JumpMan hero = new JumpMan(400, 530);
	public DonkeyKangGameMap(){
		
	}
	@Override
	public void openBackgroundImage(){
		
	}
	public void jump(){
		
	}
	public void draw(Graphics g) {
		hero.draw(g);
	}
	
}
