import javax.swing.*;
public class shop100Baht {

	public static void main(String[] args) {
		Product1 arnupat = new Product1();
		
		arnupat.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: ")));
		
		JOptionPane.showMessageDialog(null,arnupat);

	}

}
