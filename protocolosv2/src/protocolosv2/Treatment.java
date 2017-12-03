/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Treatment#getExamination <em>Examination</em>}</li>
 *   <li>{@link protocolosv2.Treatment#getMedication <em>Medication</em>}</li>
 *   <li>{@link protocolosv2.Treatment#getAdmission <em>Admission</em>}</li>
 *   <li>{@link protocolosv2.Treatment#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getTreatment()
 * @model
 * @generated
 */
public interface Treatment extends Element {
	/**
	 * Returns the value of the '<em><b>Examination</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Examination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examination</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getTreatment_Examination()
	 * @model containment="true"
	 * @generated
	 */
	EList<Examination> getExamination();

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
	 * @see protocolosv2.Protocolosv2Package#getTreatment_Medication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medication> getMedication();

	/**
	 * Returns the value of the '<em><b>Admission</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Admission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admission</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getTreatment_Admission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Admission> getAdmission();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Procedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getTreatment_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedure();

} // Treatment
