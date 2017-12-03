/**
 */
package protocolosv2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.Medication#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.Medication#getCode <em>Code</em>}</li>
 *   <li>{@link protocolosv2.Medication#getMed_id <em>Med id</em>}</li>
 *   <li>{@link protocolosv2.Medication#getId <em>Id</em>}</li>
 *   <li>{@link protocolosv2.Medication#getName <em>Name</em>}</li>
 *   <li>{@link protocolosv2.Medication#getDescription <em>Description</em>}</li>
 *   <li>{@link protocolosv2.Medication#getBrand <em>Brand</em>}</li>
 *   <li>{@link protocolosv2.Medication#isStandardized <em>Standardized</em>}</li>
 *   <li>{@link protocolosv2.Medication#isControlled <em>Controlled</em>}</li>
 *   <li>{@link protocolosv2.Medication#isConsigned <em>Consigned</em>}</li>
 *   <li>{@link protocolosv2.Medication#isCritical <em>Critical</em>}</li>
 *   <li>{@link protocolosv2.Medication#isInvasive <em>Invasive</em>}</li>
 *   <li>{@link protocolosv2.Medication#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link protocolosv2.Medication#getUnit <em>Unit</em>}</li>
 *   <li>{@link protocolosv2.Medication#getAccess <em>Access</em>}</li>
 *   <li>{@link protocolosv2.Medication#getDaily_dosage <em>Daily dosage</em>}</li>
 *   <li>{@link protocolosv2.Medication#getCycles <em>Cycles</em>}</li>
 *   <li>{@link protocolosv2.Medication#getTreatement_time <em>Treatement time</em>}</li>
 *   <li>{@link protocolosv2.Medication#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link protocolosv2.Medication#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @see protocolosv2.Protocolosv2Package#getMedication()
 * @model
 * @generated
 */
public interface Medication extends EObject {
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
	 * @see protocolosv2.Protocolosv2Package#getMedication_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Med id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Med id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Med id</em>' attribute.
	 * @see #setMed_id(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Med_id()
	 * @model
	 * @generated
	 */
	int getMed_id();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getMed_id <em>Med id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med id</em>' attribute.
	 * @see #getMed_id()
	 * @generated
	 */
	void setMed_id(int value);

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
	 * @see protocolosv2.Protocolosv2Package#getMedication_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see protocolosv2.Protocolosv2Package#getMedication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getName <em>Name</em>}' attribute.
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
	 * @see protocolosv2.Protocolosv2Package#getMedication_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Standardized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standardized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standardized</em>' attribute.
	 * @see #setStandardized(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Standardized()
	 * @model
	 * @generated
	 */
	boolean isStandardized();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isStandardized <em>Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standardized</em>' attribute.
	 * @see #isStandardized()
	 * @generated
	 */
	void setStandardized(boolean value);

	/**
	 * Returns the value of the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled</em>' attribute.
	 * @see #setControlled(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Controlled()
	 * @model
	 * @generated
	 */
	boolean isControlled();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled</em>' attribute.
	 * @see #isControlled()
	 * @generated
	 */
	void setControlled(boolean value);

	/**
	 * Returns the value of the '<em><b>Consigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigned</em>' attribute.
	 * @see #setConsigned(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Consigned()
	 * @model
	 * @generated
	 */
	boolean isConsigned();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isConsigned <em>Consigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigned</em>' attribute.
	 * @see #isConsigned()
	 * @generated
	 */
	void setConsigned(boolean value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Critical()
	 * @model
	 * @generated
	 */
	boolean isCritical();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */
	void setCritical(boolean value);

	/**
	 * Returns the value of the '<em><b>Invasive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invasive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invasive</em>' attribute.
	 * @see #setInvasive(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Invasive()
	 * @model
	 * @generated
	 */
	boolean isInvasive();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isInvasive <em>Invasive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invasive</em>' attribute.
	 * @see #isInvasive()
	 * @generated
	 */
	void setInvasive(boolean value);

	/**
	 * Returns the value of the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outpatient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outpatient</em>' attribute.
	 * @see #setOutpatient(boolean)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Outpatient()
	 * @model
	 * @generated
	 */
	boolean isOutpatient();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#isOutpatient <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outpatient</em>' attribute.
	 * @see #isOutpatient()
	 * @generated
	 */
	void setOutpatient(boolean value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

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
	 * @see protocolosv2.Protocolosv2Package#getMedication_Access()
	 * @model
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Daily dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily dosage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily dosage</em>' attribute.
	 * @see #setDaily_dosage(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Daily_dosage()
	 * @model
	 * @generated
	 */
	int getDaily_dosage();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getDaily_dosage <em>Daily dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily dosage</em>' attribute.
	 * @see #getDaily_dosage()
	 * @generated
	 */
	void setDaily_dosage(int value);

	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' attribute.
	 * @see #setCycles(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Cycles()
	 * @model
	 * @generated
	 */
	int getCycles();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getCycles <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' attribute.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(int value);

	/**
	 * Returns the value of the '<em><b>Treatement time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatement time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatement time</em>' attribute.
	 * @see #setTreatement_time(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Treatement_time()
	 * @model
	 * @generated
	 */
	int getTreatement_time();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getTreatement_time <em>Treatement time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatement time</em>' attribute.
	 * @see #getTreatement_time()
	 * @generated
	 */
	void setTreatement_time(int value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #setStandard(String)
	 * @see protocolosv2.Protocolosv2Package#getMedication_Standard()
	 * @model
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link protocolosv2.Medication#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(String value);

} // Medication
