/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.AuxiliaryConduct;
import protocolosv2.Protocolosv2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Auxiliary Conduct</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryConductTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuxiliaryConductTest.class);
	}

	/**
	 * Constructs a new Auxiliary Conduct test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryConductTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Auxiliary Conduct test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AuxiliaryConduct getFixture() {
		return (AuxiliaryConduct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createAuxiliaryConduct());
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

} //AuxiliaryConductTest
