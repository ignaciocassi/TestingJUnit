package Utils;

import Models.Query;

import java.util.*;

public class Excercices {

    //Búsqueda Binaria mediante divide y conquista.
    //Caso división.
    //A=1
    //B=2
    //K=1
    //Complejidad temporal: O(n^k) = O(n).
    public static int BinarySearch(List<Integer> numbers, int start, int end, int x) {
        if (numbers.size() == 1) {
            return numbers.get(0) == x ? 0 : -1;
        }
        int half = (end + start) / 2;
        if (numbers.get(half) == x) {
            return half;
        } else {
            if (x < numbers.get(half)) {
                return BinarySearch(numbers, start, half, x);
            } else {
                return BinarySearch(numbers, half + 1, end, x);
            }
        }
    }

    //Factorial mediante divide y conquista.
    //A=1
    //B=1
    //K=1
    //Complejidad temporal: O(n^k+1) = O(n^2).
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + factorial(number - 1);
        }
    }

    public static void MergeSort(List<Integer> numbers, int start, int end) {
        if (start < end) {
            int half = (end + start) / 2;
            MergeSort(numbers, start, half);
            MergeSort(numbers, half + 1, end);
            Merge(numbers, start, end);
        }
    }

    private static void Merge(List<Integer> numbers, int start, int end) {
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[numbers.size()]));
        Collections.fill(result, 0);
        int half = (end + start) / 2;
        int i = start;
        int j = half + 1;
        for (int k = 0; k < end - start; k++) {
            if (j > end || numbers.get(i) <= numbers.get(j) && i <= half) {
                result.set(k, numbers.get(i));
                i++;
            } else {
                result.set(j, numbers.get(j));
                j++;
            }
        }
        for (int k = 0; k < (end - start); k++) {
            numbers.set(start + k, result.get(k));
        }
    }

    public static boolean isListOrdered(List<Integer> numbers, int start, int end) {
        int size = end-start;
        int half = (end + start) / 2;
        if (size == 0 || size == 1) {
            return true;
        } else {
            if (size == 2) {
                return numbers.get(0) < numbers.get(1);
            } else {
                boolean leftOrdered = isListOrdered(numbers, start, half);
                boolean rightOrdered = isListOrdered(numbers, half + 1, end);
                boolean middleOrdered = numbers.get(half) < numbers.get(half + 1);
                return leftOrdered && rightOrdered && middleOrdered;
            }
        }
    }

    public static void queryList() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<N; i++) {
            numbers.add(Integer.valueOf(sc.nextLine()));
        }

        int Q = Integer.parseInt(sc.nextLine());
        List<Query> queries = new ArrayList<>();
        for (int i=0; i<Q; i++) {
            String operation = sc.nextLine();
            if (operation.equals("Insert")) {
                int index = Integer.parseInt(sc.nextLine());
                int value = Integer.parseInt(sc.nextLine());
                Query myQuery = new Query(operation,index,value);
                queries.add(myQuery);
            } else if (operation.equals("Delete")) {
                int index = Integer.parseInt(sc.nextLine());
                Query myQuery = new Query(operation,index);
                queries.add(myQuery);
            }

        }

        for (Query query: queries) {
            if (query.getOperation().equals("Insert")) {
                numbers.add(query.getIndex(), query.getValue());
            } else if (query.getOperation().equals("Delete")) {
                numbers.remove(query.getIndex());
            }
        }
        System.out.println(numbers);
    }

    public static List<Integer> countApplesAndOranges(int s, int t, int a, int b, List<Integer> oranges, List<Integer> apples) {
        List<Integer> totalOrangesAndApplesOnTheHouse = new ArrayList<>(Arrays.asList(0,0));
        int orangesOnTheHouse = 0;
        int applesOnTheHouse = 0;
        for (int appleFallDistance: apples) {
            int fallLocation = b + appleFallDistance;
            if (fallLocation >= s && fallLocation <= t) {
                applesOnTheHouse++;
            }
        }
        for (int orangeFallDistance: oranges) {
            int fallLocation = a + orangeFallDistance;
            if (fallLocation >= s && fallLocation <= t) {
                orangesOnTheHouse++;
            }
        }
        totalOrangesAndApplesOnTheHouse.set(0,orangesOnTheHouse);
        totalOrangesAndApplesOnTheHouse.set(1, applesOnTheHouse);
        return totalOrangesAndApplesOnTheHouse;
    }



}
