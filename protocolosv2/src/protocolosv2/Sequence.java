/**
 */
package protocolosv2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Sequence#getPassoDeEntrada <em>Passo De Entrada</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getPassoDeSaida <em>Passo De Saida</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getId <em>Id</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getType <em>Type</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getDescription <em>Description</em>}</li>
 *   <li>{@link protocolosv2.Sequence#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Passo De Entrada</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link protocolosv2.Element#getSequenciasDeChegada <em>Sequencias De Chegada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passo De Entrada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passo De Entrada</em>' reference.
	 * @see #setPassoDeEntrada(Element)
	 * @see protocolosv2.Protocolosv2Package#getSequence_PassoDeEntrada()
	 * @see protocolosv2.Element#getSequenciasDeChegada
	 * @model opposite="SequenciasDeChegada" required="true"
	 * @generated
	 */
	Element getPassoDeEntrada();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getPassoDeEntrada <em>Passo De Entrada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passo De Entrada</em>' reference.
	 * @see #getPassoDeEntrada()
	 * @generated
	 */
	void setPassoDeEntrada(Element value);

	/**
	 * Returns the value of the '<em><b>Passo De Saida</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link protocolosv2.Element#getSequenciasDeSaida <em>Sequencias De Saida</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passo De Saida</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passo De Saida</em>' reference.
	 * @see #setPassoDeSaida(Element)
	 * @see protocolosv2.Protocolosv2Package#getSequence_PassoDeSaida()
	 * @see protocolosv2.Element#getSequenciasDeSaida
	 * @model opposite="SequenciasDeSaida" required="true"
	 * @generated
	 */
	Element getPassoDeSaida();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getPassoDeSaida <em>Passo De Saida</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passo De Saida</em>' reference.
	 * @see #getPassoDeSaida()
	 * @generated
	 */
	void setPassoDeSaida(Element value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type verbose</em>' attribute.
	 * @see #setType_verbose(String)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Type_verbose()
	 * @model
	 * @generated
	 */
	String getType_verbose();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getType_verbose <em>Type verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type verbose</em>' attribute.
	 * @see #getType_verbose()
	 * @generated
	 */
	void setType_verbose(String value);

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
	 * @see protocolosv2.Protocolosv2Package#getSequence_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link protocolosv2.Operation#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see protocolosv2.Protocolosv2Package#getSequence_Operation()
	 * @see protocolosv2.Operation#getSequence
	 * @model opposite="sequence"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link protocolosv2.Sequence#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Sequence
