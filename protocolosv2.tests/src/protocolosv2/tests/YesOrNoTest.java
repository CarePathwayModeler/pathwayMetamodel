/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Protocolosv2Factory;
import protocolosv2.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Yes Or No</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YesOrNoTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YesOrNoTest.class);
	}

	/**
	 * Constructs a new Yes Or No test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Yes Or No test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected YesOrNo getFixture() {
		return (YesOrNo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createYesOrNo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //YesOrNoTest
