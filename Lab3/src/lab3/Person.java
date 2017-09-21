package lab3;

/**
 * 
 * @author wesmaxwell
 * @since 2017-09-13
 * 
 * I left the methods separate for future usability of the code.
 * For example, if somebody wanted to print only certain stats about
 * a person, or group of people.
 */

//changed currentYear from static to private. 2017-09-15
public class Person {
	private int currentYear = 2017;
	private String name;
	private int birthDate;
	private int age;

	// constructor
	public Person(String name, int bdate) {
		this.name = name;
		this.birthDate = bdate;
	}

	// Sets the birth year, used for later calculations.
	public void reset_birthday(int year) {
		birthDate = year;
	}

	// Displays the name of person.
	public void displayName() {
		System.out.println("Hello, my name is " + name + ".");
	}

	// Displays the person's birth year.
	public void displayBirthday() {
		System.out.printf("I was born in %d, ", birthDate);
	}

	// Calculates and displays the person's age in years.
	public void displayAge() {
		age = currentYear - birthDate;
		System.out.printf("and I am %d years old.", age);

	}

	// Determines if the person is considered a Senior.
	public void personIsSenior() {
		if (age >= 65) {
			System.out.println("\nI'm a senior citizen");
		} else {
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	// Gathers info about person.
	public Person() {
		Person John = new Person("John", 1957);
		John.displayName();
		John.displayBirthday();
		John.displayAge();
		John.personIsSenior();

	}

	public static void main(String[] args) {
		// Prints info about person.
		new Person();

	}

}