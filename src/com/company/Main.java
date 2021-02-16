package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] atrArray = new String[10];
        int[] intArray = new int[5];
        ArrayList<String> something = new ArrayList<String>();

        Integer integer = 43;
        Double doubleValue = 12.23;

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++){
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

    }
}
