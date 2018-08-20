/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import pathwayMetamodel.Action;
import pathwayMetamodel.PathwayMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.ActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ActionImpl#getProcess_id <em>Process id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ActionImpl#getService <em>Service</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.ActionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getProcess_id() <em>Process id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess_id()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcess_id() <em>Process id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess_id()
	 * @generated
	 * @ordered
	 */
	protected int process_id = PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcess_id() {
		return process_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess_id(int newProcess_id) {
		int oldProcess_id = process_id;
		process_id = newProcess_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ACTION__PROCESS_ID,
					oldProcess_id, process_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ACTION__SERVICE, oldService,
					service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.ACTION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.ACTION__ID:
			return getId();
		case PathwayMetamodelPackage.ACTION__PROCESS_ID:
			return getProcess_id();
		case PathwayMetamodelPackage.ACTION__SERVICE:
			return getService();
		case PathwayMetamodelPackage.ACTION__DESCRIPTION:
			return getDescription();
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
		case PathwayMetamodelPackage.ACTION__ID:
			setId((Integer) newValue);
			return;
		case PathwayMetamodelPackage.ACTION__PROCESS_ID:
			setProcess_id((Integer) newValue);
			return;
		case PathwayMetamodelPackage.ACTION__SERVICE:
			setService((String) newValue);
			return;
		case PathwayMetamodelPackage.ACTION__DESCRIPTION:
			setDescription((String) newValue);
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
		case PathwayMetamodelPackage.ACTION__ID:
			setId(ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ACTION__PROCESS_ID:
			setProcess_id(PROCESS_ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ACTION__SERVICE:
			setService(SERVICE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.ACTION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case PathwayMetamodelPackage.ACTION__ID:
			return id != ID_EDEFAULT;
		case PathwayMetamodelPackage.ACTION__PROCESS_ID:
			return process_id != PROCESS_ID_EDEFAULT;
		case PathwayMetamodelPackage.ACTION__SERVICE:
			return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
		case PathwayMetamodelPackage.ACTION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", process_id: ");
		result.append(process_id);
		result.append(", service: ");
		result.append(service);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
