package ch.actifsource.example.ant.unittest.model;

import java.io.IOException;
import org.junit.Test;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.example.ant.unittest.generic.GenericPackage;
import ch.actifsource.example.ant.unittest.generic.TestFunctionSpace.IRootFunctions;
import ch.actifsource.example.ant.unittest.generic.TestFunctionSpace.RootFunctionsImpl;
import ch.actifsource.example.ant.unittest.generic.javamodel.IRoot;
import ch.actifsource.example.ant.unittest.specific.SpecificPackage;
import ch.actifsource.ui.junit.SingleScopeTestCase;

public class ChildTest extends SingleScopeTestCase {

	public ChildTest() throws IOException {
		super("ch.actifsource.example.ant", /* true = load transient resources*/ true);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**********************
	 * Start Test
	 *********************/
	
	@Test
	public void test_childSize() {
		assertEquals(5, Select.objectsForRelation(fSession, GenericPackage.Root_child, SpecificPackage.RootInstance).size());
	}
	
	@Test
	public void test_childSizeSelectorFunction() {
		assertEquals(5, TypeSystem.getCompatibleDynamicResourceRepository(fSession).getExtension(IRootFunctions.class, SpecificPackage.RootInstance).getChildsSelector().size());
	}
	
	@Test
	public void test_childSizeJavaFunction() {
		assertEquals(5, TypeSystem.getCompatibleDynamicResourceRepository(fSession).getExtension(IRootFunctions.class, SpecificPackage.RootInstance).getChildsJavaFunction().size());
	
		IRoot root = TypeSystem.getCompatibleDynamicResourceRepository(fSession).getResource(IRoot.class, SpecificPackage.RootInstance);
		assertEquals(5, root.extension(IRootFunctions.class).getChildsJavaFunction().size());
		assertEquals(5, RootFunctionsImpl.INSTANCE.getChildsJavaFunction(root).size());	
	}
	
	@Test
  public void test_derivedRelations() {
	  assertEquals(5, Select.objectsForRelation(fSession, GenericPackage.Root_derivedRelationTest, SpecificPackage.RootInstance).size());
	}
	
	@Test
  public void test_derivedAttributes() {
	  assertEquals(5, Select.objectsForRelation(fSession, GenericPackage.Root_derivedAttributeTest, SpecificPackage.RootInstance).size());
  }
	
	@Test
	public void test_createChild() {
		assertEquals(5, Select.objectsForRelation(fSession, GenericPackage.Root_child, SpecificPackage.RootInstance).size());
		
		PackagedResource rootInstancePackageResource = Select.asPackagedResource(fSession, SpecificPackage.RootInstance);
		Update.createAndInitializeResource(fWriteJobExecutor, rootInstancePackageResource.getPackage(), GenericPackage.Child, SpecificPackage.RootInstance, GenericPackage.Root_child, IStatementPosition.AT_END);
		assertEquals(6, Select.objectsForRelation(fSession, GenericPackage.Root_child, SpecificPackage.RootInstance).size());
	}
	
}
