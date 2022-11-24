import javax.swing.*;
public class Lap103 {

	public static void main(String[] args) {
		String small = JOptionPane.showInputDialog
				("How many small dish:");
		int smallDish = Integer.parseInt(small);
		String big = JOptionPane.showInputDialog
				("How many big dish:");
		int bigDish = Integer.parseInt(big);
		int smallPrice = smallDish*30;
		int bigPrice= bigDish*60;
		int totalPrice = smallPrice + bigPrice;
		JOptionPane.showMessageDialog(null, 
				"Your order"+small+" small dish"+" ("+smallPrice+")"+
				"\n\nYour order "+big+" big dish"+" ("+bigPrice+")"+"\n\n"
						
						+ "Amount to be paid is "+totalPrice+" baht.");

	}

}
