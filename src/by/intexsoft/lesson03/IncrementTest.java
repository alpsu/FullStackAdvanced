package by.intexsoft.lesson03;

import java.util.Arrays;

public class IncrementTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 0;
        arr[++i] = --i;
        System.out.println("i=" + i);
        for (int ind : arr) {
            System.out.println(ind);
        }
        System.out.println("---------------------");
        int[] arr1 = {5, 9, 10};
        i = 0;
        arr1[i++] = arr1[i++]++;
        System.out.println("i=" + i);
        for (int ind : arr1) {
            System.out.println(ind);
        }
    }
}
// arr1[0] = arr1[1]
// arr1[1] = arr1[1] + 1
