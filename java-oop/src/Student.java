
public class Student {
	String name;
	Integer rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	Integer addition(int x, int y) {
		return x+y;
	}
	
	String checkIfEven(int x) {
		if(x % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setRollno(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
