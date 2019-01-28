import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Triangulos extends JPanel {

	final SecureRandom aleatorio = new SecureRandom();
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath triangulo = new GeneralPath();
		
		
		
		for(int i = 0; i < aleatorio.nextInt(100); i++) {
			
			g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			triangulo.moveTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			triangulo.lineTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			triangulo.lineTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
			triangulo.closePath();
			
			g2d.fill(triangulo);
			
		}
		
	}
	
}
