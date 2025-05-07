package core_concepts;

import java.io.*;

//Main class demonstrating Serialization and Deserialization
public class SerializationVsDeserialization {

	public static void main(String[] args) {
		// Creating a Truck object to be serialized
		Truck truck = new Truck("Amol", 5899L, "A/P: Gaikwadi");

		// --- Serialization ---
		// Serialization is the process of converting an object into a byte stream
		// This is useful for:
		// 1. Saving object state to a file (e.g., caching, persistence)
		// 2. Sending objects over the network (e.g., RMI, sockets)
		// 3. Storing objects in databases as blobs (not ideal but sometimes used)

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("truck.ser"))) {

			// Writing the truck object to file
			out.writeObject(truck);
			System.out.println("Truck object serialized to truck.ser");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// --- Deserialization ---
		// Deserialization is the reverse process: reading the object from a byte stream
		// Common use cases:
		// 1. Restoring object state after a restart
		// 2. Receiving serialized objects over a network
		// 3. Cloning objects (deep copy using serialization)

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("truck.ser"))) {

			// Reading the object back from the file
			Truck deserializedTruck = (Truck) in.readObject();
			System.out.println("Deserialized Truck: " + deserializedTruck);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//Truck class must implement Serializable to allow object serialization
class Truck implements Serializable {

	// serialVersionUID helps with versioning during deserialization
	// It prevents InvalidClassException if class definition changes
	private static final long serialVersionUID = 1L;

	private String ownerName;
	private Long number;
	private String adress; // Note: Typo ("adress" instead of "address")—could affect future code clarity

	// Constructor
	public Truck(String ownerName, Long number, String adress) {
		this.ownerName = ownerName;
		this.number = number;
		this.adress = adress;
	}

	// Getters and setters
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	// Override toString for display
	@Override
	public String toString() {
		return "Truck [ownerName=" + ownerName + ", number=" + number + ", adress=" + adress + "]";
	}
}
