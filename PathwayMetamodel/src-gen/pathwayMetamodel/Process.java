/**
 */
package pathwayMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.Process#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Element {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link pathwayMetamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getProcess_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Process
