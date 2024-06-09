package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> readyHashSet = new HashSet<>();

        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                readyHashSet.add(integer);
                while (integer % 2 == 0) {
                    integer = integer / 2;
                    readyHashSet.add(integer);
                }
            } else {
                readyHashSet.add(integer);
                readyHashSet.add(integer * 2);
            }
        }
        System.out.println(readyHashSet);
        return readyHashSet;
    }
}
