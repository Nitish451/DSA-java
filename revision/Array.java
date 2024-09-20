import java.util.Scanner;



public class Array{
    public static int[] nitish(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Return null if no solution is found
    }
        

    }
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
   int numbers[]=new int[5];
    System.out.println("enter the numbers");
    for(int i=0; i<5; i++){
        numbers[i]=sc.nextInt();
    }
    for(int i=0; i<numbers.length; i++){
        System.out.println(numbers[i]);
    }
    System.out.println("enter the target value");
    int target = sc.nextInt();
    int[] result = nitish(numbers, target);
   
    System.out.println("Indices of numbers that add up to the target are: ", result);
 
} 


public class Array {

    // Method to find two indices whose values sum up to the target
    public static int[] findTwoSumIndices(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Return null if no solution is found
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = new int[5];
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
               numbers[i] = sc.nextInt();
            }

            System.out.println("The entered numbers are:");
            for (int number : numbers) {
                System.out.println(number);
            }

            System.out.println("Enter the target value:");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer for the target.");
                sc.next(); // Clear invalid input
            }
            int target = sc.nextInt();

            int[] result = findTwoSumIndices(numbers, target);
           // if (result != null) {
                System.out.println("Indices of numbers that add up to the target are: " + result[0] + " and " + result[1]);
            // } else {
            //     System.out.println("No two numbers add up to the target.");
            // }
        } // Scanner is automatically closed here
    }
}


