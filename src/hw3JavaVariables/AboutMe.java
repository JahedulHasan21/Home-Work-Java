package hw3JavaVariables;


public class AboutMe {

	public String myName; // Variable Declared
	public String name = "Jahedul Hasan"; // Variable Initialized
	public int age = 28; // Variable Initialized
	public char sex = 'M'; // Variable Initialized
	public short myApartmentRent = 3000; // Variable Initialized
	public boolean usResident = true; // Variable Initialized

	public static void main(String[] args) {
 
		AboutMe aboutMe = new AboutMe();

		System.out.println(aboutMe.name);
		System.out.println("My Age: " + aboutMe.age + "\nMy Sex: " + aboutMe.sex);

	}

}
