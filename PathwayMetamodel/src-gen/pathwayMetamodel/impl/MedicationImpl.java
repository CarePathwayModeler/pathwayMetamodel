/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pathwayMetamodel.Medication;
import pathwayMetamodel.PathwayMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getMed_id <em>Med id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isStandardized <em>Standardized</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isControlled <em>Controlled</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isConsigned <em>Consigned</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isInvasive <em>Invasive</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getDaily_dosage <em>Daily dosage</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getTreatement_time <em>Treatement time</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.MedicationImpl#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationImpl extends MinimalEObjectImpl.Container implements Medication {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMed_id() <em>Med id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed_id()
	 * @generated
	 * @ordered
	 */
	protected static final int MED_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMed_id() <em>Med id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed_id()
	 * @generated
	 * @ordered
	 */
	protected int med_id = MED_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected String brand = BRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isStandardized() <em>Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARDIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandardized() <em>Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardized()
	 * @generated
	 * @ordered
	 */
	protected boolean standardized = STANDARDIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isControlled() <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean controlled = CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isConsigned() <em>Consigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConsigned() <em>Consigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean consigned = CONSIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvasive() <em>Invasive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvasive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVASIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvasive() <em>Invasive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvasive()
	 * @generated
	 * @ordered
	 */
	protected boolean invasive = INVASIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutpatient() <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutpatient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPATIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutpatient() <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutpatient()
	 * @generated
	 * @ordered
	 */
	protected boolean outpatient = OUTPATIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaily_dosage() <em>Daily dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaily_dosage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_DOSAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDaily_dosage() <em>Daily dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaily_dosage()
	 * @generated
	 * @ordered
	 */
	protected int daily_dosage = DAILY_DOSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected int cycles = CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreatement_time() <em>Treatement time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatement_time()
	 * @generated
	 * @ordered
	 */
	protected static final int TREATEMENT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTreatement_time() <em>Treatement time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatement_time()
	 * @generated
	 * @ordered
	 */
	protected int treatement_time = TREATEMENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected String standard = STANDARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__URL, oldUrl,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMed_id() {
		return med_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMed_id(int newMed_id) {
		int oldMed_id = med_id;
		med_id = newMed_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__MED_ID, oldMed_id,
					med_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(String newBrand) {
		String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__BRAND, oldBrand,
					brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStandardized() {
		return standardized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardized(boolean newStandardized) {
		boolean oldStandardized = standardized;
		standardized = newStandardized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__STANDARDIZED,
					oldStandardized, standardized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlled(boolean newControlled) {
		boolean oldControlled = controlled;
		controlled = newControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__CONTROLLED,
					oldControlled, controlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsigned() {
		return consigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigned(boolean newConsigned) {
		boolean oldConsigned = consigned;
		consigned = newConsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__CONSIGNED,
					oldConsigned, consigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__CRITICAL,
					oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvasive() {
		return invasive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvasive(boolean newInvasive) {
		boolean oldInvasive = invasive;
		invasive = newInvasive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__INVASIVE,
					oldInvasive, invasive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutpatient() {
		return outpatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutpatient(boolean newOutpatient) {
		boolean oldOutpatient = outpatient;
		outpatient = newOutpatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__OUTPATIENT,
					oldOutpatient, outpatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__ACCESS, oldAccess,
					access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDaily_dosage() {
		return daily_dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaily_dosage(int newDaily_dosage) {
		int oldDaily_dosage = daily_dosage;
		daily_dosage = newDaily_dosage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__DAILY_DOSAGE,
					oldDaily_dosage, daily_dosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycles() {
		return cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycles(int newCycles) {
		int oldCycles = cycles;
		cycles = newCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__CYCLES, oldCycles,
					cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTreatement_time() {
		return treatement_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatement_time(int newTreatement_time) {
		int oldTreatement_time = treatement_time;
		treatement_time = newTreatement_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__TREATEMENT_TIME,
					oldTreatement_time, treatement_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__FREQUENCY,
					oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard(String newStandard) {
		String oldStandard = standard;
		standard = newStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.MEDICATION__STANDARD,
					oldStandard, standard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.MEDICATION__URL:
			return getUrl();
		case PathwayMetamodelPackage.MEDICATION__CODE:
			return getCode();
		case PathwayMetamodelPackage.MEDICATION__MED_ID:
			return getMed_id();
		case PathwayMetamodelPackage.MEDICATION__ID:
			return getId();
		case PathwayMetamodelPackage.MEDICATION__NAME:
			return getName();
		case PathwayMetamodelPackage.MEDICATION__DESCRIPTION:
			return getDescription();
		case PathwayMetamodelPackage.MEDICATION__BRAND:
			return getBrand();
		case PathwayMetamodelPackage.MEDICATION__STANDARDIZED:
			return isStandardized();
		case PathwayMetamodelPackage.MEDICATION__CONTROLLED:
			return isControlled();
		case PathwayMetamodelPackage.MEDICATION__CONSIGNED:
			return isConsigned();
		case PathwayMetamodelPackage.MEDICATION__CRITICAL:
			return isCritical();
		case PathwayMetamodelPackage.MEDICATION__INVASIVE:
			return isInvasive();
		case PathwayMetamodelPackage.MEDICATION__OUTPATIENT:
			return isOutpatient();
		case PathwayMetamodelPackage.MEDICATION__UNIT:
			return getUnit();
		case PathwayMetamodelPackage.MEDICATION__ACCESS:
			return getAccess();
		case PathwayMetamodelPackage.MEDICATION__DAILY_DOSAGE:
			return getDaily_dosage();
		case PathwayMetamodelPackage.MEDICATION__CYCLES:
			return getCycles();
		case PathwayMetamodelPackage.MEDICATION__TREATEMENT_TIME:
			return getTreatement_time();
		case PathwayMetamodelPackage.MEDICATION__FREQUENCY:
			return getFrequency();
		case PathwayMetamodelPackage.MEDICATION__STANDARD:
			return getStandard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PathwayMetamodelPackage.MEDICATION__URL:
			setUrl((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__CODE:
			setCode((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__MED_ID:
			setMed_id((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__ID:
			setId((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__NAME:
			setName((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__BRAND:
			setBrand((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__STANDARDIZED:
			setStandardized((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__CONTROLLED:
			setControlled((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__CONSIGNED:
			setConsigned((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__CRITICAL:
			setCritical((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__INVASIVE:
			setInvasive((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__OUTPATIENT:
			setOutpatient((Boolean) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__UNIT:
			setUnit((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__ACCESS:
			setAccess((String) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__DAILY_DOSAGE:
			setDaily_dosage((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__CYCLES:
			setCycles((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__TREATEMENT_TIME:
			setTreatement_time((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case PathwayMetamodelPackage.MEDICATION__STANDARD:
			setStandard((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PathwayMetamodelPackage.MEDICATION__URL:
			setUrl(URL_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__MED_ID:
			setMed_id(MED_ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__ID:
			setId(ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__BRAND:
			setBrand(BRAND_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__STANDARDIZED:
			setStandardized(STANDARDIZED_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__CONTROLLED:
			setControlled(CONTROLLED_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__CONSIGNED:
			setConsigned(CONSIGNED_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__CRITICAL:
			setCritical(CRITICAL_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__INVASIVE:
			setInvasive(INVASIVE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__OUTPATIENT:
			setOutpatient(OUTPATIENT_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__ACCESS:
			setAccess(ACCESS_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__DAILY_DOSAGE:
			setDaily_dosage(DAILY_DOSAGE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__CYCLES:
			setCycles(CYCLES_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__TREATEMENT_TIME:
			setTreatement_time(TREATEMENT_TIME_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case PathwayMetamodelPackage.MEDICATION__STANDARD:
			setStandard(STANDARD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PathwayMetamodelPackage.MEDICATION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case PathwayMetamodelPackage.MEDICATION__CODE:
			return code != CODE_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__MED_ID:
			return med_id != MED_ID_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__ID:
			return id != ID_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PathwayMetamodelPackage.MEDICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case PathwayMetamodelPackage.MEDICATION__BRAND:
			return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
		case PathwayMetamodelPackage.MEDICATION__STANDARDIZED:
			return standardized != STANDARDIZED_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__CONTROLLED:
			return controlled != CONTROLLED_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__CONSIGNED:
			return consigned != CONSIGNED_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__CRITICAL:
			return critical != CRITICAL_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__INVASIVE:
			return invasive != INVASIVE_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__OUTPATIENT:
			return outpatient != OUTPATIENT_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case PathwayMetamodelPackage.MEDICATION__ACCESS:
			return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
		case PathwayMetamodelPackage.MEDICATION__DAILY_DOSAGE:
			return daily_dosage != DAILY_DOSAGE_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__CYCLES:
			return cycles != CYCLES_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__TREATEMENT_TIME:
			return treatement_time != TREATEMENT_TIME_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case PathwayMetamodelPackage.MEDICATION__STANDARD:
			return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", code: ");
		result.append(code);
		result.append(", med_id: ");
		result.append(med_id);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", brand: ");
		result.append(brand);
		result.append(", standardized: ");
		result.append(standardized);
		result.append(", controlled: ");
		result.append(controlled);
		result.append(", consigned: ");
		result.append(consigned);
		result.append(", critical: ");
		result.append(critical);
		result.append(", invasive: ");
		result.append(invasive);
		result.append(", outpatient: ");
		result.append(outpatient);
		result.append(", unit: ");
		result.append(unit);
		result.append(", access: ");
		result.append(access);
		result.append(", daily_dosage: ");
		result.append(daily_dosage);
		result.append(", cycles: ");
		result.append(cycles);
		result.append(", treatement_time: ");
		result.append(treatement_time);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", standard: ");
		result.append(standard);
		result.append(')');
		return result.toString();
	}

} //MedicationImpl
