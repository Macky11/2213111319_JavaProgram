import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();
		String firstname;
		int space = fullName.indexOf(' ');
		firstname = fullName.substring(0,space);		
		String initial = abbreviatName(fullName);
		System.out.println(initial.toUpperCase() + firstname);
		

	}
public static String abbreviatName(String fullname) {
	String iniTial = "";
	for(int i=0;i<fullname.length();i++) {
		if(fullname.charAt(i) ==' ') {				
			iniTial += fullname.charAt(i + 1);
			iniTial += ".";
		}
}
	return iniTial;
}
}
