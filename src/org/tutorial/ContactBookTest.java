package org.tutorial;

public class ContactBookTest {

	public static void main(String[] args) {
	
//		HashTableContactBook book = new HashTableContactBook();
		HashTableContactBook book = new HashTableContactBook();
		
		book.addContact("Shah Jalal", "shah@gmail.com");
		book.addContact("Amena Bashar", "amena@gmail.com");
		book.addContact("Shah Jalal", "jalal@gmail.com");
		book.addContact("Cathrine", "cathrine@example.com");
        book.addContact("Jane", "cathrine@example.com");
 
        System.out.println("> Find contact");
        book.findEmailAddress("Alice");
        book.findEmailAddress("Jane");
        book.findEmailAddress("Shah Jalal");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Alice");
        book.listAllContacts();
		
	} // main method

} //HashTable class
