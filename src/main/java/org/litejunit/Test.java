package org.litejunit;


/**
 * Created by john on 2017/8/30.
 */

public interface Test {
    int countTestCases();

    void run(org.litejunit.TestResult tr);
}
