import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		Book bk = new Book();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input book title  : ");
		bk.setTitle(scan.nextLine());
		System.out.print("Input book price  : ");
		bk.setPrice(scan.nextFloat());
		System.out.print("Input publish year: ");
		bk.setPublishyear(scan.nextInt());
		
		System.out.print(bk);

	}

}
