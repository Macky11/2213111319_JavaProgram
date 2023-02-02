
public class Director {

	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Director(String name,String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		if(gender == 'M' || gender == 'm') {
			return "Male";
		}else if(gender == 'F' || gender == 'f'){
			return "Female";
		}else {
			return "null";
		}
	}
	
	public String toString() {
		return getName()+"( "+getEmail()+";"+getGenderName()+" )";
	}
}
