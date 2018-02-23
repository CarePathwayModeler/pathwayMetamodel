/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pathwayMetamodel.Element;
import pathwayMetamodel.Operation;
import pathwayMetamodel.PathwayMetamodelPackage;
import pathwayMetamodel.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getInputStep <em>Input Step</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getOutputStep <em>Output Step</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.SequenceImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence {
	/**
	 * The cached value of the '{@link #getInputStep() <em>Input Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStep()
	 * @generated
	 * @ordered
	 */
	protected Element inputStep;

	/**
	 * The cached value of the '{@link #getOutputStep() <em>Output Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStep()
	 * @generated
	 * @ordered
	 */
	protected Element outputStep;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_verbose() <em>Type verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_verbose()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VERBOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_verbose() <em>Type verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_verbose()
	 * @generated
	 * @ordered
	 */
	protected String type_verbose = TYPE_VERBOSE_EDEFAULT;

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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getInputStep() {
		if (inputStep != null && inputStep.eIsProxy()) {
			InternalEObject oldInputStep = (InternalEObject) inputStep;
			inputStep = (Element) eResolveProxy(oldInputStep);
			if (inputStep != oldInputStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PathwayMetamodelPackage.SEQUENCE__INPUT_STEP, oldInputStep, inputStep));
			}
		}
		return inputStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetInputStep() {
		return inputStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputStep(Element newInputStep, NotificationChain msgs) {
		Element oldInputStep = inputStep;
		inputStep = newInputStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PathwayMetamodelPackage.SEQUENCE__INPUT_STEP, oldInputStep, newInputStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputStep(Element newInputStep) {
		if (newInputStep != inputStep) {
			NotificationChain msgs = null;
			if (inputStep != null)
				msgs = ((InternalEObject) inputStep).eInverseRemove(this,
						PathwayMetamodelPackage.ELEMENT__INPUT_SEQUENCES, Element.class, msgs);
			if (newInputStep != null)
				msgs = ((InternalEObject) newInputStep).eInverseAdd(this,
						PathwayMetamodelPackage.ELEMENT__INPUT_SEQUENCES, Element.class, msgs);
			msgs = basicSetInputStep(newInputStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__INPUT_STEP,
					newInputStep, newInputStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOutputStep() {
		if (outputStep != null && outputStep.eIsProxy()) {
			InternalEObject oldOutputStep = (InternalEObject) outputStep;
			outputStep = (Element) eResolveProxy(oldOutputStep);
			if (outputStep != oldOutputStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP, oldOutputStep, outputStep));
			}
		}
		return outputStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOutputStep() {
		return outputStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputStep(Element newOutputStep, NotificationChain msgs) {
		Element oldOutputStep = outputStep;
		outputStep = newOutputStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP, oldOutputStep, newOutputStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputStep(Element newOutputStep) {
		if (newOutputStep != outputStep) {
			NotificationChain msgs = null;
			if (outputStep != null)
				msgs = ((InternalEObject) outputStep).eInverseRemove(this,
						PathwayMetamodelPackage.ELEMENT__OUTPUT_SEQUENCES, Element.class, msgs);
			if (newOutputStep != null)
				msgs = ((InternalEObject) newOutputStep).eInverseAdd(this,
						PathwayMetamodelPackage.ELEMENT__OUTPUT_SEQUENCES, Element.class, msgs);
			msgs = basicSetOutputStep(newOutputStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP,
					newOutputStep, newOutputStep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_verbose() {
		return type_verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_verbose(String newType_verbose) {
		String oldType_verbose = type_verbose;
		type_verbose = newType_verbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__TYPE_VERBOSE,
					oldType_verbose, type_verbose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__NAME, oldName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PathwayMetamodelPackage.SEQUENCE__OPERATION, oldOperation, newOperation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject) operation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PathwayMetamodelPackage.SEQUENCE__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject) newOperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PathwayMetamodelPackage.SEQUENCE__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathwayMetamodelPackage.SEQUENCE__OPERATION,
					newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			if (inputStep != null)
				msgs = ((InternalEObject) inputStep).eInverseRemove(this,
						PathwayMetamodelPackage.ELEMENT__INPUT_SEQUENCES, Element.class, msgs);
			return basicSetInputStep((Element) otherEnd, msgs);
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			if (outputStep != null)
				msgs = ((InternalEObject) outputStep).eInverseRemove(this,
						PathwayMetamodelPackage.ELEMENT__OUTPUT_SEQUENCES, Element.class, msgs);
			return basicSetOutputStep((Element) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			return basicSetInputStep(null, msgs);
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			return basicSetOutputStep(null, msgs);
		case PathwayMetamodelPackage.SEQUENCE__OPERATION:
			return basicSetOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			if (resolve)
				return getInputStep();
			return basicGetInputStep();
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			if (resolve)
				return getOutputStep();
			return basicGetOutputStep();
		case PathwayMetamodelPackage.SEQUENCE__ID:
			return getId();
		case PathwayMetamodelPackage.SEQUENCE__TYPE:
			return getType();
		case PathwayMetamodelPackage.SEQUENCE__TYPE_VERBOSE:
			return getType_verbose();
		case PathwayMetamodelPackage.SEQUENCE__URL:
			return getUrl();
		case PathwayMetamodelPackage.SEQUENCE__NAME:
			return getName();
		case PathwayMetamodelPackage.SEQUENCE__DESCRIPTION:
			return getDescription();
		case PathwayMetamodelPackage.SEQUENCE__OPERATION:
			return getOperation();
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
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			setInputStep((Element) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			setOutputStep((Element) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__ID:
			setId((Integer) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__TYPE:
			setType((String) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__TYPE_VERBOSE:
			setType_verbose((String) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__URL:
			setUrl((String) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__NAME:
			setName((String) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case PathwayMetamodelPackage.SEQUENCE__OPERATION:
			setOperation((Operation) newValue);
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
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			setInputStep((Element) null);
			return;
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			setOutputStep((Element) null);
			return;
		case PathwayMetamodelPackage.SEQUENCE__ID:
			setId(ID_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__TYPE_VERBOSE:
			setType_verbose(TYPE_VERBOSE_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__URL:
			setUrl(URL_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case PathwayMetamodelPackage.SEQUENCE__OPERATION:
			setOperation((Operation) null);
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
		case PathwayMetamodelPackage.SEQUENCE__INPUT_STEP:
			return inputStep != null;
		case PathwayMetamodelPackage.SEQUENCE__OUTPUT_STEP:
			return outputStep != null;
		case PathwayMetamodelPackage.SEQUENCE__ID:
			return id != ID_EDEFAULT;
		case PathwayMetamodelPackage.SEQUENCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case PathwayMetamodelPackage.SEQUENCE__TYPE_VERBOSE:
			return TYPE_VERBOSE_EDEFAULT == null ? type_verbose != null : !TYPE_VERBOSE_EDEFAULT.equals(type_verbose);
		case PathwayMetamodelPackage.SEQUENCE__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case PathwayMetamodelPackage.SEQUENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PathwayMetamodelPackage.SEQUENCE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case PathwayMetamodelPackage.SEQUENCE__OPERATION:
			return operation != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", type_verbose: ");
		result.append(type_verbose);
		result.append(", url: ");
		result.append(url);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl
