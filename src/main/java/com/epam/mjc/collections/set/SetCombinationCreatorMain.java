package com.epam.mjc.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreatorMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>(Arrays.asList("Java", "Collection", "framework", "interface", "class", "Queue"));
        Set<String> secondSet = new HashSet<>(Arrays.asList("Queue", "iterator", "Java", "Collection", "comparator"));
        Set<String> thirdSet = new HashSet<>(Arrays.asList("Java", "Set", "Map", "List"));

        new SetCombinationCreator().createSetCombination(firstSet, secondSet, thirdSet);
    }
}
