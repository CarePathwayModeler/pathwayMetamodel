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
 *   <li>{@link pathwayMetamodel.Prescription#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends Element {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link pathwayMetamodel.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getPrescription_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

} // Prescription
