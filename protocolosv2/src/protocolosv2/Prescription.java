/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Prescription#getMedication <em>Medication</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends Element {
	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Medication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getPrescription_Medication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medication> getMedication();

} // Prescription
