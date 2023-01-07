package ex1;

import java.util.*;

public class Lists {

    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.remove(list.indexOf(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> arrSquare = new ArrayList<>();
        int value = 1;
        while (value <= 10) {
            arrSquare.set(value, value * value);
            value++;
        }
        return arrSquare;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        for (int i = 0; i < target.size(); i++) {
            if (i < source.size()) {
                target.set(i, source.get(i));
            } else {
                target.remove(i);
            }
        }

    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
