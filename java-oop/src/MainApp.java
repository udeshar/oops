public class MainApp {
	public static void main(String[] args) {
		
		Student s1 = new Student("Udesh Arlekar", 2258);
		Student s2 = new Student("mayuresh jfgjsd", 2259);
		Student s3 = new Student("Aditya nabar", 2260);
		Student s4 = new Student("Gauresh kambli", 22561);
		
		System.out.println(s1.name + " "+s1.rollNo);
		System.out.println(s2.name + " "+s2.rollNo);
		System.out.println(s3.name + " "+s3.rollNo);
		System.out.println(s4.name + " "+s4.rollNo);
		
		s2.setName("mayuresh naik");
		System.out.println(s2.name + " "+s2.rollNo);

	}
}
