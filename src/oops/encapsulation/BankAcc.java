package oops.encapsulation;

public class BankAcc {

	/*
	 * Encapsulation is one of the fundamental concepts of Object-Oriented
	 * Programming (OOP). It refers to wrapping the data (variables) and the code
	 * (methods) that work on the data into a single unit—usually a class.
	 * 
	 * The main goal is to restrict direct access to some of the object's
	 * components, which is a way of protecting the data and ensuring it's used
	 * properly.
	 */

	public static void main(String[] args) {
		BankAccDetails b = new BankAccDetails();
		b.setName("Amol Gaikwad");
		b.setEmail("shriamolg@gmail.com");
		b.setBalance(4256131.45f);

		System.out.println(b.getName());
		System.out.println(b.getEmail());
		System.out.println(b.getBalance());
	}
}