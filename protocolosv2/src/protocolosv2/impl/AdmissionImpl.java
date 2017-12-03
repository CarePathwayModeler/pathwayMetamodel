/**
 */
package protocolosv2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import protocolosv2.Admission;
import protocolosv2.Protocolosv2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.impl.AdmissionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.impl.AdmissionImpl#getAdmission <em>Admission</em>}</li>
 *   <li>{@link protocolosv2.impl.AdmissionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link protocolosv2.impl.AdmissionImpl#getClinical_indication <em>Clinical indication</em>}</li>
 *   <li>{@link protocolosv2.impl.AdmissionImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmissionImpl extends MinimalEObjectImpl.Container implements Admission {
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
	 * The default value of the '{@link #getAdmission() <em>Admission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmission()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmission() <em>Admission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmission()
	 * @generated
	 * @ordered
	 */
	protected String admission = ADMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getClinical_indication() <em>Clinical indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinical_indication()
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_INDICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClinical_indication() <em>Clinical indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinical_indication()
	 * @generated
	 * @ordered
	 */
	protected String clinical_indication = CLINICAL_INDICATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Protocolosv2Package.Literals.ADMISSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.ADMISSION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmission() {
		return admission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmission(String newAdmission) {
		String oldAdmission = admission;
		admission = newAdmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.ADMISSION__ADMISSION, oldAdmission, admission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.ADMISSION__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClinical_indication() {
		return clinical_indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinical_indication(String newClinical_indication) {
		String oldClinical_indication = clinical_indication;
		clinical_indication = newClinical_indication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.ADMISSION__CLINICAL_INDICATION, oldClinical_indication, clinical_indication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.ADMISSION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Protocolosv2Package.ADMISSION__URL:
				return getUrl();
			case Protocolosv2Package.ADMISSION__ADMISSION:
				return getAdmission();
			case Protocolosv2Package.ADMISSION__REASON:
				return getReason();
			case Protocolosv2Package.ADMISSION__CLINICAL_INDICATION:
				return getClinical_indication();
			case Protocolosv2Package.ADMISSION__QUANTITY:
				return getQuantity();
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
			case Protocolosv2Package.ADMISSION__URL:
				setUrl((String)newValue);
				return;
			case Protocolosv2Package.ADMISSION__ADMISSION:
				setAdmission((String)newValue);
				return;
			case Protocolosv2Package.ADMISSION__REASON:
				setReason((String)newValue);
				return;
			case Protocolosv2Package.ADMISSION__CLINICAL_INDICATION:
				setClinical_indication((String)newValue);
				return;
			case Protocolosv2Package.ADMISSION__QUANTITY:
				setQuantity((Integer)newValue);
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
			case Protocolosv2Package.ADMISSION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Protocolosv2Package.ADMISSION__ADMISSION:
				setAdmission(ADMISSION_EDEFAULT);
				return;
			case Protocolosv2Package.ADMISSION__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case Protocolosv2Package.ADMISSION__CLINICAL_INDICATION:
				setClinical_indication(CLINICAL_INDICATION_EDEFAULT);
				return;
			case Protocolosv2Package.ADMISSION__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case Protocolosv2Package.ADMISSION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Protocolosv2Package.ADMISSION__ADMISSION:
				return ADMISSION_EDEFAULT == null ? admission != null : !ADMISSION_EDEFAULT.equals(admission);
			case Protocolosv2Package.ADMISSION__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case Protocolosv2Package.ADMISSION__CLINICAL_INDICATION:
				return CLINICAL_INDICATION_EDEFAULT == null ? clinical_indication != null : !CLINICAL_INDICATION_EDEFAULT.equals(clinical_indication);
			case Protocolosv2Package.ADMISSION__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", admission: ");
		result.append(admission);
		result.append(", reason: ");
		result.append(reason);
		result.append(", clinical_indication: ");
		result.append(clinical_indication);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //AdmissionImpl
