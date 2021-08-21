package exercises;

import java.util.Scanner;

public class FindMPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles have you driven: ");
        int miles = input.nextInt();
        System.out.print("How many gallons of gas has your vehicle consumed: ");
        int gasConsumed = input.nextInt();
        int mpg = miles/gasConsumed;
        System.out.print("Your vehicle's MPG is "+mpg+"!");
    }
}
