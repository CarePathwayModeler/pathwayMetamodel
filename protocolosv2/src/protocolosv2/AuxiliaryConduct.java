/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Conduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.AuxiliaryConduct#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getAuxiliaryConduct()
 * @model
 * @generated
 */
public interface AuxiliaryConduct extends Element {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see protocolosv2.Protocolosv2Package#getAuxiliaryConduct_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // AuxiliaryConduct
