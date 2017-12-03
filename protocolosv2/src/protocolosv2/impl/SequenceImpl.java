/**
 */
package protocolosv2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import protocolosv2.Element;
import protocolosv2.Operation;
import protocolosv2.Protocolosv2Package;
import protocolosv2.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getPassoDeEntrada <em>Passo De Entrada</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getPassoDeSaida <em>Passo De Saida</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getType_verbose <em>Type verbose</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link protocolosv2.impl.SequenceImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence {
	/**
	 * The cached value of the '{@link #getPassoDeEntrada() <em>Passo De Entrada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassoDeEntrada()
	 * @generated
	 * @ordered
	 */
	protected Element passoDeEntrada;

	/**
	 * The cached value of the '{@link #getPassoDeSaida() <em>Passo De Saida</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassoDeSaida()
	 * @generated
	 * @ordered
	 */
	protected Element passoDeSaida;

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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
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
		return Protocolosv2Package.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getPassoDeEntrada() {
		if (passoDeEntrada != null && passoDeEntrada.eIsProxy()) {
			InternalEObject oldPassoDeEntrada = (InternalEObject)passoDeEntrada;
			passoDeEntrada = (Element)eResolveProxy(oldPassoDeEntrada);
			if (passoDeEntrada != oldPassoDeEntrada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA, oldPassoDeEntrada, passoDeEntrada));
			}
		}
		return passoDeEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetPassoDeEntrada() {
		return passoDeEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassoDeEntrada(Element newPassoDeEntrada, NotificationChain msgs) {
		Element oldPassoDeEntrada = passoDeEntrada;
		passoDeEntrada = newPassoDeEntrada;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA, oldPassoDeEntrada, newPassoDeEntrada);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassoDeEntrada(Element newPassoDeEntrada) {
		if (newPassoDeEntrada != passoDeEntrada) {
			NotificationChain msgs = null;
			if (passoDeEntrada != null)
				msgs = ((InternalEObject)passoDeEntrada).eInverseRemove(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_CHEGADA, Element.class, msgs);
			if (newPassoDeEntrada != null)
				msgs = ((InternalEObject)newPassoDeEntrada).eInverseAdd(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_CHEGADA, Element.class, msgs);
			msgs = basicSetPassoDeEntrada(newPassoDeEntrada, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA, newPassoDeEntrada, newPassoDeEntrada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getPassoDeSaida() {
		if (passoDeSaida != null && passoDeSaida.eIsProxy()) {
			InternalEObject oldPassoDeSaida = (InternalEObject)passoDeSaida;
			passoDeSaida = (Element)eResolveProxy(oldPassoDeSaida);
			if (passoDeSaida != oldPassoDeSaida) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA, oldPassoDeSaida, passoDeSaida));
			}
		}
		return passoDeSaida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetPassoDeSaida() {
		return passoDeSaida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassoDeSaida(Element newPassoDeSaida, NotificationChain msgs) {
		Element oldPassoDeSaida = passoDeSaida;
		passoDeSaida = newPassoDeSaida;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA, oldPassoDeSaida, newPassoDeSaida);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassoDeSaida(Element newPassoDeSaida) {
		if (newPassoDeSaida != passoDeSaida) {
			NotificationChain msgs = null;
			if (passoDeSaida != null)
				msgs = ((InternalEObject)passoDeSaida).eInverseRemove(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_SAIDA, Element.class, msgs);
			if (newPassoDeSaida != null)
				msgs = ((InternalEObject)newPassoDeSaida).eInverseAdd(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_SAIDA, Element.class, msgs);
			msgs = basicSetPassoDeSaida(newPassoDeSaida, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA, newPassoDeSaida, newPassoDeSaida));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__TYPE_VERBOSE, oldType_verbose, type_verbose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Protocolosv2Package.SEQUENCE__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)operation).eInverseRemove(this, Protocolosv2Package.OPERATION__SEQUENCE, Operation.class, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, Protocolosv2Package.OPERATION__SEQUENCE, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.SEQUENCE__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				if (passoDeEntrada != null)
					msgs = ((InternalEObject)passoDeEntrada).eInverseRemove(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_CHEGADA, Element.class, msgs);
				return basicSetPassoDeEntrada((Element)otherEnd, msgs);
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				if (passoDeSaida != null)
					msgs = ((InternalEObject)passoDeSaida).eInverseRemove(this, Protocolosv2Package.ELEMENT__SEQUENCIAS_DE_SAIDA, Element.class, msgs);
				return basicSetPassoDeSaida((Element)otherEnd, msgs);
			case Protocolosv2Package.SEQUENCE__OPERATION:
				if (operation != null)
					msgs = ((InternalEObject)operation).eInverseRemove(this, Protocolosv2Package.OPERATION__SEQUENCE, Operation.class, msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
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
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				return basicSetPassoDeEntrada(null, msgs);
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				return basicSetPassoDeSaida(null, msgs);
			case Protocolosv2Package.SEQUENCE__OPERATION:
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
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				if (resolve) return getPassoDeEntrada();
				return basicGetPassoDeEntrada();
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				if (resolve) return getPassoDeSaida();
				return basicGetPassoDeSaida();
			case Protocolosv2Package.SEQUENCE__ID:
				return getId();
			case Protocolosv2Package.SEQUENCE__TYPE:
				return getType();
			case Protocolosv2Package.SEQUENCE__TYPE_VERBOSE:
				return getType_verbose();
			case Protocolosv2Package.SEQUENCE__URL:
				return getUrl();
			case Protocolosv2Package.SEQUENCE__NAME:
				return getName();
			case Protocolosv2Package.SEQUENCE__DESCRIPTION:
				return getDescription();
			case Protocolosv2Package.SEQUENCE__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				setPassoDeEntrada((Element)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				setPassoDeSaida((Element)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__ID:
				setId((Integer)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__TYPE:
				setType((String)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__TYPE_VERBOSE:
				setType_verbose((String)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__URL:
				setUrl((String)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Protocolosv2Package.SEQUENCE__OPERATION:
				setOperation((Operation)newValue);
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
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				setPassoDeEntrada((Element)null);
				return;
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				setPassoDeSaida((Element)null);
				return;
			case Protocolosv2Package.SEQUENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__TYPE_VERBOSE:
				setType_verbose(TYPE_VERBOSE_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Protocolosv2Package.SEQUENCE__OPERATION:
				setOperation((Operation)null);
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
			case Protocolosv2Package.SEQUENCE__PASSO_DE_ENTRADA:
				return passoDeEntrada != null;
			case Protocolosv2Package.SEQUENCE__PASSO_DE_SAIDA:
				return passoDeSaida != null;
			case Protocolosv2Package.SEQUENCE__ID:
				return id != ID_EDEFAULT;
			case Protocolosv2Package.SEQUENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Protocolosv2Package.SEQUENCE__TYPE_VERBOSE:
				return TYPE_VERBOSE_EDEFAULT == null ? type_verbose != null : !TYPE_VERBOSE_EDEFAULT.equals(type_verbose);
			case Protocolosv2Package.SEQUENCE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Protocolosv2Package.SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Protocolosv2Package.SEQUENCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Protocolosv2Package.SEQUENCE__OPERATION:
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
		if (eIsProxy()) return super.toString();

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
