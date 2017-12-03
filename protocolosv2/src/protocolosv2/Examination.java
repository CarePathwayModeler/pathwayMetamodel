/**
 */
package protocolosv2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Examination#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.Examination#getExam_id <em>Exam id</em>}</li>
 *   <li>{@link protocolosv2.Examination#getLimb_side <em>Limb side</em>}</li>
 *   <li>{@link protocolosv2.Examination#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link protocolosv2.Examination#getReason <em>Reason</em>}</li>
 *   <li>{@link protocolosv2.Examination#getClinical_indication <em>Clinical indication</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getExamination()
 * @model
 * @generated
 */
public interface Examination extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Exam id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam id</em>' attribute.
	 * @see #setExam_id(int)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Exam_id()
	 * @model
	 * @generated
	 */
	int getExam_id();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getExam_id <em>Exam id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam id</em>' attribute.
	 * @see #getExam_id()
	 * @generated
	 */
	void setExam_id(int value);

	/**
	 * Returns the value of the '<em><b>Limb side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limb side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limb side</em>' attribute.
	 * @see #setLimb_side(String)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Limb_side()
	 * @model
	 * @generated
	 */
	String getLimb_side();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getLimb_side <em>Limb side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limb side</em>' attribute.
	 * @see #getLimb_side()
	 * @generated
	 */
	void setLimb_side(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Clinical indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical indication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical indication</em>' attribute.
	 * @see #setClinical_indication(String)
	 * @see protocolosv2.Protocolosv2Package#getExamination_Clinical_indication()
	 * @model
	 * @generated
	 */
	String getClinical_indication();

	/**
	 * Sets the value of the '{@link protocolosv2.Examination#getClinical_indication <em>Clinical indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical indication</em>' attribute.
	 * @see #getClinical_indication()
	 * @generated
	 */
	void setClinical_indication(String value);

} // Examination
