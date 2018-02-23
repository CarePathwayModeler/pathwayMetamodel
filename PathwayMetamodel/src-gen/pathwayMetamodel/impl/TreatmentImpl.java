/**
 */
package pathwayMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pathwayMetamodel.Admission;
import pathwayMetamodel.Examination;
import pathwayMetamodel.Medication;
import pathwayMetamodel.PathwayMetamodelPackage;
import pathwayMetamodel.Procedure;
import pathwayMetamodel.Treatment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pathwayMetamodel.impl.TreatmentImpl#getExamination <em>Examination</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.TreatmentImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.TreatmentImpl#getAdmission <em>Admission</em>}</li>
 *   <li>{@link pathwayMetamodel.impl.TreatmentImpl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreatmentImpl extends ElementImpl implements Treatment {
	/**
	 * The cached value of the '{@link #getExamination() <em>Examination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamination()
	 * @generated
	 * @ordered
	 */
	protected EList<Examination> examination;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Medication> medication;

	/**
	 * The cached value of the '{@link #getAdmission() <em>Admission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmission()
	 * @generated
	 * @ordered
	 */
	protected EList<Admission> admission;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathwayMetamodelPackage.Literals.TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Examination> getExamination() {
		if (examination == null) {
			examination = new EObjectContainmentEList<Examination>(Examination.class, this,
					PathwayMetamodelPackage.TREATMENT__EXAMINATION);
		}
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medication> getMedication() {
		if (medication == null) {
			medication = new EObjectContainmentEList<Medication>(Medication.class, this,
					PathwayMetamodelPackage.TREATMENT__MEDICATION);
		}
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Admission> getAdmission() {
		if (admission == null) {
			admission = new EObjectContainmentEList<Admission>(Admission.class, this,
					PathwayMetamodelPackage.TREATMENT__ADMISSION);
		}
		return admission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<Procedure>(Procedure.class, this,
					PathwayMetamodelPackage.TREATMENT__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PathwayMetamodelPackage.TREATMENT__EXAMINATION:
			return ((InternalEList<?>) getExamination()).basicRemove(otherEnd, msgs);
		case PathwayMetamodelPackage.TREATMENT__MEDICATION:
			return ((InternalEList<?>) getMedication()).basicRemove(otherEnd, msgs);
		case PathwayMetamodelPackage.TREATMENT__ADMISSION:
			return ((InternalEList<?>) getAdmission()).basicRemove(otherEnd, msgs);
		case PathwayMetamodelPackage.TREATMENT__PROCEDURE:
			return ((InternalEList<?>) getProcedure()).basicRemove(otherEnd, msgs);
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
		case PathwayMetamodelPackage.TREATMENT__EXAMINATION:
			return getExamination();
		case PathwayMetamodelPackage.TREATMENT__MEDICATION:
			return getMedication();
		case PathwayMetamodelPackage.TREATMENT__ADMISSION:
			return getAdmission();
		case PathwayMetamodelPackage.TREATMENT__PROCEDURE:
			return getProcedure();
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
		case PathwayMetamodelPackage.TREATMENT__EXAMINATION:
			getExamination().clear();
			getExamination().addAll((Collection<? extends Examination>) newValue);
			return;
		case PathwayMetamodelPackage.TREATMENT__MEDICATION:
			getMedication().clear();
			getMedication().addAll((Collection<? extends Medication>) newValue);
			return;
		case PathwayMetamodelPackage.TREATMENT__ADMISSION:
			getAdmission().clear();
			getAdmission().addAll((Collection<? extends Admission>) newValue);
			return;
		case PathwayMetamodelPackage.TREATMENT__PROCEDURE:
			getProcedure().clear();
			getProcedure().addAll((Collection<? extends Procedure>) newValue);
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
		case PathwayMetamodelPackage.TREATMENT__EXAMINATION:
			getExamination().clear();
			return;
		case PathwayMetamodelPackage.TREATMENT__MEDICATION:
			getMedication().clear();
			return;
		case PathwayMetamodelPackage.TREATMENT__ADMISSION:
			getAdmission().clear();
			return;
		case PathwayMetamodelPackage.TREATMENT__PROCEDURE:
			getProcedure().clear();
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
		case PathwayMetamodelPackage.TREATMENT__EXAMINATION:
			return examination != null && !examination.isEmpty();
		case PathwayMetamodelPackage.TREATMENT__MEDICATION:
			return medication != null && !medication.isEmpty();
		case PathwayMetamodelPackage.TREATMENT__ADMISSION:
			return admission != null && !admission.isEmpty();
		case PathwayMetamodelPackage.TREATMENT__PROCEDURE:
			return procedure != null && !procedure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TreatmentImpl
