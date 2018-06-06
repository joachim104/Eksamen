package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        int array[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Ikke sorteret array");
        ob.printArray(array);

        ob.bubbleSort(array);
        System.out.println("Sorteret array");
        ob.printArray(array);
    }

}
