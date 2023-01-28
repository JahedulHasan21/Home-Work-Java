package hw5Q2Constructor;

public class Computer {
	public String brand;
	public int model;
	public double operatingSystem;
	public long price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from the default constructor of Computer class");
	}

	public Computer(String brand, int model, double operatingSystem, long price, char grade, boolean madeInUsa) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating System: " + operatingSystem
				+ " \nPrice: " + price + "\nGrade: " + grade + "\nMade in USA? : " + madeInUsa);
	}

	{

	}
}
