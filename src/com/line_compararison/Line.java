package com.line_compararison;

import java.util.Scanner;

public class Line {
    Point p1 = new Point();
    Point p2 = new Point();

    float length;

    short pointInitialization () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter value for point : ");
        return (short) scnr.nextInt();
    }

    float getLength () {
        return (float) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    String conversionOfLength (float lengthOfLine) {
        return String.valueOf(lengthOfLine);
    }

    String equalsOrNot (String lineOneLength, String lineTwoLength) {
        if(lineOneLength.equals(lineTwoLength)) {
            return "Lengths are equals";
        } else {
            return "Lengths are not equals";
        }
    }

    String comparisonOfLength (String lineOneLength, String lineTwoLength) {
        int result = (lineOneLength.compareTo(lineTwoLength));
        if (result < 0) {
            return "Line1 is Less than Line2";
        } else if (result > 0) {
            return "Line1 is Greater than Line2";
        } else
            return "Both the lines are Equal";
    }
}
