package Unit3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer>ll1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            ll1.add(sc.nextInt());
        Iterator itr=ll1.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        Collections.sort(ll1);
        System.out.println(ll1);
        System.out.println("Min "+ll1.getFirst());
        System.out.println("Max "+ll1.getLast());

    }
}
