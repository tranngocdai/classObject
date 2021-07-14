package Comparable;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3,"cac",false);

        System.out.println("Trước khí sắp xếp: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new Comparator();
        Arrays.sort(circles);

        System.out.println("Sau khi sắp xếp: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
