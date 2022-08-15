package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));




    }


private static <T> void swap (T[] a, int b, int c){

   T temp = a[b];
   a[b] = a[c];
   a[c] = temp;

    }



}
