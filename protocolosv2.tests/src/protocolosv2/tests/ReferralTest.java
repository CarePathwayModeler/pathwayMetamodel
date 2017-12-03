/**
 */
package protocolosv2.tests;

import junit.textui.TestRunner;

import protocolosv2.Protocolosv2Factory;
import protocolosv2.Referral;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Referral</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferralTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReferralTest.class);
	}

	/**
	 * Constructs a new Referral test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Referral test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Referral getFixture() {
		return (Referral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Protocolosv2Factory.eINSTANCE.createReferral());
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

} //ReferralTest
