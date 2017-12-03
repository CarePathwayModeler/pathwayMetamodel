/**
 */
package protocolosv2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Numeric#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getNumeric()
 * @model
 * @generated
 */
public interface Numeric extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see protocolosv2.Protocolosv2Package#getNumeric_Value()
	 * @model
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link protocolosv2.Numeric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // Numeric