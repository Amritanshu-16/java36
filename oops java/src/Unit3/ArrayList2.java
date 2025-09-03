package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a whole line of products
        String line = sc.nextLine();
        String[] items = line.split(" ");

        ArrayList<String> products = new ArrayList<>();

        // Add each word to ArrayList
        for (String item : items) {
            products.add(item);
        }

        // Print original list
        System.out.println("Original List: " + products);

        // Sort list
        Collections.sort(products);
        System.out.println("Sorted List: " + products);

        // Print 4th element if exists
        if (products.size() > 3) {
            System.out.println("4th element: " + products.get(3));
        } else {
            System.out.println("List has fewer than 4 elements.");
        }

        sc.close();
    }
}
