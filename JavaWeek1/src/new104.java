import javax.swing.JOptionPane;

public class new104 {

	public static void main(String[] args) {
		String timeParkingstr = JOptionPane.showInputDialog("Input Time Parking(minute):");
		int timeParking = Integer.parseInt(timeParkingstr);
		
		int hour = timeParking/60;
		int minute = timeParking%60;
		
		float hourPrice = hour*50;
		double minutePrice = minute*0.25;
		double totalPrice = hourPrice+minutePrice;
		JOptionPane.showMessageDialog(null, "You parking "+hour+" Hour "+
		minute+" Minute.\nAmount to be paid is "+totalPrice+" baht.");
	
	}

}
