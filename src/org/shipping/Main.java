package org.shipping;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String w = " pounds";
        String c = " dollors";
        double a,b,d,e;
        a = 2.50;
        b = 4.50;
        d = 7.50;
        e = 10.50;
        System.out.println("Hello! Welcome to Lex shipping Company.\nPlease enter the weight of package to be shipped:");Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        input.close();

        if(weight >0 && weight<=2) {
            System.out.println("For packages of weight:" + weight + w + "\n The cost of shipping is:" + a +  c);
            System.out.println("\nThanks for doing business with us");
        }
        else if(weight > 2 && weight <= 4) {
            System.out.println("For packages of weight:" + weight  + w + "\n The cost of shipping is:" + b + c);
            System.out.println("\nThanks for doing business with us");
        }else if(weight>4 && weight<=10) {
            System.out.println("For packages of weight:" + weight  + w + "\n The cost of shipping is:" + d +  c);
            System.out.println("\nThanks for doing business with us");
        }
        else if(weight> 10 && weight <= 20) {
            System.out.println("For packages of weight:" + weight  + w + "\n The cost of shipping is:" + e +  c);
            System.out.println("\nThanks for doing business with us");
        }else if(weight > 20) {
            System.out.println("The package cannot be shipped");
            System.out.println("\nThanks for doing business with us");
        }else {
            System.out.println("Invalid input");
        }
    }
}
