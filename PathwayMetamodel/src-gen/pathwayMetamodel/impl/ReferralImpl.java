/**
 */
package pathwayMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pathwayMetamodel.Pathway;
import pathwayMetamodel.PathwayMetamodelPackage;
import pathwayMetamodel.Referral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.ReferralImpl#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferralImpl extends ElementImpl implements Referral {
	/**
	 * The cached value of the '{@link #getPathway() <em>Pathway</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected EList<Pathway> pathway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.REFERRAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pathway> getPathway() {
		if (pathway == null) {
			pathway = new EObjectResolvingEList<Pathway>(Pathway.class, this,
					PathwayMetamodelPackage.REFERRAL__PATHWAY);
		}
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PathwayMetamodelPackage.REFERRAL__PATHWAY:
			return getPathway();
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
		case PathwayMetamodelPackage.REFERRAL__PATHWAY:
			getPathway().clear();
			getPathway().addAll((Collection<? extends Pathway>) newValue);
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
		case PathwayMetamodelPackage.REFERRAL__PATHWAY:
			getPathway().clear();
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
		case PathwayMetamodelPackage.REFERRAL__PATHWAY:
			return pathway != null && !pathway.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferralImpl
