package com.example.tomk.sunshine.app.test;

/**
 * Created by tom on 10/27/14.
 */
import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

public class fullTestSuite extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(fullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }

    public fullTestSuite() {
        super();
    }
}
