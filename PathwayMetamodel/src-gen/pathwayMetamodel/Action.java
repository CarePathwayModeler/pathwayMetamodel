/**
 */
package pathwayMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.Action#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Element {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getAction_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Action#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

} // Action
