package org.tutorial;

public class Array {

	//An array is a type of variable which/that can store multiple values. OR
	//Array is a data structure in java that  can hold one or more values in a single variable
	//It is like a list of items but it always contains similar data type values. OR
	//Array in java is a collection of similar type of values
	//Array index starts with at 0
	//Syntax: ArrayDataType[] ArrayName = new ArryDataType[size of an Array];
	
	public static void main(String[] args) {
		// One way to create an Array
		int[] numbers1 = {1, 2, 3, 4};
		// Print a single item
		System.out.println(numbers1[0]);

		//Another way to create an Array
		int[] numbers2 = new int[4];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		// Print a single item
		System.out.println(numbers2[3]);

		System.out.println("Printing all the items using for each loop");
		// Print all the items using for each loop
		for (int number : numbers2){
			System.out.println(number);
		}
		
		System.out.println("Printing all the items using for loop");
		// Print all the items using for loop
		for (int i = 0; i <= numbers2.length - 1; i++){
			System.out.println(numbers2[i]);
		}
		
		// Passing an Array to a method
		String[] aMake = {"Toyota", "BMW", "Nissan", "Chrysler", "GMC"};
		printArray(aMake);
		
		// Returning an Array from a method
		String[] aModel = returnArray();
		aModel[0] = "Camry";
		aModel[1] = "X5";
		aModel[2] = "Maxima";
		aModel[3] = "Town & Country";
		aModel[4] = "Acadia";
		
		for (String item : aModel){
			System.out.println("Printing all the model ==>" +item);
		}
		
	} // main method 
	
	// This method accept Array as an argument of type String
	public static  void printArray(String[] array){
		for (int i = 0; i <= array.length-1; i++){
			System.out.println("Printing all the values of an array ==> " +array[i]);
		}	
	} // printArray method
	
	// This method returns an Array of type String
	public static String[] returnArray(){
		String [] aArray = new String[5];
		return aArray;
	} // returnArray method
	

} // Array Class
