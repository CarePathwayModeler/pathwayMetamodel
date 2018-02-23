/**
 */
package pathwayMetamodel;

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
 *   <li>{@link pathwayMetamodel.Sequence#getInputStep <em>Input Step</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getOutputStep <em>Output Step</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getType <em>Type</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getDescription <em>Description</em>}</li>
 *   <li>{@link pathwayMetamodel.Sequence#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pathwayMetamodel.Element#getInputSequences <em>Input Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Step</em>' reference.
	 * @see #setInputStep(Element)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_InputStep()
	 * @see pathwayMetamodel.Element#getInputSequences
	 * @model opposite="inputSequences" required="true"
	 * @generated
	 */
	Element getInputStep();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getInputStep <em>Input Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Step</em>' reference.
	 * @see #getInputStep()
	 * @generated
	 */
	void setInputStep(Element value);

	/**
	 * Returns the value of the '<em><b>Output Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pathwayMetamodel.Element#getOutputSequences <em>Output Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Step</em>' reference.
	 * @see #setOutputStep(Element)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_OutputStep()
	 * @see pathwayMetamodel.Element#getOutputSequences
	 * @model opposite="outputSequences" required="true"
	 * @generated
	 */
	Element getOutputStep();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getOutputStep <em>Output Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Step</em>' reference.
	 * @see #getOutputStep()
	 * @generated
	 */
	void setOutputStep(Element value);

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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getId <em>Id</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getType <em>Type</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Type_verbose()
	 * @model
	 * @generated
	 */
	String getType_verbose();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getType_verbose <em>Type verbose</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getUrl <em>Url</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getName <em>Name</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getSequence_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Sequence#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Sequence
