package ch.actifsource.example.ant.unittest;

import junit.framework.*;

public class AllTests {
  
  public static Test suite() {
    TestSuite suite = new TestSuite(AllTests.class.getName());
    //$JUnit-BEGIN$
    suite.addTest(ch.actifsource.example.ant.unittest.model.AllTests.suite());
    //$JUnit-END$
    return suite;
  }
  
}
