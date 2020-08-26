package ch.actifsource.example.ant.unittest.model;

import junit.framework.*;

public class AllTests {
  
  public static Test suite() {
    TestSuite suite = new TestSuite(AllTests.class.getName());
    //$JUnit-BEGIN$
    suite.addTestSuite(ChildTest.class);
    //$JUnit-END$
    return suite;
  }
  
}
