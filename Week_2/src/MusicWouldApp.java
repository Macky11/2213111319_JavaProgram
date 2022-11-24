import javax.swing.JOptionPane;
public class MusicWouldApp {

	public static void main(String[] args) {
		String cdId;
		String cdTitle;
		int cdQuantity;
		String quan;
		double cdPrice;
		double cdSubtotal = 0;
		double cdTotal;
		final double TAX_RATE = .0625;
		
		cdId = JOptionPane.showInputDialog("This Progeam calculate the total cost of a CD order"+"\nPlease enterthe ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		
		cdSubtotal = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the  CD in U.S dollars"));
		cdPrice  = Double.parseDouble(cdTotal);
				
		cdQuantity = JOptionPane.showInputDialog("Please enter quantity to be purchased");
		cdQuantity  = Integer.parseDouble(cdQuantity);
		
		cdSubtotal = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the  CD in U.S dollars"));
		cdPrice  = Double.parseDouble(cdQuantity)
	}

}
