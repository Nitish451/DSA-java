 import java.util.Scanner;

// public class Average {
//     public static void printAverage(int a, int b, int c){
//         int avg = (a + b + c) / 3;
//         System.out.println("Average is : " + avg);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first number");
//         int a = sc.nextInt();
//         System.out.println("enter second number");
//         int b = sc.nextInt();
//         System.out.println("enter third number");
//         int c = sc.nextInt();
//         printAverage(a, b, c);
//     }
// }

// public class Average{
//     public static void main( String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter the size of array ");
//         int size =sc.nextInt();
//         int numbers[]=new int[size];

//         //input
//         System.out.print("enter the element of array ");
//         for(int i=0; i<size; i++){
//          numbers[i]=sc.nextInt();
//         }

//         //output
//         for(int i=0; i<size; i++) {
//             System.out.print(numbers[i]+" ");
//         }

//     }
// }

// public class Average{
//     public static void main( String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter the size of array ");
//         int size =sc.nextInt();
//         int numbers[]=new int[size];

//         //input
//         System.out.print("enter the element of array ");
//         for(int i=0; i<size; i++){
//          numbers[i]=sc.nextInt();
//         }
//         System.out.print("enter the number want to be searched of array ");
//         int item =sc.nextInt();
//         for( int i=0; i<size; i++){
//             if( numbers[i]==item){
//                 System.out.print("the index will be " +i);
//             } 
          
//             }
    
            
       

//     }}

public class Averages{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int i =sc.nextInt();
        // int j =sc.nextInt();
System.out.print("enter rows of matrix");
int rows =sc.nextInt();
System.out.print("enter col of matrix");
int cols= sc.nextInt();
System.out.println("enter element of array");
int [][] numbers =new int[rows][cols];
System.out.println("entrer the element of matrix");
for(int i=0; i<rows; i++){
    for( int j=0; j<cols; j++){
  numbers[i][j]=sc.nextInt();
    }
}
System.out.println("matrix will be");
for(int i=0; i<rows; i++){
    for( int j=0; j<cols; j++){
 System.out.print(numbers[i][j]+" ");
    }
    System.out.println();
}
    }
}
