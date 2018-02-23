/**
 */
package pathwayMetamodel;

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
 *   <li>{@link pathwayMetamodel.Prescription#getMedication <em>Medication</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends Element {
	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference list.
	 * The list contents are of type {@link pathwayMetamodel.Medication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getPrescription_Medication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medication> getMedication();

} // Prescription
