package daily;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * (tipPercent*0.01);

        System.out.println("Tip: " + tip);

        double tax = mealCost * (taxPercent*0.01);
        System.out.println("Tip: " + tax);

        double parcialCost = mealCost + tip + tax;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(parcialCost);

        // Print your result

        System.out.println(totalCost);
    }
}
