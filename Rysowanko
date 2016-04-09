import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math;
import java.awt.Polygon;
import java.util.Random;

public class SimpleFrameTest
{	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					SimpleFrame frame = new SimpleFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					// frame.setUndecorated(true);
					frame.setVisible(true);
				}
			});
	}
}

class SimpleFrame extends JFrame
{
	//private static final int DEFAULT_WIDTH = 300;
	//private static final int DEFAULT_HEIGHT = 200;
	
	public SimpleFrame()
	{	
		add(new DrawComponent());
		pack();
	}
}

class DrawComponent extends JComponent
{
	private static final int DEFAULT_WIDTH = 900;
	private static final int DEFAULT_HEIGHT = 500;
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		
		////////////// ladowisko nr 1 ///////////////
		int x1 = 10;
		int y1 = 440;
		int dlugosc1 = 100;
		
		//////////////ladowisko nr 2 ///////////////
		int x2 = 200;
		int y2 = 400;
		int dlugosc2 = 100;
		
		//////////////ladowisko nr 3 ///////////////
		int x3 = 600;
		int y3 = 480;
		int dlugosc3 = 100;
		
		////////////// rysuje ladowiska ///////////////
		g.drawLine(x1, y1, x1 + dlugosc1, y1);
		g.drawLine(x2, y2, x2 + dlugosc2, y2);
		g.drawLine(x3, y3, x3 + dlugosc3, y3);
		
		////////////// obszar pomiedzy ladowiskami ///////////////
		int odlegloscLadowisk = x2 - x1 - dlugosc1;
		Random rand = new Random();
		int rasterOdleglosci = 5; //rand.nextInt(odlegloscLadowisk);
		
		int i = x1 + dlugosc1;
		int ypoprzedni = y1;
		while(i<x2)
		{
			int skokWysokosci = 10; //rand.nextInt(5);  /// skok przy laczeniu lini w osi y = 4
			if(i%2 == 0)
			{
				g.drawLine(i, ypoprzedni, i+rasterOdleglosci, y1+skokWysokosci);
				ypoprzedni = y1+skokWysokosci;
			}
			else
			{
				g.drawLine(i, ypoprzedni, i+rasterOdleglosci, y1-skokWysokosci);
				ypoprzedni = y1-skokWysokosci;
			}
			i += rasterOdleglosci;
		}
		
		if((i - rasterOdleglosci) != x2){
			g.drawLine(i, ypoprzedni, x2, y2);
		}
		
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
