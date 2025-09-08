package Unit3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vt= new Vector<>(5, 5);
        vt.add("First");
        vt.add("Second");
        vt.add("First");
        vt.add("Second");
        vt.add("First");
        vt.add("Second");
        vt.add( 2,"Forth");
        System.out.println(vt.capacity());
        System.out.println(vt.size());
        System.out.println(vt.remove(0));
        System.out.println(vt);
    }
}
