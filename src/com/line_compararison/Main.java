package com.line_compararison;

public class Main {

    public static void main (String[] args) {
        Line l1 = new Line();

        l1.p1 = new Point();
        System.out.println("Enter value for 4 points of Line1");
        l1.p1.x = l1.pointInitialization();
        l1.p1.y = l1.pointInitialization();

        l1.p2 = new Point();
        l1.p2.x = l1.pointInitialization();
        l1.p2.y = l1.pointInitialization();

        l1.length = l1.getLength();
        String lengthOneConversion = l1.conversionOfLength(l1.length);
        System.out.println("\nFirst line length : " + l1.length + "\n");

        Line l2 = new Line();

        l2.p1 = new Point();
        System.out.println("Enter value for 4 points of Line2");
        l2.p1.x = l2.pointInitialization();
        l2.p1.y = l2.pointInitialization();

        l2.p2 = new Point();
        l2.p2.x = l2.pointInitialization();
        l2.p2.y = l2.pointInitialization();

        l2.length = l2.getLength();
        String lengthTwoConversion = l2.conversionOfLength(l2.length);
        System.out.println("\nSecond line length : " + l2.length);

        Line line = new Line();
        //To check two lines are equals or not using java equals method.
        String check = line.equalsOrNot(lengthOneConversion, lengthTwoConversion);
        System.out.println("\nCheck Result : " + check);

        //To compare two lines using java compareTo method.
        String compare = line.comparisonOfLength(lengthOneConversion, lengthTwoConversion);
        System.out.println("\nCompareTo Result : " + compare);
    }
}
