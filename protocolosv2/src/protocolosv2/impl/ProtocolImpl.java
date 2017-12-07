/**
 */
package protocolosv2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protocolosv2.Category;
import protocolosv2.Element;
import protocolosv2.Operation;
import protocolosv2.Protocol;
import protocolosv2.Protocolosv2Package;
import protocolosv2.Sequence;
import protocolosv2.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getId <em>Id</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getCode <em>Code</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getElemento <em>Elemento</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link protocolosv2.impl.ProtocolImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolImpl extends MinimalEObjectImpl.Container implements Protocol {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElemento() <em>Elemento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elemento;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequence;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Protocolosv2Package.Literals.PROTOCOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.PROTOCOL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.PROTOCOL__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.PROTOCOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Protocolosv2Package.PROTOCOL__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElemento() {
		if (elemento == null) {
			elemento = new EObjectContainmentEList<Element>(Element.class, this, Protocolosv2Package.PROTOCOL__ELEMENTO);
		}
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequence() {
		if (sequence == null) {
			sequence = new EObjectContainmentEList<Sequence>(Sequence.class, this, Protocolosv2Package.PROTOCOL__SEQUENCE);
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Category>(Category.class, this, Protocolosv2Package.PROTOCOL__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, Protocolosv2Package.PROTOCOL__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, Protocolosv2Package.PROTOCOL__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
				return ((InternalEList<?>)getElemento()).basicRemove(otherEnd, msgs);
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case Protocolosv2Package.PROTOCOL__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case Protocolosv2Package.PROTOCOL__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case Protocolosv2Package.PROTOCOL__ID:
				return getId();
			case Protocolosv2Package.PROTOCOL__URL:
				return getUrl();
			case Protocolosv2Package.PROTOCOL__NAME:
				return getName();
			case Protocolosv2Package.PROTOCOL__CODE:
				return getCode();
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
				return getElemento();
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
				return getSequence();
			case Protocolosv2Package.PROTOCOL__CATEGORY:
				return getCategory();
			case Protocolosv2Package.PROTOCOL__OPERATION:
				return getOperation();
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				return getVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Protocolosv2Package.PROTOCOL__ID:
				setId((Integer)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__URL:
				setUrl((String)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__NAME:
				setName((String)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__CODE:
				setCode((String)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
				getElemento().clear();
				getElemento().addAll((Collection<? extends Element>)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends Sequence>)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
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
			case Protocolosv2Package.PROTOCOL__ID:
				setId(ID_EDEFAULT);
				return;
			case Protocolosv2Package.PROTOCOL__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Protocolosv2Package.PROTOCOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Protocolosv2Package.PROTOCOL__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
				getElemento().clear();
				return;
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
				getSequence().clear();
				return;
			case Protocolosv2Package.PROTOCOL__CATEGORY:
				getCategory().clear();
				return;
			case Protocolosv2Package.PROTOCOL__OPERATION:
				getOperation().clear();
				return;
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				getVariable().clear();
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
			case Protocolosv2Package.PROTOCOL__ID:
				return id != ID_EDEFAULT;
			case Protocolosv2Package.PROTOCOL__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Protocolosv2Package.PROTOCOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Protocolosv2Package.PROTOCOL__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
				return elemento != null && !elemento.isEmpty();
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
				return sequence != null && !sequence.isEmpty();
			case Protocolosv2Package.PROTOCOL__CATEGORY:
				return category != null && !category.isEmpty();
			case Protocolosv2Package.PROTOCOL__OPERATION:
				return operation != null && !operation.isEmpty();
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				return variable != null && !variable.isEmpty();
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
		result.append(", url: ");
		result.append(url);
		result.append(", name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProtocolImpl
