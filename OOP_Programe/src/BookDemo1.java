import java.util.*;
public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("input author e-mail : ");
		String email = scan.nextLine();
		
		Author1 auth = new Author1(name,email);
		System.out.println(auth);
		
		System.out.println();
		System.out.print("Input book title : ");
		scan.nextLine();
		String title = scan.nextLine();
		
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		Book1 Book1 =new Book1(title,auth,page);
		System.out.println(Book1);
		

	}

}
