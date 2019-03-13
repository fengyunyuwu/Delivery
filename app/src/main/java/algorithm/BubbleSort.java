package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * author:Ken
 * time:2019/3/13
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] integers = new int[]{1, 4, 2, 5, 6, 8, 1, 7, 9, 10, 6};
        int[] sortInt = integers.clone();
        sort(sortInt);
        int[] selectInt = integers.clone();
        select(selectInt);
        int[] insertInt = integers.clone();
        insert(insertInt);
        quickSort(integers, 0, integers.length - 1);
        print("\n快速排序:", integers);
    }

    /**
     * 冒泡排序
     */
    private static void sort(int[] integers) {
        int temp;
        int pos = 0;
        int k = integers.length - 1;
        boolean flag;
        if (integers == null || integers.length <= 1) {
            return;
        }
        for (int i = 0; i < integers.length - 1; i++) {
            flag = false;
            for (int j = 0; j < k; j++) {
                if (integers[j] > integers[j + 1]) {
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                    flag = true;
                    pos = j;
                }
            }
            if (!flag) {
                break;
            }
            k = pos;
        }
        print("冒泡排序：", integers);
    }

    /**
     * 选择排序
     */
    private static void select(int[] integers) {
        int temp;
        int min;
        for (int i = 0; i < integers.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[j] < integers[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = integers[i];
                integers[i] = integers[min];
                integers[min] = temp;
            }
        }
        print("\n选择排序:", integers);
    }

    /**
     * 插入排序
     */
    private static void insert(int[] ints) {
        int temp;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ints[j] < ints[j - 1]) {
                    temp = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = temp;
                } else {
                    break;
                }
            }
        }
        print("\n插入排序:", ints);
    }

    /**
     * 快速排序
     */
    private static void quickSort(int a[], int l, int r) {
        if (l >= r) {
            return;
        }

        int i = l;
        int j = r;
        //选择第一个数为key
        int key = a[l];

        while (i < j) {
//从右向左找第一个小于key的值
            while (i < j && a[j] >= key) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }
//从左向右找第一个大于key的值
            while (i < j && a[i] < key) {
                i++;
            }

            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        //递归调用
        quickSort(a, l, i - 1);
        //递归调用
        quickSort(a, i + 1, r);
    }


    private static void print(String name, int[] integers) {
        System.out.println(name);
        for (int i : integers) {
            System.out.print(i + " ");
        }
    }


}
