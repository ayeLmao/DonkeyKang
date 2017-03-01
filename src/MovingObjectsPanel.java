import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;


public class MovingObjectsPanel extends JPanel {
	
	final Dimension defaultDim;
	GameMap gm;
	private Timer t;
	Image image1;
	
	public MovingObjectsPanel(Dimension dim) {
		defaultDim = dim;
		setUpKeyMappings();
		makeGameMap();
		t.start();
	}
	private void makeGameMap() {
		gm = new DonkeyKangGameMap();
		t = new Timer(10, new ActionListener() {// fires off every 10 ms
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gm.tick();// I tell the GameMap to tick... do what
					// you do every time the clock goes off.
				//gm.moversCollide();
				repaint();// naturally, we want to see the new view
			}
				
		});// this semicolon is here because it is the end of the new Timer construction...
	}
	
	private void setUpKeyMappings() {
		

		
		
		
		
		this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"shoot");	
		this.getActionMap().put("shoot",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.shoot();
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"mLeft");
		this.getActionMap().put("mLeft",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.mLeft();
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"mRight");
		this.getActionMap().put("mRight",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.mRight();
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"mDown");
		this.getActionMap().put("mDown",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.mDown();
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("UP"),"mUp");
		this.getActionMap().put("mUp",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.mUp();
			}
		});
		
		this.getInputMap().put(KeyStroke.getKeyStroke("released UP"),"stopVert");
		this.getInputMap().put(KeyStroke.getKeyStroke("released DOWN"),"stopVert");
		this.getActionMap().put("stopVert",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.stopVert();
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("released LEFT"),"stopHor");
		this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"),"stopHor");
		this.getActionMap().put("stopHor",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gm.stopHor();
			}
		});
		repaint();
		this.requestFocusInWindow();		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		gm.draw(g, 0, 0, (int) defaultDim.getWidth(), (int) defaultDim.getHeight());
		}

}
