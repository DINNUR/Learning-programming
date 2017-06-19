package org.shone.learning.chapter3;

public class BasicMath {
    public static void main(String[] args) {
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;

        System.out.println("Arithmetic operations at integers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("Arithmetic operations at doubles");
        double da = 1 + 1;
        double db = a * 3;
        double dc = b / 4;
        double dd = c - a;
        double de = -d;

        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}