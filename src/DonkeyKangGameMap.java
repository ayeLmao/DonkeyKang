import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DonkeyKangGameMap extends GameMap {
	private JumpMan hero = new JumpMan(400, 570);
	protected boolean isMovingRight = false;
	protected boolean isMovingLeft = false;
	protected boolean isMovingUp = false;
	protected boolean isMovingDown = false;
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
	public void beginMoveRight() {
		isMovingRight = true;
	}
	public void endMoveRight() {
		isMovingRight = false;
	}
	public void beginMoveLeft() {
		isMovingLeft = true;
		
	}
	public void endMoveLeft() {
		isMovingLeft = false;
		
	}
	public void tick() {
		if(isMovingRight){
			hero.moveRight();
		}
		else if(isMovingLeft){
			hero.moveLeft();
		}
		if(isMovingUp){
			hero.moveUp();
		}
		else{ 
			hero.moveDown();
		}
	}
	public void beginJump() {
		isMovingUp = true;
	}
	public void endJump() {
		isMovingUp = false;
	}
}
