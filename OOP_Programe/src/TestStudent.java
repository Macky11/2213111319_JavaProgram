import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Student[] std = new Student[3];//Define Array object
		System.out.print("How many student in classroom: ");
		int student = scan.nextInt();
		Student[] std = new Student[student];
		for(int i = 0;i<std.length;i++) {
			std[i] = new Student();//Declare array object, call method Student()
			System.out.print("Input Student name: ");
			std[i].setName(scan.next());
			System.out.print("Input Student score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input Student score, again: ");
				std[i].setScore(scan.nextInt());
			}//end of while loop
			System.out.println("----------------------------------------");
			
		}//end of for loop
		
				
		//System.out.println("LIST OF PASS STUDENT(<=50)");
		System.out.println("--------------------------------------");
		/*for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+"("+std[i].getScore()+")");
			}*/
		for(Student _std : std) {
			if(_std.isPass()) {
				System.out.println(">> "+_std.getName()+" get grade "+_std.findGrade(_std.getScore()));
			}
		}

	}
}

