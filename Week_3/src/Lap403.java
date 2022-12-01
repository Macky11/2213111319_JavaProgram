import java.util.*;
public class Lap403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String checkmessage = message.toLowerCase();
		int check = 0;
		for(int i=0;i<checkmessage.length();i++) {
			if(checkmessage.indexOf("nichi")>=0) {
				check++;
			}
		}
		if(check == 0) {
			System.out.print(message);
		}
		else {
			System.out.print("Nichi is a sentence");
		}
		

	}

}
