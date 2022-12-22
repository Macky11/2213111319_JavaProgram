
public class Student {

	private String name;
	private int score;
	
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int Score) {
		 score = Score;
	}
	public int getScore() {
		return score;
	}
	public boolean checkScore() {
		if(score >= 0 && score <= 100) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isPass() {
		if(score>=50) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeA() {
		if(score<=100 && score >=80) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeBP() {
		if(score<=79 && score >=75) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeB() {
		if(score<=74 && score >=70) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeCP() {
		if(score<=69 && score >=65) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeC() {
		if(score<=64 && score >=60) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeDP() {
		if(score<=59 && score >=55) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeD() {
		if(score<=54 && score >=50) {
			return true;
		}else {
			return false;
		}
	}
	public boolean gradeF() {
		if(score<=49 && score >=0) {
			return true;
		}else {
			return false;
		}
	}
	public String findGrade(int scr) {
			if(scr<=100 && scr >=80) {
				return "A";
			}else if(scr<=79 && scr >=75) {
				return "B+";
			}else if (scr<=74 && scr >=70) {
				return "B";
			}else if(scr<=69 && scr >=65) {
				return "C+";
			}else if (scr<=64 && scr >=60) {
				return "C";
			}else if(scr<=59 && scr >=55) {
				return "D+";
			}else if(scr<=54 && scr >=50) {
				return "D";
			}else if(scr<=49 && scr >=0) {
				return "F";
			}
		return "";
	}
}
