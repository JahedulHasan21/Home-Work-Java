package hw05Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char stSex;
	public boolean isProgrammer;
	public float grade;

	public Student() {

		System.out.println("This is from the default constructor");
	}

	public Student(String stName, int stID, char stSex, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stSex = stSex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("Student Name: " + stName + "\nStudent ID: " + stID + "\nStudent Sex: " + stSex + "\nGrade: "
				+ grade + "\nJava Programmer? : " + isProgrammer);
	}

	{

	}
}