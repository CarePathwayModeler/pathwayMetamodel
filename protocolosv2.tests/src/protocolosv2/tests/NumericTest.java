/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Numeric;
import protocolosv2.Protocolosv2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numeric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumericTest.class);
	}

	/**
	 * Constructs a new Numeric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Numeric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Numeric getFixture() {
		return (Numeric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createNumeric());
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

} //NumericTest
