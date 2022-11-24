import javax.swing.*;

public class Example4 {
	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input product name:");
		String productUnitstr = JOptionPane.showInputDialog
				("Input product unit:");
		int productUnit = Integer.parseInt(productUnitstr);
		
	/*	String productPricestr = JOptionPane.showInputDialog
				("Input Price per unit :");
		float productPrice = Float.parseFloat(productPricestr); */
		float productPrice = Float.parseFloat(JOptionPane.showInputDialog
				("Input Price per unit :"));		
		float totalPrice = productPrice*productUnit;
		float pricewithVat= totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, 
				"Total price is : "+totalPrice+
				"\nAdd VAT 7% is "+pricewithVat);
	}
}