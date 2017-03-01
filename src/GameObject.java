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
	
	public GameObject(int x, int y, int wid, int ht) {
		this.x = x;
		this.y = y;
		this.width = wid;
		this.height = ht;
		
	}
	public void openImage(String src, String src2) {
		try {
			URL url = getClass().getResource("res/" + src + ".png");
			img = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Image could not be opened: " + "res/" + src + ".png");
			e.printStackTrace();
		}
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	public void draw(Graphics g){
		g.drawImage(img, x, y, this.width, this.height, null);
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
