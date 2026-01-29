package com.issach.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEleInList {


    // Alternative method using frequency counting (more efficient for large lists)
    public static List<Integer> findDuplicateEleHelper2(List<Integer> list) {
        List<Integer> duplicateList = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();


        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    duplicates.add(list.get(i));
                    break;
                }

            }

        }

        duplicateList.addAll(duplicates);

        return duplicateList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(20);
        list.add(30);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);

        System.out.println("Original List: " + list);
        System.out.println("Duplicates list " + findDuplicateEleHelper2(list));
    }
}