package org.litejunit.sample;

import org.litejunit.extension.RepeatedTest;
import org.litejunit.sample.calculator.CalculatorTest;
import org.litejunit.sample.calculator.PersonTest;
import org.litejunit.Test;
import org.litejunit.TestSuite;

/**
 * Created by john on 2017/9/2.
 */
public class AllTest {
//    public static Test suite() {
//
//        TestSuite suite = new TestSuite("All Test");
//        suite.addTest(CalculatorSuite.suite());
//        suite.addTestSuite(PersonTest.class);
//        return suite;
//
//    }

    public static Test suite() {

        TestSuite suite = new TestSuite("All Test");
        suite.addTest(new TestSuite(CalculatorTest.class));
        suite.addTest(new RepeatedTest(new TestSuite(PersonTest.class), 2));
        return suite;
    }


//    static class OverallTestSetup extends TestSetup {
//
//        public OverallTestSetup(Test test) {
//            super(test);
//
//        }
//        protected void setUp() throws Exception {
//            System.out.println("this is overall testsetup");
//        }
//        protected void tearDown() throws Exception {
//            System.out.println("this is overall teardown");
//        }
//
//    }
}