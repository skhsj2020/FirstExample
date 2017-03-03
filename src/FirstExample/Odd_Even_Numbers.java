
package FirstExample;

import java.util.Scanner;
public class Odd_Even_Numbers {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int z = sc.nextInt();
            countup(z);    
    }
    public static void countup(int n){
        if(n % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
