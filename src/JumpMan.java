import java.awt.Image;


public class JumpMan extends GameObject {
	Image heroImage;
	public JumpMan(int x, int y) {
		super(x, y, 30, 30);
		openImage("hero");
	}
	

}
