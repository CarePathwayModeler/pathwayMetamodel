/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Prescription;
import protocolosv2.Protocolosv2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrescriptionTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrescriptionTest.class);
	}

	/**
	 * Constructs a new Prescription test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prescription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Prescription getFixture() {
		return (Prescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createPrescription());
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

} //PrescriptionTest
