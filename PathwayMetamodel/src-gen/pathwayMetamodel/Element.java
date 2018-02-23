/**
 */
package pathwayMetamodel;

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
 *   <li>{@link pathwayMetamodel.Element#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getType <em>Type</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getDescription <em>Description</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#isIsTerminal <em>Is Terminal</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getInputSequences <em>Input Sequences</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#getOutputSequences <em>Output Sequences</em>}</li>
 *   <li>{@link pathwayMetamodel.Element#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement()
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getId <em>Id</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getType <em>Type</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Type_verbose()
	 * @model
	 * @generated
	 */
	String getType_verbose();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getType_verbose <em>Type verbose</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getUrl <em>Url</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getName <em>Name</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_IsInitial()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Terminal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminal</em>' attribute.
	 * @see #setIsTerminal(boolean)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_IsTerminal()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsTerminal();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#isIsTerminal <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminal</em>' attribute.
	 * @see #isIsTerminal()
	 * @generated
	 */
	void setIsTerminal(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Sequences</b></em>' reference list.
	 * The list contents are of type {@link pathwayMetamodel.Sequence}.
	 * It is bidirectional and its opposite is '{@link pathwayMetamodel.Sequence#getInputStep <em>Input Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sequences</em>' reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_InputSequences()
	 * @see pathwayMetamodel.Sequence#getInputStep
	 * @model opposite="inputStep"
	 * @generated
	 */
	EList<Sequence> getInputSequences();

	/**
	 * Returns the value of the '<em><b>Output Sequences</b></em>' reference list.
	 * The list contents are of type {@link pathwayMetamodel.Sequence}.
	 * It is bidirectional and its opposite is '{@link pathwayMetamodel.Sequence#getOutputStep <em>Output Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Sequences</em>' reference list.
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_OutputSequences()
	 * @see pathwayMetamodel.Sequence#getOutputStep
	 * @model opposite="outputStep"
	 * @generated
	 */
	EList<Sequence> getOutputSequences();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getElement_Mandatory()
	 * @model default="false"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Element#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

} // Element
