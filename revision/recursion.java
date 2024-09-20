import java.util.Scanner;

// class Recursion{
//     public static void print(int n){
//         if(n==6){
//             return;
//         }
//         System.out.print(n);
//         print(n+1);
//     }
//     public static void main(String[] args){
//         int n=1;
//         print(n);
//     }
// }

class recursion{
    public static int Calfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact1=Calfactorial(n-1);
        int fact= n*fact1;
        return fact;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
       
       int result= Calfactorial( n);
       System.out.println("the factorial will be:"+ result);
    }
}
