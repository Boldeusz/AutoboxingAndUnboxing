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
        Integer myIntValue = 56;
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0;dbl<=10.0;dbl +=0.5){
            myDoubleValues.add(dbl);
        }
        for (int i=0;i<myDoubleValues.size();i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }



    }
}
