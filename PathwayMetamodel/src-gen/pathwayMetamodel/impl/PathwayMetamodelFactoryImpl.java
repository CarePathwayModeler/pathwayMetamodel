/**
 */
package pathwayMetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pathwayMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathwayMetamodelFactoryImpl extends EFactoryImpl implements PathwayMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathwayMetamodelFactory init() {
		try {
			PathwayMetamodelFactory thePathwayMetamodelFactory = (PathwayMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(PathwayMetamodelPackage.eNS_URI);
			if (thePathwayMetamodelFactory != null) {
				return thePathwayMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathwayMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathwayMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PathwayMetamodelPackage.OPERATION:
			return createOperation();
		case PathwayMetamodelPackage.AUXILIARY_CONDUCT:
			return createAuxiliaryConduct();
		case PathwayMetamodelPackage.QUESTION:
			return createQuestion();
		case PathwayMetamodelPackage.DISCHARGE:
			return createDischarge();
		case PathwayMetamodelPackage.EXAMINATION:
			return createExamination();
		case PathwayMetamodelPackage.OPERAND:
			return createOperand();
		case PathwayMetamodelPackage.YES_OR_NO:
			return createYesOrNo();
		case PathwayMetamodelPackage.NUMERIC:
			return createNumeric();
		case PathwayMetamodelPackage.REFERRAL:
			return createReferral();
		case PathwayMetamodelPackage.TREATMENT:
			return createTreatment();
		case PathwayMetamodelPackage.PRESCRIPTION:
			return createPrescription();
		case PathwayMetamodelPackage.ADMISSION:
			return createAdmission();
		case PathwayMetamodelPackage.SEQUENCE:
			return createSequence();
		case PathwayMetamodelPackage.MEDICATION:
			return createMedication();
		case PathwayMetamodelPackage.PATHWAY:
			return createPathway();
		case PathwayMetamodelPackage.INFORMATION:
			return createInformation();
		case PathwayMetamodelPackage.CATEGORY:
			return createCategory();
		case PathwayMetamodelPackage.PROCEDURE:
			return createProcedure();
		case PathwayMetamodelPackage.ACTION:
			return createAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PathwayMetamodelPackage.OPERATOR:
			return createOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PathwayMetamodelPackage.OPERATOR:
			return convertOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryConduct createAuxiliaryConduct() {
		AuxiliaryConductImpl auxiliaryConduct = new AuxiliaryConductImpl();
		return auxiliaryConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discharge createDischarge() {
		DischargeImpl discharge = new DischargeImpl();
		return discharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examination createExamination() {
		ExaminationImpl examination = new ExaminationImpl();
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand createOperand() {
		OperandImpl operand = new OperandImpl();
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo createYesOrNo() {
		YesOrNoImpl yesOrNo = new YesOrNoImpl();
		return yesOrNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referral createReferral() {
		ReferralImpl referral = new ReferralImpl();
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment createTreatment() {
		TreatmentImpl treatment = new TreatmentImpl();
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription createPrescription() {
		PrescriptionImpl prescription = new PrescriptionImpl();
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admission createAdmission() {
		AdmissionImpl admission = new AdmissionImpl();
		return admission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway createPathway() {
		PathwayImpl pathway = new PathwayImpl();
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathwayMetamodelPackage getPathwayMetamodelPackage() {
		return (PathwayMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathwayMetamodelPackage getPackage() {
		return PathwayMetamodelPackage.eINSTANCE;
	}

} //PathwayMetamodelFactoryImpl
