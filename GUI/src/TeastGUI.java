import java.awt.*;
import javax.swing.*;
public class TeastGUI extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	public TeastGUI() {
		setTitle("Area and Perimter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblLength = new JLabel("Enter the length: ",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width",SwingConstants.RIGHT);
		lblArea = new JLabel("Area: ",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimter: ",SwingConstants.RIGHT);
		
		txtLength = new JTextField("10");
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}

	public static void main(String[] args) {
		TeastGUI prog = new TeastGUI();

	}

}
