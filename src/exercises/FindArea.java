package exercises;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is width of the rectangle: ");
        int width = input.nextInt();
        System.out.print("What is the length of the rectangle: ");
        int length = input.nextInt();
        int area = length * width;
        System.out.println("The area of your rectangle is "+area+"!");
        input.close();
    }
}
