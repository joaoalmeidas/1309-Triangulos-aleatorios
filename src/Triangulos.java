import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.JPanel;

public class Triangulos extends JPanel {

	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		SecureRandom aleatorio = new SecureRandom();
		
		Graphics2D g2d = (Graphics2D) g;
		
		
		
		for(int i = 0; i < aleatorio.nextInt(100000); i++) {
			
			GeneralPath triangulo = new GeneralPath();
			
			triangulo.moveTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			triangulo.lineTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			triangulo.lineTo(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
			triangulo.closePath();
			g2d.setColor(new Color(aleatorio.nextFloat(), aleatorio.nextFloat(), aleatorio.nextFloat(), 1));
			g2d.fill(triangulo);
			
		}
		
	}
	
}
