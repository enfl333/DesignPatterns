package com.flores.designpatterns.strategypattern.execution;

public class ManualExecutionMethod implements ITestExecutionMethod{
    @Override
    public void executeTest() {
        System.out.println("Manually running a test");
    }
}
