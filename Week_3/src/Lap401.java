import java.util.*;
public class Lap401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstname = "";
		String lastname = "";		
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');		
		
		if(space == -1) {
			
			System.out.print("Incorrect Name");
		}
		else {
			firstname = fullname.substring(0,space);
			lastname = fullname.substring(space+1);
			
			System.out.println("First Name: "+firstname.toUpperCase());
			System.out.println("Last Name: "+lastname.toLowerCase());

	}
	}

}
