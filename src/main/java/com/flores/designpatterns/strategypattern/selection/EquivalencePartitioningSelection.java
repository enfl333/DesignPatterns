package com.flores.designpatterns.strategypattern.selection;

public class EquivalencePartitioningSelection implements ITestSelectionAlgorithm{
    @Override
    public void selectedTests() {
        System.out.println("Selecting test by Equivalence Partitioning");
    }
}
