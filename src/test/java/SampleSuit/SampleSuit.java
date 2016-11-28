package SampleSuit;

import TestSample.MyFirstTest;
import VisualInspections.VisualInspectionSample;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Gady on 9/20/2016.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        MyFirstTest.class,
        VisualInspectionSample.class
})

public class SampleSuit {
}