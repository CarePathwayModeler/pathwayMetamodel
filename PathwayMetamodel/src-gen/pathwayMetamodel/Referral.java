/**
 */
package pathwayMetamodel;

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
 *   <li>{@link pathwayMetamodel.Referral#getPathways <em>Pathways</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getReferral()
 * @model
 * @generated
 */
public interface Referral extends Element {
	/**
	 * Returns the value of the '<em><b>Pathways</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathways</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathways</em>' attribute list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getReferral_Pathways()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getPathways();

} // Referral
