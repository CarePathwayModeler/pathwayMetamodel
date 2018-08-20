/**
 */
package pathwayMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.Item#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getMed_code <em>Med code</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getAccess <em>Access</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getPeriod <em>Period</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getFrequency_unit <em>Frequency unit</em>}</li>
 *   <li>{@link pathwayMetamodel.Item#getOrientations <em>Orientations</em>}</li>
 * </ul>
 *
 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getUrl <em>Url</em>}' attribute.
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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Med code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Med code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Med code</em>' attribute.
	 * @see #setMed_code(long)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Med_code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getMed_code();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getMed_code <em>Med code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med code</em>' attribute.
	 * @see #getMed_code()
	 * @generated
	 */
	void setMed_code(long value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Access()
	 * @model
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

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
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Period()
	 * @model
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period unit</em>' attribute.
	 * @see #setPeriod_unit(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Period_unit()
	 * @model
	 * @generated
	 */
	String getPeriod_unit();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getPeriod_unit <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period unit</em>' attribute.
	 * @see #getPeriod_unit()
	 * @generated
	 */
	void setPeriod_unit(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Frequency()
	 * @model
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Frequency unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency unit</em>' attribute.
	 * @see #setFrequency_unit(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Frequency_unit()
	 * @model
	 * @generated
	 */
	String getFrequency_unit();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getFrequency_unit <em>Frequency unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency unit</em>' attribute.
	 * @see #getFrequency_unit()
	 * @generated
	 */
	void setFrequency_unit(String value);

	/**
	 * Returns the value of the '<em><b>Orientations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientations</em>' attribute.
	 * @see #setOrientations(String)
	 * @see pathwayMetamodel.PathwayMetamodelPackage#getItem_Orientations()
	 * @model
	 * @generated
	 */
	String getOrientations();

	/**
	 * Sets the value of the '{@link pathwayMetamodel.Item#getOrientations <em>Orientations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientations</em>' attribute.
	 * @see #getOrientations()
	 * @generated
	 */
	void setOrientations(String value);

} // Item
