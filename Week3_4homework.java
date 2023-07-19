package homework3_4;



public class Week3_4homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 26;
		
	//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		
		//a and b
		int subtractfl = ages[ages.length - 1] - ages[0];
		//System.out.println(subtractfl);
		
		//c
		double avgage = 0;
		int totalage = 0;
		for (int i = 0; i < ages.length; i++) {
			totalage = totalage + ages[i];
			avgage = totalage / ages.length;
			//System.out.println(totalage);
		}
		//System.out.println(avgage);
		//(28.44)
		
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	//a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int nameChars = 0;
		for (int c = 0; c < names.length; c++) {
			nameChars += names[c].length();
		}
		//System.out.println(nameChars);
	//b
		String nameList = "";
		for(int c = 0; c<names.length; c++) {
			nameList = nameList + names[c] + " ";
		}
		//System.out.println(nameList);
		
//3.	How do you access the last element of any array?
		int[] example = {13, 14, 15, 16, 17};
		//System.out.println(example[example.length - 1]);
		
//4.	How do you access the first element of any array?
		//System.out.println(example[0]);
		
//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLength = new  int[names.length];
		for(int i = 0; i<names.length; i++) {
			nameLength[i] = names[i].length();
			}
		//System.out.println(Arrays.toString(nameLength));
		
//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumNameLength = 0;
		for(int i = 0; i<nameLength.length; i++) {
			sumNameLength = sumNameLength + nameLength[i];
		}
		//System.out.println(sumNameLength);
		
//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//System.out.println(wordMultiplier("Hello", 3));
		
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//System.out.println(fullName("Solomon", "Hufford"));
		
//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] sums = {13, 40, 50, 18};
		//System.out.println(higherOrLow(sums));
		
//10.	Write a method that takes an array of double and returns the average of all the elements in the array
		double[] numbers = {10.6, 11.0, 12.2, 20.6};
		//System.out.println(arrayAvg(numbers));
		
//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] secondArray = {12.6, 14.2, 16.7, 18.9, 20.3};
		double[] firstArray = {6.40, 3.20, 18.7, 11.60, 3.4};
		//System.out.println(arrayComparison(firstArray, secondArray));
		
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 15.00;
		//System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
/* 13.
 * This method is designed to tell me when to do my work for school.
 * I created this method to make a poke at myself for late assignment haha.
 */
		boolean isCaughtUp = false;
		boolean hasFreeTime = true;
		//System.out.println(doSchoolWork(isCaughtUp, hasFreeTime));
	} 
	

	
	
//7. METHOD FOR 7.
	static String wordMultiplier(String word, int n) {
		String result = "";
		for (int i = 0; i<n; i++) {
			result = result + word;
		}
		return result;
	}
	
//8. METHOD FOR 8.	
	static String fullName(String x, String y) {
		String fullN = "";
		fullN = x + " " + y;
		return fullN;
	}
	
//9. METHOD FOR 9.
	static boolean higherOrLow(int[] x) {
		int sum = 0;
		for (int number : x) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

//10. METHOD FOR 10.
	static double arrayAvg(double[] x) {
		int sum = 0;
		int avg = 0;
		for(double number : x) {
			sum += number;
		}
		sum = sum / x.length;
		return sum;
	}
	
//11. METHOD FOR 11.
	static boolean arrayComparison(double[] x, double[] y) {
		double sumOne = 0;
		double sumTwo = 0;
		double avgOne = 0;
		double avgTwo = 0;
		for(double number : x) {
			sumOne += number;
		}
		for (double number : y) {
			sumTwo += number;
		}
		avgOne = sumOne / x.length;
		avgTwo = sumTwo / y.length;
		
		if(avgOne > avgTwo) {
			return true;
		} else {
			return false;
		}
	}
	
//12. METHOD FOR 12.
	static boolean willBuyDrink(boolean x, double y) {
		if(x == true && y > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
//13. METHOD FOR 13.
	static boolean doSchoolWork (boolean x, boolean y) {
		if(x == false && y == true) {
			return true;
		} else {
			return true;
		}
		// I bet you didn't expect this answer haha!
	}
}
