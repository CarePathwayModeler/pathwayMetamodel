/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Referral#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getReferral()
 * @model
 * @generated
 */
public interface Referral extends Element {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference list.
	 * The list contents are of type {@link protocolosv2.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference list.
	 * @see protocolosv2.Protocolosv2Package#getReferral_Protocol()
	 * @model required="true"
	 * @generated
	 */
	EList<Protocol> getProtocol();

} // Referral
