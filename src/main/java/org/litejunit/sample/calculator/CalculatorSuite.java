package org.litejunit.sample.calculator;

import org.litejunit.Test;
import org.litejunit.TestSuite;

/**
 * Created by john on 2017/9/2.
 */
public class CalculatorSuite {
    public static Test suite(){
        TestSuite suite= new TestSuite("Calculator All Test");
        suite.addTestSuite(CalculatorTest.class);
        return suite;
    }
}
