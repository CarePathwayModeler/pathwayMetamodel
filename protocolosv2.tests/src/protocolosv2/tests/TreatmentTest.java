/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Protocolosv2Factory;
import protocolosv2.Treatment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreatmentTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TreatmentTest.class);
	}

	/**
	 * Constructs a new Treatment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Treatment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Treatment getFixture() {
		return (Treatment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createTreatment());
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

} //TreatmentTest
