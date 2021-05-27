package ch.actifsource.example.ant.unittest.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0354d340-e772-11ea-8c03-8d8d4f47b011");
  
  public java.util.List<java.lang.String> selectDerivedAttributeTest();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> selectChild();
  
  public java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> selectDerivedRelationTest();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0354d340-e772-11ea-8c03-8d8d4f47b011,cDdOoJp/5ZNcS8ysRomVXDCz94E=] */
