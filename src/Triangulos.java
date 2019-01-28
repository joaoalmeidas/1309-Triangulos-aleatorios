import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Triangulos extends JPanel {

	final SecureRandom aleatorio = new SecureRandom();
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		Polygon poligono = new Polygon();
		
		
		
		for(int i = 0; i < aleatorio.nextInt(10); i++) {
			
			g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			poligono.addPoint(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			poligono.addPoint(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			poligono.addPoint(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
			g2d.fillPolygon(poligono);
			
		}
		
	}
	
}
