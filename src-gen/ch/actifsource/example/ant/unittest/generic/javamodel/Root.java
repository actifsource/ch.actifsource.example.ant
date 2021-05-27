package ch.actifsource.example.ant.unittest.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Root extends DynamicResource implements IRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot>() {
    
    @Override
    public IRoot create() {
      return new Root();
    }
    
    @Override
    public IRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Root(resourceRepository, resource);
    }
  
  };

  public Root() {
    super(IRoot.TYPE_ID);
  }
  
  public Root(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoot.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDerivedAttributeTest() {
    return _getListAttribute(java.lang.String.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedAttributeTest);
  }
    
  public void setDerivedAttributeTest(java.util.List<java.lang.String> derivedAttributeTest) {
     _setListAttribute(ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedAttributeTest, derivedAttributeTest);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> selectChild() {
    return _getList(ch.actifsource.example.ant.unittest.generic.javamodel.IChild.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_child);
  }

  public Root setChild(java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> child) {
    _setList(ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_child, child);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> selectDerivedRelationTest() {
    return _getList(ch.actifsource.example.ant.unittest.generic.javamodel.IChild.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedRelationTest);
  }

  public Root setDerivedRelationTest(java.util.List<? extends ch.actifsource.example.ant.unittest.generic.javamodel.IChild> derivedRelationTest) {
    _setList(ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedRelationTest, derivedRelationTest);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Root setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedAttributeTest, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.ant.unittest.generic.javamodel.IChild.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_child, visitor);
    _acceptList(ch.actifsource.example.ant.unittest.generic.javamodel.IChild.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedRelationTest, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.ant.unittest.generic.javamodel.IRoot selectToMeChild(ch.actifsource.example.ant.unittest.generic.javamodel.IChild object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.ant.unittest.generic.javamodel.IRoot.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_child, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.ant.unittest.generic.javamodel.IRoot> selectToMeDerivedRelationTest(ch.actifsource.example.ant.unittest.generic.javamodel.IChild object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.ant.unittest.generic.javamodel.IRoot.class, ch.actifsource.example.ant.unittest.generic.GenericPackage.Root_derivedRelationTest, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0354d340-e772-11ea-8c03-8d8d4f47b011,7dIxxKo8eAKRRtvoDecGiDYqYbM=] */
