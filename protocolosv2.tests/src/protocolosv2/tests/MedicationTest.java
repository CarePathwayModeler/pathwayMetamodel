/**
 */
package protocolosv2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import protocolosv2.Medication;
import protocolosv2.Protocolosv2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MedicationTest extends TestCase {

	/**
	 * The fixture for this Medication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Medication fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MedicationTest.class);
	}

	/**
	 * Constructs a new Medication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Medication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Medication fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Medication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Medication getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createMedication());
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

} //MedicationTest
