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
	DonkeyKangGameMap gm;
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
		t = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gm.tick();
				repaint();
			}
				
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		gm.draw(g);
	}
	
	private void setUpKeyMappings() {

		this.getInputMap().put(KeyStroke.getKeyStroke("pressed SPACE"), "beginJump");
		this.getInputMap().put(KeyStroke.getKeyStroke("released SPACE"), "endJump");
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed RIGHT"), "beginRight");
		this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"), "endRight");
		this.getInputMap().put(KeyStroke.getKeyStroke("pressed LEFT"), "beginLeft");
		this.getInputMap().put(KeyStroke.getKeyStroke("released LEFT"), "endLeft");
	
		this.getActionMap().put("beginJump", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.beginJump();
				repaint();
			}
		});
		
		this.getActionMap().put("endJump", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.endJump();
				repaint();  
			}
		});
		
		this.getActionMap().put("beginRight", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.beginMoveRight();
				repaint();
			}
		});
		
		this.getActionMap().put("endRight", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.endMoveRight();
				repaint();
			}
		});
		
		this.getActionMap().put("beginLeft", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.beginMoveLeft();
				repaint();
			}
		});
		
		this.getActionMap().put("endLeft", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gm.endMoveLeft();
				repaint();
			}
		});
		
		this.requestFocusInWindow();
		
	}
}
