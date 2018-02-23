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
 *   <li>{@link pathwayMetamodel.Referral#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getReferral()
 * @model
 * @generated
 */
public interface Referral extends Element {
	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' reference list.
	 * The list contents are of type {@link pathwayMetamodel.Pathway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getReferral_Pathway()
	 * @model required="true"
	 * @generated
	 */
	EList<Pathway> getPathway();

} // Referral
