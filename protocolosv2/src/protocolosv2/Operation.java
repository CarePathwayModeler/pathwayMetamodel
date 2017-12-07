/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Operation#getOperator <em>Operator</em>}</li>
 *   <li>{@link protocolosv2.Operation#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Operand {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link protocolosv2.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see protocolosv2.Operador
	 * @see #setOperator(Operador)
	 * @see protocolosv2.Protocolosv2Package#getOperation_Operator()
	 * @model
	 * @generated
	 */
	Operador getOperator();

	/**
	 * Sets the value of the '{@link protocolosv2.Operation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see protocolosv2.Operador
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operador value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Operand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getOperation_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operand> getOperand();

} // Operation
