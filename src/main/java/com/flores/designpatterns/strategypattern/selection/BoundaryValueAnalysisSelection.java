package com.flores.designpatterns.strategypattern.selection;

public class BoundaryValueAnalysisSelection implements ITestSelectionAlgorithm{
    @Override
    public void selectedTests() {
        System.out.println("Selecting test by Boundary ValueAnalysis Selection");
    }
}
