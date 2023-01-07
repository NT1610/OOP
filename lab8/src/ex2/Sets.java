package ex2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int firstSetValue : first) {
            for (int secondSetValue : second) {
                if (secondSetValue == firstSetValue) {
                    intersection.add(firstSetValue);
                }
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        for (int firstSetValue : first) {
            for (int secondSetValue : second) {
                union.add(firstSetValue);
                union.add(secondSetValue);
            }
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        intersectionSet.addAll(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        union.addAll(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for (int value : source) {
            list.add(idx, value);
            idx++;
        }
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>();
        set.addAll(source);
        return toList(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < source.size() - 1; i++) {
            if (list.contains(source.get(i)) == false) {
                list.add(source.get(i));
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        String firstRecurring = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    firstRecurring += s.charAt(i);
                    break;
                }
            }
        }
        return firstRecurring;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> allRecurring = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    allRecurring.add(s.charAt(i));
                }
            }
        }
        return allRecurring;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] arr = new Integer[source.size()];
        int idx = 0;
        for (int value : source) {
            arr[idx] = value;
            idx++;
        }
        return arr;
    }

    public static int getFirst(TreeSet<Integer> source){
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source){
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value){
        return source.ceiling(value);
    }
}
