import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * Klasa zajmująca się wyświetleniem niedostępnej do lądowania powieszchni planety.
 * @author Marek & Łukasz
 *
 */

public class PlanetSurface extends JComponent{
	
	BufferedImage img = null;
	
	PlanetSurface(){
	    try {
	    	img =  ImageIO.read(new File("surface.png"));
	    } catch (IOException e) {
	    	System.out.println("Nie udało się załadować pliku");
	    }
		}
	
	protected void paintComponent(Graphics g,Dimension d){
		super.paintComponent(g);
		int width = (int)d.getWidth();
        int height = (int)d.getHeight();
        int y = 91*height/100;
        int y_height = 10*height/100;
        g.drawImage(img, 0, y, width , y_height , this);
		
	}
	
	
	/*
	protected void paintComponent(Graphics g,Dimension d){
		System.out.println("rect");
		super.paintComponent(g);
		int width = (int)d.getWidth();
        int height = (int)d.getHeight();
        g.setColor(Color.white); 
        int y = 95*height/100;
        int y_height = 5*height/100;
        g.fillRect(0 , y , width, y_height );
		
	}
*/
}
