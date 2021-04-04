package com.flores.designpatterns.strategypattern;

import com.flores.designpatterns.strategypattern.execution.AutoExecutionMethod;
import com.flores.designpatterns.strategypattern.execution.ManualExecutionMethod;
import com.flores.designpatterns.strategypattern.selection.BoundaryValueAnalysisSelection;
import com.flores.designpatterns.strategypattern.selection.EquivalencePartitioningSelection;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCaseTest {

    /**
     * 3 Test with different strategies
     *
     * - Execution (Manual, Auto)
     * - Test selection (BoundaryValueAnalysis,EquivalencePartitioning)
     */
    @Test
    public void testTestStrategy() {

        TestCase manualTest = new TestCase(new ManualExecutionMethod(),
                new BoundaryValueAnalysisSelection());
        manualTest.test();

        TestCase autoTestWithBoundary = new TestCase(new AutoExecutionMethod(),
                new BoundaryValueAnalysisSelection());
        autoTestWithBoundary.test();

        TestCase autoTestWithEq = new TestCase(new AutoExecutionMethod(),
                new EquivalencePartitioningSelection());

        autoTestWithEq.test();
    }
}