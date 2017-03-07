
public class Barrel extends GameObject {
	protected boolean isRightDown = true;
	protected String picture = "barrelUpright";
	protected boolean isBarrelFalling;
	public Barrel(int x, int y) {
		super(x, y, 15, 15);
		openImage(picture);
	}

	public void moveRight() {
		x += 2;
//		if(picture.equals("barrelUpright")){
//			picture = "barrelTilted";
//		}
//		else{
//			picture = "barrelUpright";
//		}
//		openImage(picture);
	}

	public boolean getIsRightDown() {
		return isRightDown;
	}
	
	public void setIsRightDown(boolean b){
		isRightDown = b;
	}
	public void setIsBarrelFalling(boolean b){
		isBarrelFalling = b;
	}
	public boolean getIsBarrelFalling(){
		return isBarrelFalling;
	}
	public void moveDown() {
		y +=2;
		
	}

	public void moveLeft() {
		x-=2;
//		if(picture.equals("barrelUpright")){
//			picture = "barrelTilted";
//		}
//		else{
//			picture = "barrelUpright";
//		}
//		openImage(picture);
	}
}
