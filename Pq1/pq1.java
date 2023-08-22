package Pq1;

import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class pq1 {
    static int areaOfTriangle(int base, int height) {
        int area = (base * height) / 2;
        return area;
    }

    static boolean isSameNum(int firstNumber, int secondNumber) {
        boolean flag;
        if (firstNumber == secondNumber) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    static int totalVotes(int upvotes, int downvotes) {
        int totalvotes = upvotes - downvotes;
        return totalvotes;
    }

    static int perimeterOfRectangle(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        // write a function that takes in the base and height of a triangle and returns its area
        System.out.println("This is a program which takes in the base and height of a triangle and returns its are.");
        System.out.println("Enter the base of the triangle : ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle : ");
        int height = sc.nextInt();
        System.out.println("The area of the triangle is : " + areaOfTriangle(base, height));

        // create a function isSameNum which takes in two number as input and gives true if the numbers are equal otherwise false
        System.out.println("This is a program to check whether two number are equal of not");
        System.out.println("Enter the first number : ");
        int fn = sc.nextInt();
        System.out.println("Enter the second number : ");
        int sn = sc.nextInt();
        System.out.println(isSameNum(fn, sn));

        // make a method that takes upvotes and downvotes as input and returns the final votes subtracting downvotes from upvotes
        System.out.println("Enter the number of upvotes : ");
        int upvotes = sc.nextInt();
        System.out.println("Enter the number of downvotes : ");
        int downvotes = sc.nextInt();
        System.out.println("The total number of votes are : " + totalVotes(upvotes, downvotes));

        // write a function to calculate the perimeter of a rectangle
        System.out.println("Enter the length of the rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int breadth = sc.nextInt();
        System.out.println("The perimeter of the rectangle is : " + perimeterOfRectangle(length, breadth));
    }
}
