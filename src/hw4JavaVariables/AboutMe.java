package hw4JavaVariables;

public class AboutMe {
	public String name = "Pranta"; // not a pure primitive data

	// Primitive data type -- 8 type
	public byte age; // in byte type data is not more than 127 and less than -128
	public short myApartmentRent; // in short type data is not more than 32767 and less than -32767
	public int myYearlySalary; // in integar type data is not more than 2147483647 and less than -2147483647
	public long myBankBalance; // We must to use lower case L at the end of long value. The range is same
	public float myHeight; // We must have to use lower case F at the end of float value
	public double myGrade; // Mostly used cause they have more limit
	public char sex; // char is followed by the rules here (Single letter with upper case and single quotation)
	public boolean usResident; // boolean followed by the rules here (only true and false with small case, no quotation)

	// This is a constructor 
	// Here Constructor is declared
	// Constructor Naming = First access modifier then same as ClassName then ()
	public AboutMe() {
		System.out.println("Hello");
		System.out.println("\nThis is all about me : ");
		
	}
	
	// This is a method 
	// Here method is implemented (It can't declared)
	// Method Naming = First access modifier then same as packageName then ()

	public void aboutMe() {
		
		// This is Method Body
		// The Method body can call the variables from class by syso
		// We can also use the concatenation
		
		System.out.println("My Name: " + name + "\nMy age : " + age + "\nMy Sex: " + sex + "\nMy Yearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Height: " + myHeight + "\nMy US Resident Status: " + usResident );
		
}
}