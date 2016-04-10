import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * 
 * Klasa reprezentująca lądowisko na powieszchni planety.
 * Zajmuje się wyświetlaniem komponentu lądowisko dla podanych parametrów
 * w postaci prostokątąta.
 * 
 * @author Marek @ Łukasz
 *
 */

public class Pad extends JComponent{
	
	/**
	 * 
	 * Zmienna start_x przechowuje x - współrządną położenia lewego gónego rogu lądowiska
	 * wyrażona w procentach względem aktualnej szerokości okna.
	 * Zmienna start_y przechowuje y - współrzędną położenia lewego górnego rogu lądowiska
	 * wyrażona w procentach względem aktualnej szerokości okna.
	 * Zmienna lenght przechowuje długość lądowiska.
	 *  
	 */
	
	private int start_x;
	private int start_y;
	private int length;
	
	/**
	 * 
	 * Konstruktor lądowiska.
	 * @param x {@link start_x}
	 * @param y {@link start_y}
	 * @param l {@link length}
	 * 
	 */
	
	public Pad(int x,int y,int l){
		start_x = x;
		start_y = y;
		length = l;
		
	}
	
	/**
	 * Metoda zajmująca się rysowaniem lądowiska.
	 * @param g Aktualny kontekst graficzny w programie.
	 * @param d Aktualny wymiar okna w którym wyświetlany jest komponent lądowisko.
	 * 
	 */
	
	public void paintComponent(Graphics g,Dimension d){
		super.paintComponent(g);
		int width = (int)d.getWidth();  //Aktualna szerokośc okna, w którym wyświetlany jest komponent.
        int height = (int)d.getHeight(); //Aktualna wysokość okna, w którym wyświetlany jest komponent.
		g.setColor(Color.white);		//Kolor rysowania lądowiska - biały.
		int x0 = (int)((start_x)*(width/100.0)); //Aktualna współrzędna - x lewego gónego rogu lądowiska.
		int y0 =(int)((start_y)*(height/100.0)); //Aktualna współrzędna - y lewego gónego rogu lądowiska.
		int width0 = (int)((length)*(width/100.0)); //Aktualna szerokość lądowiska.
		int height0 = (int)((100 - start_y)*(height/100.0)); //Aktualna wyrokość lądowiska.
		g.fillRect(x0, y0,width0, height0); // Rysowanie lądowsika.
	}

}
