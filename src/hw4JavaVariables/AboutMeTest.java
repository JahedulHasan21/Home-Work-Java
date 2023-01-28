package hw4JavaVariables;



public class AboutMeTest {

	public static void main(String[] args) {
		// When a class is instantialized, it means the object is created
		// When object is created from a class, that time constructor is initialized
		AboutMe Jahedul = new AboutMe(); // Here constructor is initialized
		
		Jahedul.name = "Pranta";
		Jahedul.age = 28;
		Jahedul.sex = 'M';
		Jahedul.myApartmentRent = 3000;
		Jahedul.myYearlySalary = 90000;
		Jahedul.myBankBalance = 1987666l;
		Jahedul.myGrade = 3.4556646;
		Jahedul.myHeight = 5.6788f;
		Jahedul.usResident = true;
		Jahedul.aboutMe(); // Here method is initialized 
		
		System.out.println("\n-----------------------------------------------------\n");
		
	  AboutMe Alex = new AboutMe();
		
		Alex.name = "Alex";
		Alex.age = 26;
		Alex.sex = 'F';
		Alex.myApartmentRent = 2500;
		Alex.myYearlySalary = 50000;
		Alex.myBankBalance = 2334456l;
		Alex.myGrade = 2.344656;
		Alex.myHeight = 3.46774f;
		Alex.usResident = false;
		Alex.aboutMe();		
	
		

	}

}
