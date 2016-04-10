
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Klasa wyświetlająca okno gry.
 * @author Marek & Łukasz
 *
 */

public class GamePanel extends JPanel{
	
	Pad pad1;
	Pad pad2; 
	Pad pad3;
	Pad pad4; 
	Pad pad5;
	Background bg;
	PlanetSurface ps;
	
	GamePanel(Pad Pad1_in){
		pad1 = Pad1_in;
		bg = new Background();
		ps = new PlanetSurface();

	}
	GamePanel(Pad Pad1_in,Pad Pad2_in){
		pad1 = Pad1_in;
		pad2 = Pad2_in;
		bg = new Background();
		ps = new PlanetSurface();
	}
	GamePanel(Pad Pad1_in,Pad Pad2_in,Pad Pad3_in){
		pad1 = Pad1_in;
		pad2 = Pad2_in;
		pad3 = Pad3_in;
		bg = new Background();
		ps = new PlanetSurface();
	}
	GamePanel(Pad Pad1_in,Pad Pad2_in,Pad Pad3_in,Pad Pad4_in){
		pad1 = Pad1_in;
		pad2 = Pad2_in;
		pad3 = Pad3_in;
		pad4 = Pad4_in;
		bg = new Background();
		ps = new PlanetSurface();
	}
	GamePanel(Pad Pad1_in,Pad Pad2_in,Pad Pad3_in,Pad Pad4_in,Pad Pad5_in){
		pad1 = Pad1_in;
		pad2 = Pad2_in;
		pad3 = Pad3_in;
		pad4 = Pad4_in;
		pad5 = Pad5_in;
		bg = new Background();
		ps = new PlanetSurface();
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Dimension d = getSize();
		bg.paintComponent(g, d);
		ps.paintComponent(g, d);
		if(pad1 != null){
			pad1.paintComponent(g,d);
		//	System.out.println("pad1");
		}
		if(pad2 != null){
			pad2.paintComponent(g,d);
		//	System.out.println("pad2");
		}
		if(pad3 != null){
			pad3.paintComponent(g,d);
		//	System.out.println("pad3");
		}	
		if(pad4 != null){
			pad4.paintComponent(g,d);
		//	System.out.println("pad4");
		}	
		if(pad5 != null){
			pad5.paintComponent(g,d);
		//	System.out.println("pad5");
		}	
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Dimension default_dim = new Dimension(300,300);
				JFrame frame = new JFrame();
				GamePanel panel = new GamePanel(new Pad(0,93,8),new Pad(10,90,20),new Pad(50,90,20),new Pad(80,85,100));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.add(panel);
				frame.setSize(default_dim);
				
			}
		});
	}

}
