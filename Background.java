import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * Klasa zajmująca się pobraniem z pliku i wyświetleniem tła gry - gwieździstego nieba.
 * @author Marek
 *
 */

public class Background extends JComponent{
	
	BufferedImage img = null;
	
	Background(){
    try {
    	img =  ImageIO.read(new File("dark-sky.jpg"));
    } catch (IOException e) {
    	System.out.println("Nie udało się załadować pliku");
    }
	}
	
	protected void paintComponent(Graphics g,Dimension d){
		int width = (int) d.getWidth();
        int height = (int) d.getHeight();
		g.drawImage(img, 0, 0, width , height , this);
	}
}
