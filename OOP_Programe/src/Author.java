
public class Author {

	private String name;
	private String email;
	private char gender;
	
	
	public  Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public Author() {
		name = "";
		email = "";
		gender = ' ';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String GenderName() {
		if(gender == 'M' || gender == 'm') {
			return "Male";
		}else if(gender == 'F' || gender == 'f'){
			return "Female";
		}else {
			return "";
		}
	}
	public String toString() {
		return "Author name: "+ name +"("
	}
}
