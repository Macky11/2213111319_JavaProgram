import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TempConversion extends JFrame {
	
	private JLabel lblCelsius;
	private JLabel lblFarenheit;
	
	private JTextField tfCelsius;
	private JTextField tfFarenheit;
	
	private static final int WIDTH=500;
	private static final int HEIGHT=100;
	private static final double FTOC=5.0/9.0;
	private static final double CTOF=9.0/5.0;
	private static final int OFFSET=32;
	
	
	public TempConversion() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		lblCelsius =new JLabel("Temp in Celsius",SwingConstants.RIGHT);
		lblFarenheit =new JLabel("Temp in Farenheit",SwingConstants.RIGHT);
		
		tfCelsius =new JTextField(10);
		tfFarenheit =new JTextField(10);
		
		c.add(lblCelsius);
		c.add(tfCelsius);
		c.add(lblFarenheit);
		c.add(tfFarenheit);
		
		CelHandler celsiusHandler = new CelHandler();
		tfCelsius.addActionListener(celsiusHandler);
		
		FahrHandler farenheitHandler = new FahrHandler();
		tfFarenheit.addActionListener(farenheitHandler);
		
		setTitle("Temperture in Celsius");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				
	}
	private class CelHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,farenheit;
			celsius=Double.parseDouble(tfCelsius.getText());
			farenheit=celsius *CTOF+OFFSET;
			tfFarenheit.setText(String.format("%.2f",farenheit));
			
			
		}
	}
	
	private class FahrHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,farenheit;
			farenheit=Double.parseDouble(tfFarenheit.getText());
			celsius=(farenheit-OFFSET)*FTOC;
			tfCelsius.setText(String.format("%.2f",celsius));
			
			
		}
	}

	public static void main(String[] args) {
		TempConversion prog = new TempConversion();

	}

}
