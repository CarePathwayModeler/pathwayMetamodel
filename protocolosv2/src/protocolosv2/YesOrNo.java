/**
 */
package protocolosv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Yes Or No</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.YesOrNo#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getYesOrNo()
 * @model
 * @generated
 */
public interface YesOrNo extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see protocolosv2.Protocolosv2Package#getYesOrNo_Value()
	 * @model
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link protocolosv2.YesOrNo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

} // YesOrNo
