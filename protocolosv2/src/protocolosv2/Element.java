/**
 */
package protocolosv2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Element#getId <em>Id</em>}</li>
 *   <li>{@link protocolosv2.Element#getType <em>Type</em>}</li>
 *   <li>{@link protocolosv2.Element#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link protocolosv2.Element#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.Element#getName <em>Name</em>}</li>
 *   <li>{@link protocolosv2.Element#getDescription <em>Description</em>}</li>
 *   <li>{@link protocolosv2.Element#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link protocolosv2.Element#isIsTerminal <em>Is Terminal</em>}</li>
 *   <li>{@link protocolosv2.Element#getSequenciasDeChegada <em>Sequencias De Chegada</em>}</li>
 *   <li>{@link protocolosv2.Element#getSequenciasDeSaida <em>Sequencias De Saida</em>}</li>
 *   <li>{@link protocolosv2.Element#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getId <em>Id</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getType <em>Type</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Type_verbose()
	 * @model
	 * @generated
	 */
	String getType_verbose();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getType_verbose <em>Type verbose</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getUrl <em>Url</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getName <em>Name</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see protocolosv2.Protocolosv2Package#getElement_IsInitial()
	 * @model
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminal</em>' attribute.
	 * @see #setIsTerminal(boolean)
	 * @see protocolosv2.Protocolosv2Package#getElement_IsTerminal()
	 * @model
	 * @generated
	 */
	boolean isIsTerminal();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#isIsTerminal <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminal</em>' attribute.
	 * @see #isIsTerminal()
	 * @generated
	 */
	void setIsTerminal(boolean value);

	/**
	 * Returns the value of the '<em><b>Sequencias De Chegada</b></em>' reference list.
	 * The list contents are of type {@link protocolosv2.Sequence}.
	 * It is bidirectional and its opposite is '{@link protocolosv2.Sequence#getPassoDeEntrada <em>Passo De Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequencias De Chegada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequencias De Chegada</em>' reference list.
	 * @see protocolosv2.Protocolosv2Package#getElement_SequenciasDeChegada()
	 * @see protocolosv2.Sequence#getPassoDeEntrada
	 * @model opposite="PassoDeEntrada"
	 * @generated
	 */
	EList<Sequence> getSequenciasDeChegada();

	/**
	 * Returns the value of the '<em><b>Sequencias De Saida</b></em>' reference list.
	 * The list contents are of type {@link protocolosv2.Sequence}.
	 * It is bidirectional and its opposite is '{@link protocolosv2.Sequence#getPassoDeSaida <em>Passo De Saida</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequencias De Saida</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequencias De Saida</em>' reference list.
	 * @see protocolosv2.Protocolosv2Package#getElement_SequenciasDeSaida()
	 * @see protocolosv2.Sequence#getPassoDeSaida
	 * @model opposite="PassoDeSaida"
	 * @generated
	 */
	EList<Sequence> getSequenciasDeSaida();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see protocolosv2.Protocolosv2Package#getElement_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link protocolosv2.Element#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

} // Element
