
import java.util.Arrays;

public class Coding_Project_Week_04 {
	
	
	public static void main(String[] args) {
	
		// 1. Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //array[8]

        // a. Programmatically subtract the first element from the last element
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction for ages: " + result);

        // b. Create a new array of int called ages2 with 9 elements
        int[] ages2 = {7, 42, 32, 11, 35, 58, 9, 8, 74};  //array[9]
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction for ages2: " + result2);
        //the use of dynamic indexes works for arrays of different lengths   result != result2

        // c. Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age; // Add each age to the sum
        }
        double average = (double) sum / ages.length; // Calculate average age
        System.out.println("Average age: " + average);

        // 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length(); // Add length of each name to totalLetters
        }
        double avgLetters = (double) totalLetters / names.length; // Calculate average
        System.out.println("Average letters per name: " + avgLetters);

        // b. Concatenate all the names
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" "); // Concatenate names
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

        // 3. Access the last element of any array
        int lastElement = ages[ages.length - 1];
        System.out.println("Last element of the 'ages' array: " + lastElement);

        // 4. Access the first element of any array
        int firstElement = ages[0];
        System.out.println("First element of the 'ages' array: " + firstElement);

        // 5. Create a new array of int called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); // Store length of each name
        }

        // 6. Calculate the sum of elements in the nameLengths array
        int sumNameLengths = 0;
        for (int length : nameLengths) {
            sumNameLengths += length; // Calculate total sum of name lengths
        }
        System.out.println("Sum of name lengths: " + sumNameLengths);

        // 7. Method that concatenates a word n times
        System.out.println(concatenateWordNTimes("Hello", 3));

        // 8. Method that returns full name
        System.out.println(getFullName("John", "Doe"));

        // 9. Method that checks if sum of array is greater than 100
        int[] numbers = {20, 30, 60};
        int[] numbers2 = {8, 4, 20, 15, 11, 30};
        System.out.println(isSumGreaterThan100(numbers));    //true
        System.out.println(isSumGreaterThan100(numbers2));   //false

     // 10. Method that calculates average of elements in an array
        double[] doubles = {2.5, 4.8, 6.2};
        System.out.println(calculateAverage(doubles));

        // 11. Method that compares averages of two arrays
        double[] arr1 = {10.5, 20.3, 15.7};
        double[] arr2 = {5.5, 12.8, 8.6};
        System.out.println("Arr1: " + Arrays.toString(arr1)); //show arr1
        System.out.println("Arr2: " + Arrays.toString(arr2)); 
        System.out.println("Is arr1>arr2?: "+ compareAverages(arr1, arr2));   //compare arr1>arr2

        // 12. Method that determines if to buy a drink based on weather and money
        System.out.println(willBuyDrink(true, 15.0));   //true
        System.out.println(willBuyDrink(true, 9.0));    //false
        System.out.println(willBuyDrink(false, 20.0));  //false
    }

    // Method that concatenates a word n times
    public static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word); // Concatenate word n times
        }
        return result.toString();
    }

    // Method that returns full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName; // Concatenate first and last name
    }

    // Method that checks if sum of array is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Calculate sum of elements in the array
        }
        return sum > 100;
    }

    // Method that calculates average of elements in an array
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num; // Calculate sum of elements
        }
        return sum / array.length; // Calculate average
    }

    // Method that compares averages of two arrays
    public static boolean compareAverages(double[] array1, double[] array2) {
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);
        return avg1 > avg2; // Compare averages
    }

    // Method that determines if to buy a drink based on weather and money
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50; // Check conditions to buy drink
    }
		
	
      
}
	