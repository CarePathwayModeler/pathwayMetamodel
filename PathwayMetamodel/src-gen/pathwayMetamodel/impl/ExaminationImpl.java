/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pathwayMetamodel.Examination;
import pathwayMetamodel.PathwayMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getExam_id <em>Exam id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getLimb_side <em>Limb side</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ExaminationImpl#getClinical_indication <em>Clinical indication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationImpl extends MinimalEObjectImpl.Container implements Examination {
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
	 * The default value of the '{@link #getExam_id() <em>Exam id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_id()
	 * @generated
	 * @ordered
	 */
	protected static final int EXAM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExam_id() <em>Exam id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_id()
	 * @generated
	 * @ordered
	 */
	protected int exam_id = EXAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimb_side() <em>Limb side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimb_side()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMB_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimb_side() <em>Limb side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimb_side()
	 * @generated
	 * @ordered
	 */
	protected String limb_side = LIMB_SIDE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.EXAMINATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.EXAMINATION__URL, oldUrl,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExam_id() {
		return exam_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam_id(int newExam_id) {
		int oldExam_id = exam_id;
		exam_id = newExam_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.EXAMINATION__EXAM_ID,
					oldExam_id, exam_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimb_side() {
		return limb_side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimb_side(String newLimb_side) {
		String oldLimb_side = limb_side;
		limb_side = newLimb_side;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.EXAMINATION__LIMB_SIDE,
					oldLimb_side, limb_side));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.EXAMINATION__QUANTITY,
					oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.EXAMINATION__REASON,
					oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					PathwayMetamodelPackage.EXAMINATION__CLINICAL_INDICATION, oldClinical_indication,
					clinical_indication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.EXAMINATION__URL:
			return getUrl();
		case PathwayMetamodelPackage.EXAMINATION__EXAM_ID:
			return getExam_id();
		case PathwayMetamodelPackage.EXAMINATION__LIMB_SIDE:
			return getLimb_side();
		case PathwayMetamodelPackage.EXAMINATION__QUANTITY:
			return getQuantity();
		case PathwayMetamodelPackage.EXAMINATION__REASON:
			return getReason();
		case PathwayMetamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return getClinical_indication();
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
		case PathwayMetamodelPackage.EXAMINATION__URL:
			setUrl((String) newValue);
			return;
		case PathwayMetamodelPackage.EXAMINATION__EXAM_ID:
			setExam_id((Integer) newValue);
			return;
		case PathwayMetamodelPackage.EXAMINATION__LIMB_SIDE:
			setLimb_side((String) newValue);
			return;
		case PathwayMetamodelPackage.EXAMINATION__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case PathwayMetamodelPackage.EXAMINATION__REASON:
			setReason((String) newValue);
			return;
		case PathwayMetamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinical_indication((String) newValue);
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
		case PathwayMetamodelPackage.EXAMINATION__URL:
			setUrl(URL_EDEFAULT);
			return;
		case PathwayMetamodelPackage.EXAMINATION__EXAM_ID:
			setExam_id(EXAM_ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.EXAMINATION__LIMB_SIDE:
			setLimb_side(LIMB_SIDE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.EXAMINATION__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case PathwayMetamodelPackage.EXAMINATION__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case PathwayMetamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinical_indication(CLINICAL_INDICATION_EDEFAULT);
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
		case PathwayMetamodelPackage.EXAMINATION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case PathwayMetamodelPackage.EXAMINATION__EXAM_ID:
			return exam_id != EXAM_ID_EDEFAULT;
		case PathwayMetamodelPackage.EXAMINATION__LIMB_SIDE:
			return LIMB_SIDE_EDEFAULT == null ? limb_side != null : !LIMB_SIDE_EDEFAULT.equals(limb_side);
		case PathwayMetamodelPackage.EXAMINATION__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case PathwayMetamodelPackage.EXAMINATION__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case PathwayMetamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return CLINICAL_INDICATION_EDEFAULT == null ? clinical_indication != null
					: !CLINICAL_INDICATION_EDEFAULT.equals(clinical_indication);
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
		result.append(", exam_id: ");
		result.append(exam_id);
		result.append(", limb_side: ");
		result.append(limb_side);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reason: ");
		result.append(reason);
		result.append(", clinical_indication: ");
		result.append(clinical_indication);
		result.append(')');
		return result.toString();
	}

} //ExaminationImpl
