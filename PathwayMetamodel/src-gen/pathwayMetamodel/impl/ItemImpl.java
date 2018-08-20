/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pathwayMetamodel.Item;
import pathwayMetamodel.PathwayMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getMed_code <em>Med code</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getFrequency_unit <em>Frequency unit</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ItemImpl#getOrientations <em>Orientations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
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
	 * The default value of the '{@link #getMed_code() <em>Med code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed_code()
	 * @generated
	 * @ordered
	 */
	protected static final long MED_CODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMed_code() <em>Med code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed_code()
	 * @generated
	 * @ordered
	 */
	protected long med_code = MED_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected String presentation = PRESENTATION_EDEFAULT;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected String period_unit = PERIOD_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency_unit() <em>Frequency unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_unit()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency_unit() <em>Frequency unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_unit()
	 * @generated
	 * @ordered
	 */
	protected String frequency_unit = FREQUENCY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientations() <em>Orientations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientations()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientations() <em>Orientations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientations()
	 * @generated
	 * @ordered
	 */
	protected String orientations = ORIENTATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMed_code() {
		return med_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMed_code(long newMed_code) {
		long oldMed_code = med_code;
		med_code = newMed_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__MED_CODE, oldMed_code,
					med_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(String newPresentation) {
		String oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__PRESENTATION,
					oldPresentation, presentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__ACCESS, oldAccess,
					access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__PERIOD, oldPeriod,
					period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod_unit() {
		return period_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod_unit(String newPeriod_unit) {
		String oldPeriod_unit = period_unit;
		period_unit = newPeriod_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__PERIOD_UNIT,
					oldPeriod_unit, period_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__FREQUENCY, oldFrequency,
					frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency_unit() {
		return frequency_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency_unit(String newFrequency_unit) {
		String oldFrequency_unit = frequency_unit;
		frequency_unit = newFrequency_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__FREQUENCY_UNIT,
					oldFrequency_unit, frequency_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientations() {
		return orientations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientations(String newOrientations) {
		String oldOrientations = orientations;
		orientations = newOrientations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ITEM__ORIENTATIONS,
					oldOrientations, orientations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.ITEM__ID:
			return getId();
		case PathwayMetamodelPackage.ITEM__URL:
			return getUrl();
		case PathwayMetamodelPackage.ITEM__NAME:
			return getName();
		case PathwayMetamodelPackage.ITEM__MED_CODE:
			return getMed_code();
		case PathwayMetamodelPackage.ITEM__PRESENTATION:
			return getPresentation();
		case PathwayMetamodelPackage.ITEM__ACCESS:
			return getAccess();
		case PathwayMetamodelPackage.ITEM__QUANTITY:
			return getQuantity();
		case PathwayMetamodelPackage.ITEM__PERIOD:
			return getPeriod();
		case PathwayMetamodelPackage.ITEM__PERIOD_UNIT:
			return getPeriod_unit();
		case PathwayMetamodelPackage.ITEM__FREQUENCY:
			return getFrequency();
		case PathwayMetamodelPackage.ITEM__FREQUENCY_UNIT:
			return getFrequency_unit();
		case PathwayMetamodelPackage.ITEM__ORIENTATIONS:
			return getOrientations();
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
		case PathwayMetamodelPackage.ITEM__ID:
			setId((Integer) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__URL:
			setUrl((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__NAME:
			setName((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__MED_CODE:
			setMed_code((Long) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__PRESENTATION:
			setPresentation((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__ACCESS:
			setAccess((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__PERIOD:
			setPeriod((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__PERIOD_UNIT:
			setPeriod_unit((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__FREQUENCY:
			setFrequency((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__FREQUENCY_UNIT:
			setFrequency_unit((String) newValue);
			return;
		case PathwayMetamodelPackage.ITEM__ORIENTATIONS:
			setOrientations((String) newValue);
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
		case PathwayMetamodelPackage.ITEM__ID:
			setId(ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__URL:
			setUrl(URL_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__MED_CODE:
			setMed_code(MED_CODE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__ACCESS:
			setAccess(ACCESS_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__PERIOD_UNIT:
			setPeriod_unit(PERIOD_UNIT_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__FREQUENCY_UNIT:
			setFrequency_unit(FREQUENCY_UNIT_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ITEM__ORIENTATIONS:
			setOrientations(ORIENTATIONS_EDEFAULT);
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
		case PathwayMetamodelPackage.ITEM__ID:
			return id != ID_EDEFAULT;
		case PathwayMetamodelPackage.ITEM__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case PathwayMetamodelPackage.ITEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PathwayMetamodelPackage.ITEM__MED_CODE:
			return med_code != MED_CODE_EDEFAULT;
		case PathwayMetamodelPackage.ITEM__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
		case PathwayMetamodelPackage.ITEM__ACCESS:
			return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
		case PathwayMetamodelPackage.ITEM__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case PathwayMetamodelPackage.ITEM__PERIOD:
			return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
		case PathwayMetamodelPackage.ITEM__PERIOD_UNIT:
			return PERIOD_UNIT_EDEFAULT == null ? period_unit != null : !PERIOD_UNIT_EDEFAULT.equals(period_unit);
		case PathwayMetamodelPackage.ITEM__FREQUENCY:
			return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
		case PathwayMetamodelPackage.ITEM__FREQUENCY_UNIT:
			return FREQUENCY_UNIT_EDEFAULT == null ? frequency_unit != null
					: !FREQUENCY_UNIT_EDEFAULT.equals(frequency_unit);
		case PathwayMetamodelPackage.ITEM__ORIENTATIONS:
			return ORIENTATIONS_EDEFAULT == null ? orientations != null : !ORIENTATIONS_EDEFAULT.equals(orientations);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", url: ");
		result.append(url);
		result.append(", name: ");
		result.append(name);
		result.append(", med_code: ");
		result.append(med_code);
		result.append(", presentation: ");
		result.append(presentation);
		result.append(", access: ");
		result.append(access);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", period: ");
		result.append(period);
		result.append(", period_unit: ");
		result.append(period_unit);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", frequency_unit: ");
		result.append(frequency_unit);
		result.append(", orientations: ");
		result.append(orientations);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
