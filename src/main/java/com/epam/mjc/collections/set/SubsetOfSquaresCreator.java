package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squareTreeSet = new TreeSet<>();

        sourceList.forEach(source -> squareTreeSet.add(source * source));

        NavigableSet<Integer> subsetTree = new TreeSet<>(squareTreeSet).subSet(lowerBound, true, upperBound, true);

        System.out.println(subsetTree);
        return subsetTree;
    }
}
