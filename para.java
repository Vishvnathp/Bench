package oops;
//Student class  for print name and age of student
class student {
	int i;
	String name;

	student(int k, String n) {
		i = k;
		name = n;
	}

	void display() {
		System.out.println(i + " " + name);
	}
}

public class para {
	public static void main(String args[]) {
		//Student class
		student s = new student(23, "Ankit");
		s.display();
	}

}
