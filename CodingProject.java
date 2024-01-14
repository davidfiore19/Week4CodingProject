package week4;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 
	// array of int called ages: 	
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		
		int firstElement = ages[0]; 
		int lastElement = ages[ages.length - 1]; 
	// subtracting the first element from the last 	
		System.out.println(lastElement - firstElement);
		
		int[] ages2 = new int[] {3, 5, 29, 40, 32, 7, 12, 13, 21}; 
		// using a for loop to get the sum of the ages first
			double sum = 0;
			for (int age : ages2) {
				sum += age; 
			}   // using the sum, i am able to calculate the average of all the ages
			double average = sum/ages2.length; 
			System.out.println(average);
		//2. 
		//creating an array	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		 //finding the sum of letters in the Array
		int newSum = 0; 
		for (String name : names) { 
			newSum += name.length();
		}//dividing the sum by the length to get the average
		System.out.println(newSum % names.length);
		
		//3. 
		System.out.println(names.length - 1);
		//4. 
		System.out.println(names[0]);
	
		
		//5. 
		 int[] nameLengths = new int[names.length];
		 for (int a = 0; a < names.length; a++) {
			 nameLengths[a] = names[a].length();
			 
		 }
			 
		 }
		 
			//6.
		
		
		
		
		//7.
	public static String concatenateString(String state, int count) {
		String state = "Arizona";
		int num = 4; 
				
		
		String secondString = ""; 
		for (int x = 0; x < num; x++) { 
			secondString += state;
		}
	System.out.println(secondString);
	}
		
		//8. 
	public static String fullName(String firstName, String lastName) {
			String firstName = "Michael";
			String lastName = "Jordan"; 
			String fullName = (firstName + " " + lastName);
			
				
			return fullName;
}
	
	//9. 
	public boolean sumOfArrray(int[] array) { 
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			if (sum += array[i] > 100);
			return true; 
		
			}
		//10. 
		public static double average(double[] nums) { 
			double sum = 0;
			for(int x = 0; x < array.length; x++) {
				sum = sum + array[x]; 
				}
			average = sum/array.length;
			return average; 
			
		}
		//11. 
public static boolean whichAverageIsHigher(double[] firstArray, double[]secondArray) {
		double avgOfFirstArray = calculateAverage(firstArray);
		double avgOfSecondArray = calculateAverage(secondArray); 
		
		return avgOfFirstArray > avgOfSecondArray;

}	
		//12.
public static boolean willBuyADrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket >= 10.50); 
		
		return true; 
}
		
		}
	
			
		
		


		
		
	
		
	}


