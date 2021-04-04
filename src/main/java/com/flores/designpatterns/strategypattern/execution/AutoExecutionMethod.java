package com.flores.designpatterns.strategypattern.execution;

public class AutoExecutionMethod implements ITestExecutionMethod{
    @Override
    public void executeTest() {
        System.out.println("Automated running a test");
    }
}
