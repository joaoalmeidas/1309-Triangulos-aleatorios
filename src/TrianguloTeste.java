import javax.swing.JFrame;

public class TrianguloTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Triangulos tri = new Triangulos();
		frame.add(tri);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
