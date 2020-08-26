package ch.actifsource.example.ant.unittest.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0354d342-e772-11ea-8c03-8d8d4f47b011,imports]] */
import java.util.ArrayList;
/* End Protected Region   [[0354d342-e772-11ea-8c03-8d8d4f47b011,imports]] */

public class TestFunctionSpace {

  /* Begin Protected Region [[0354d342-e772-11ea-8c03-8d8d4f47b011]] */
  
  /* End Protected Region   [[0354d342-e772-11ea-8c03-8d8d4f47b011]] */


  public static interface IRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0354fa5a-e772-11ea-8c03-8d8d4f47b011")
    public List<ch.actifsource.example.ant.unittest.generic.javamodel.IChild> getChildsSelector();

    @IDynamicResourceExtension.MethodId("0354fa5c-e772-11ea-8c03-8d8d4f47b011")
    public List<ch.actifsource.example.ant.unittest.generic.javamodel.IChild> getChildsJavaFunction();

  }
  
  public static interface IRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0354fa5c-e772-11ea-8c03-8d8d4f47b011")
    public List<ch.actifsource.example.ant.unittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.ant.unittest.generic.javamodel.IRoot root);

  }
  
  public static class RootFunctionsImpl implements IRootFunctionsImpl {

    public static final IRootFunctionsImpl INSTANCE = new RootFunctionsImpl();

    private RootFunctionsImpl() {}

    @Override
    public List<ch.actifsource.example.ant.unittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.ant.unittest.generic.javamodel.IRoot root) {
      /* Begin Protected Region [[0354fa5c-e772-11ea-8c03-8d8d4f47b011]] */
      return new ArrayList<>(root.selectChild());
      /* End Protected Region   [[0354fa5c-e772-11ea-8c03-8d8d4f47b011]] */
    }

  }
  
  public static class RootFunctions {

    private RootFunctions() {}

    public static List<ch.actifsource.example.ant.unittest.generic.javamodel.IChild> getChildsJavaFunction(final ch.actifsource.example.ant.unittest.generic.javamodel.IRoot root) {
      return DynamicResourceUtil.invoke(IRootFunctionsImpl.class, RootFunctionsImpl.INSTANCE, root).getChildsJavaFunction(root);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0354d342-e772-11ea-8c03-8d8d4f47b011,uyKCwC8INigXB0m0Vu61thlgH4s=] */
