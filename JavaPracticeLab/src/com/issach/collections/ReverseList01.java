package com.issach.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList01 {

    public static List<Integer> reverseTheList(List<Integer> list) {

        int start = 0;

        int end = list.size() - 1;


        /*
        * iteration -1
        * start = 0
        * end=3
        *
        * while(0<3) ->[40,20,30,10]
        *
        *
        * iteration -2
        *
        * start=1
        * end=2
        * while(1<2) ->[40,30,20,10]
        *
        * iteration -3
        *
        * start=2;
        * end=1
        *
        * while(2<1)
        *
        * */

        while (start < end) {

            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            System.out.println(start+"  "+end);

            start++;
            end--;


            //System.out.println(start+"  "+end);
        }

        return list;

    }


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(reverseTheList(list));;


    }
}
