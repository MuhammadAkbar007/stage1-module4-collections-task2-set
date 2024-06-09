package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> combination = new HashSet<>(Sets.intersection(firstSet, secondSet));
        combination.removeAll(thirdSet);

        combination.addAll(Sets.difference(thirdSet, Sets.union(firstSet, secondSet)));

        System.out.println(combination);
        return combination;
    }
}
