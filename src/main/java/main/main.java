package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Started program!");
        Scanner scanner = new Scanner(System.in);
        LinkedListOpr linkedListOpr = new LinkedListOpr();
        System.out.print("How many elements? ");
        int elements = scanner.nextInt();
        for (int i = 0; i < elements ; i++) {
            System.out.print("Input element no. " + i + ": ");
            linkedListOpr.add(scanner.nextInt());
        }
        linkedListOpr.print();
        System.out.print("\nWhich element to search? ");
        int search = scanner.nextInt();
        linkedListOpr.printNthElement(search);
        String sd = "sadad";
    }
}
