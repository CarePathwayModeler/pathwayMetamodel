/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Information;
import protocolosv2.Protocolosv2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InformationTest.class);
	}

	/**
	 * Constructs a new Information test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Information getFixture() {
		return (Information)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createInformation());
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

} //InformationTest
