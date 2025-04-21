package leetcode;

import java.util.Scanner;

public class trappingwater {
    
    public static int water(int[] value) {
        int n = value.length;
        if (n == 0) return 0;

        int[] maxleft = new int[n];
        int[] maxright = new int[n];

        // Fill maxleft from left to right
        maxleft[0] = value[0];
        for (int i = 1; i < n; i++) {
            maxleft[i] = Math.max(maxleft[i - 1], value[i]);
        }

        // Fill maxright from right to left
        maxright[n - 1] = value[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxright[i] = Math.max(maxright[i + 1], value[i]);
        }

        // Calculate trapped water
        int totalwater = 0;
        for (int i = 0; i < n; i++) {
            totalwater += Math.max(0, Math.min(maxleft[i], maxright[i]) - value[i]);
        }

        return totalwater;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the limit of the numbers: ");
        int number = num.nextInt();

        int[] newnum = new int[number];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < number; i++) {
            newnum[i] = num.nextInt();
        }

        System.out.println("You entered:");
        for (int value : newnum) {
            System.out.print(value + " ");
        }

        int total = water(newnum);
        System.out.println("\nThe total water is: " + total);
    }
}
