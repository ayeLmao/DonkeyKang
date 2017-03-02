import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;

import javax.imageio.ImageIO;


public class GameObject {
	private int x,y,width, height;
	private double direction;
	protected Image img;
	protected String type;
	
	public GameObject(int x, int y, int wid, int ht) {
		this.x = x;
		this.y = y;
		this.width = wid;
		this.height = ht;
		
	}
	
	public void openImage(String src) {
		try {
			URL url = getClass().getResource("images/" + src + ".png");
			img = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Image could not be opened: " + "res/" + src + ".png");
			e.printStackTrace();
		}
	}

	public void draw(Graphics g){
		g.drawImage(img, x, y, null);
		
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
