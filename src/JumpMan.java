import java.awt.Image;


public class JumpMan extends GameObject {
	public JumpMan(int x, int y) {
		super(x, y, 30, 30);
		openImage("hero");
	}
	public void moveRight(){
		if (x <= 930) {
			x += 3;
		}
	}
	
	public void moveLeft() {
		if (x >= 3) {
			x -= 3;
		}
	}
	public void moveUp() {
		if(y >= 5){
			y -= 5;
		}
	}
	public void moveDown() {
		if(y <= 565){
			y += 5;
		}
	}
	

}
