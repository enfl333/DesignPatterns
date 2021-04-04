package com.flores.designpatterns.strategypattern;

import com.flores.designpatterns.strategypattern.execution.ITestExecutionMethod;
import com.flores.designpatterns.strategypattern.selection.ITestSelectionAlgorithm;

/***
 * Strategy Pattern1
 *
 * https://www.youtube.com/watch?v=v9ejT8FO-7I
 */
public class TestCase {

    protected ITestSelectionAlgorithm iTestSelectionAlgorithm;
    protected ITestExecutionMethod iTestExecutionMethod;

    public TestCase(ITestExecutionMethod testExcM, ITestSelectionAlgorithm testSelectM){
        iTestExecutionMethod = testExcM;
        iTestSelectionAlgorithm = testSelectM;
    }

    public void test(){
        System.out.println("Testing using execution strategy:");
        executeTest();
        System.out.println("Selecting tests using selection algorithm: ");
        selectedTests();
    }

    public void executeTest(){
        iTestExecutionMethod.executeTest();
    }

    public void selectedTests(){
        iTestSelectionAlgorithm.selectedTests();
    }

}
