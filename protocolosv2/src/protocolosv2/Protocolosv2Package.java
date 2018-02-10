/**
 */
package protocolosv2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see protocolosv2.Protocolosv2Factory
 * @model kind="package"
 * @generated
 */
public interface Protocolosv2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "protocolosv2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/protocolosv2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "protocolosv2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Protocolosv2Package eINSTANCE = protocolosv2.impl.Protocolosv2PackageImpl.init();

	/**
	 * The meta object id for the '{@link protocolosv2.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.OperandImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.VariableImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = OPERAND__NAME;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.NumericImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__ID = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__WEIGHT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__VALUE = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.YesOrNoImpl <em>Yes Or No</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.YesOrNoImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getYesOrNo()
	 * @generated
	 */
	int YES_OR_NO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__ID = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__WEIGHT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__VALUE = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.ElementImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__URL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_INITIAL = 6;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_TERMINAL = 7;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__INPUT_SEQUENCES = 8;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OUTPUT_SEQUENCES = 9;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MANDATORY = 10;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.AuxiliaryConductImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getAuxiliaryConduct()
	 * @generated
	 */
	int AUXILIARY_CONDUCT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__QUESTIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.QuestionImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__URL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CATEGORY = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.ProtocolImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__URL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__CODE = 3;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ELEMENTO = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__VARIABLE = 8;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.PrescriptionImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__MEDICATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.DischargeImpl <em>Discharge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.DischargeImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getDischarge()
	 * @generated
	 */
	int DISCHARGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The number of structural features of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.ReferralImpl <em>Referral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.ReferralImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getReferral()
	 * @generated
	 */
	int REFERRAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__PROTOCOL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.TreatmentImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Examination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXAMINATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__MEDICATION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Admission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ADMISSION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PROCEDURE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.InformationImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE_VERBOSE = ELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__URL = ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__IS_INITIAL = ELEMENT__IS_INITIAL;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__IS_TERMINAL = ELEMENT__IS_TERMINAL;

	/**
	 * The feature id for the '<em><b>Input Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__INPUT_SEQUENCES = ELEMENT__INPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Output Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__OUTPUT_SEQUENCES = ELEMENT__OUTPUT_SEQUENCES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__MANDATORY = ELEMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.SequenceImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 12;

	/**
	 * The feature id for the '<em><b>Input Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INPUT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Output Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OUTPUT_STEP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE_VERBOSE = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__URL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OPERATION = 8;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.OperationImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = OPERAND__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATOR = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERAND = OPERAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = OPERAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.CategoryImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__QUESTION = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.ExaminationImpl <em>Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.ExaminationImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getExamination()
	 * @generated
	 */
	int EXAMINATION = 15;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__URL = 0;

	/**
	 * The feature id for the '<em><b>Exam id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__EXAM_ID = 1;

	/**
	 * The feature id for the '<em><b>Limb side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__LIMB_SIDE = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__REASON = 4;

	/**
	 * The feature id for the '<em><b>Clinical indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CLINICAL_INDICATION = 5;

	/**
	 * The number of structural features of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.MedicationImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 16;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__URL = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE = 1;

	/**
	 * The feature id for the '<em><b>Med id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MED_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__BRAND = 6;

	/**
	 * The feature id for the '<em><b>Standardized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STANDARDIZED = 7;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CONTROLLED = 8;

	/**
	 * The feature id for the '<em><b>Consigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CONSIGNED = 9;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CRITICAL = 10;

	/**
	 * The feature id for the '<em><b>Invasive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__INVASIVE = 11;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__OUTPATIENT = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__UNIT = 13;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ACCESS = 14;

	/**
	 * The feature id for the '<em><b>Daily dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DAILY_DOSAGE = 15;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CYCLES = 16;

	/**
	 * The feature id for the '<em><b>Treatement time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TREATEMENT_TIME = 17;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__FREQUENCY = 18;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STANDARD = 19;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.ProcedureImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 17;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__URL = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__QUANTITY = 3;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.impl.AdmissionImpl <em>Admission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.impl.AdmissionImpl
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getAdmission()
	 * @generated
	 */
	int ADMISSION = 18;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION__URL = 0;

	/**
	 * The feature id for the '<em><b>Admission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION__ADMISSION = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION__REASON = 2;

	/**
	 * The feature id for the '<em><b>Clinical indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION__CLINICAL_INDICATION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION__QUANTITY = 4;

	/**
	 * The number of structural features of the '<em>Admission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Admission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link protocolosv2.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.Operator
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 20;

	/**
	 * The meta object id for the '{@link protocolosv2.NewEnum2 <em>New Enum2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see protocolosv2.NewEnum2
	 * @see protocolosv2.impl.Protocolosv2PackageImpl#getNewEnum2()
	 * @generated
	 */
	int NEW_ENUM2 = 21;


	/**
	 * Returns the meta object for class '{@link protocolosv2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see protocolosv2.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see protocolosv2.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Numeric#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Numeric#getId()
	 * @see #getNumeric()
	 * @generated
	 */
	EAttribute getNumeric_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Numeric#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see protocolosv2.Numeric#getWeight()
	 * @see #getNumeric()
	 * @generated
	 */
	EAttribute getNumeric_Weight();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Numeric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see protocolosv2.Numeric#getValue()
	 * @see #getNumeric()
	 * @generated
	 */
	EAttribute getNumeric_Value();

	/**
	 * Returns the meta object for class '{@link protocolosv2.YesOrNo <em>Yes Or No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yes Or No</em>'.
	 * @see protocolosv2.YesOrNo
	 * @generated
	 */
	EClass getYesOrNo();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.YesOrNo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.YesOrNo#getId()
	 * @see #getYesOrNo()
	 * @generated
	 */
	EAttribute getYesOrNo_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.YesOrNo#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see protocolosv2.YesOrNo#getWeight()
	 * @see #getYesOrNo()
	 * @generated
	 */
	EAttribute getYesOrNo_Weight();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.YesOrNo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see protocolosv2.YesOrNo#getValue()
	 * @see #getYesOrNo()
	 * @generated
	 */
	EAttribute getYesOrNo_Value();

	/**
	 * Returns the meta object for class '{@link protocolosv2.AuxiliaryConduct <em>Auxiliary Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Conduct</em>'.
	 * @see protocolosv2.AuxiliaryConduct
	 * @generated
	 */
	EClass getAuxiliaryConduct();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.AuxiliaryConduct#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see protocolosv2.AuxiliaryConduct#getQuestions()
	 * @see #getAuxiliaryConduct()
	 * @generated
	 */
	EReference getAuxiliaryConduct_Questions();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see protocolosv2.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see protocolosv2.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see protocolosv2.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Question#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Question#getUrl()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the reference '{@link protocolosv2.Question#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see protocolosv2.Question#getCategory()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Category();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see protocolosv2.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Protocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Protocol#getId()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Protocol#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Protocol#getUrl()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Protocol#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see protocolosv2.Protocol#getCode()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Protocol#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elemento</em>'.
	 * @see protocolosv2.Protocol#getElemento()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Elemento();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Protocol#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see protocolosv2.Protocol#getSequence()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Protocol#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see protocolosv2.Protocol#getCategory()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Protocol#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see protocolosv2.Protocol#getOperation()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Protocol#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see protocolosv2.Protocol#getVariable()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Variable();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see protocolosv2.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see protocolosv2.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getType_verbose <em>Type verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type verbose</em>'.
	 * @see protocolosv2.Element#getType_verbose()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type_verbose();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Element#getUrl()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see protocolosv2.Element#getDescription()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see protocolosv2.Element#isIsInitial()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#isIsTerminal <em>Is Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Terminal</em>'.
	 * @see protocolosv2.Element#isIsTerminal()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsTerminal();

	/**
	 * Returns the meta object for the reference list '{@link protocolosv2.Element#getInputSequences <em>Input Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Sequences</em>'.
	 * @see protocolosv2.Element#getInputSequences()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_InputSequences();

	/**
	 * Returns the meta object for the reference list '{@link protocolosv2.Element#getOutputSequences <em>Output Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Sequences</em>'.
	 * @see protocolosv2.Element#getOutputSequences()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OutputSequences();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Element#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see protocolosv2.Element#isMandatory()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Mandatory();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescription</em>'.
	 * @see protocolosv2.Prescription
	 * @generated
	 */
	EClass getPrescription();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Prescription#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medication</em>'.
	 * @see protocolosv2.Prescription#getMedication()
	 * @see #getPrescription()
	 * @generated
	 */
	EReference getPrescription_Medication();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Discharge <em>Discharge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge</em>'.
	 * @see protocolosv2.Discharge
	 * @generated
	 */
	EClass getDischarge();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Referral <em>Referral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referral</em>'.
	 * @see protocolosv2.Referral
	 * @generated
	 */
	EClass getReferral();

	/**
	 * Returns the meta object for the reference list '{@link protocolosv2.Referral#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protocol</em>'.
	 * @see protocolosv2.Referral#getProtocol()
	 * @see #getReferral()
	 * @generated
	 */
	EReference getReferral_Protocol();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see protocolosv2.Treatment
	 * @generated
	 */
	EClass getTreatment();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Treatment#getExamination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examination</em>'.
	 * @see protocolosv2.Treatment#getExamination()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Examination();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Treatment#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medication</em>'.
	 * @see protocolosv2.Treatment#getMedication()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Medication();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Treatment#getAdmission <em>Admission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admission</em>'.
	 * @see protocolosv2.Treatment#getAdmission()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Admission();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Treatment#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedure</em>'.
	 * @see protocolosv2.Treatment#getProcedure()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Procedure();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see protocolosv2.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Information#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see protocolosv2.Information#getText()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Text();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see protocolosv2.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference '{@link protocolosv2.Sequence#getInputStep <em>Input Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Step</em>'.
	 * @see protocolosv2.Sequence#getInputStep()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_InputStep();

	/**
	 * Returns the meta object for the reference '{@link protocolosv2.Sequence#getOutputStep <em>Output Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Step</em>'.
	 * @see protocolosv2.Sequence#getOutputStep()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_OutputStep();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Sequence#getId()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see protocolosv2.Sequence#getType()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Type();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getType_verbose <em>Type verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type verbose</em>'.
	 * @see protocolosv2.Sequence#getType_verbose()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Type_verbose();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Sequence#getUrl()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Sequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see protocolosv2.Sequence#getDescription()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Description();

	/**
	 * Returns the meta object for the containment reference '{@link protocolosv2.Sequence#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see protocolosv2.Sequence#getOperation()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Operation();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see protocolosv2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Operation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see protocolosv2.Operation#getOperator()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link protocolosv2.Operation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see protocolosv2.Operation#getOperand()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operand();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Operation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Operation#getId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Id();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see protocolosv2.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the reference list '{@link protocolosv2.Category#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Question</em>'.
	 * @see protocolosv2.Category#getQuestion()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Question();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Examination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination</em>'.
	 * @see protocolosv2.Examination
	 * @generated
	 */
	EClass getExamination();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Examination#getUrl()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getExam_id <em>Exam id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam id</em>'.
	 * @see protocolosv2.Examination#getExam_id()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Exam_id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getLimb_side <em>Limb side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limb side</em>'.
	 * @see protocolosv2.Examination#getLimb_side()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Limb_side();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see protocolosv2.Examination#getQuantity()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see protocolosv2.Examination#getReason()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Reason();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Examination#getClinical_indication <em>Clinical indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical indication</em>'.
	 * @see protocolosv2.Examination#getClinical_indication()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Clinical_indication();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see protocolosv2.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Medication#getUrl()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see protocolosv2.Medication#getCode()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Code();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getMed_id <em>Med id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Med id</em>'.
	 * @see protocolosv2.Medication#getMed_id()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Med_id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see protocolosv2.Medication#getId()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Id();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Medication#getName()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Name();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see protocolosv2.Medication#getDescription()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Description();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see protocolosv2.Medication#getBrand()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Brand();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isStandardized <em>Standardized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standardized</em>'.
	 * @see protocolosv2.Medication#isStandardized()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Standardized();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlled</em>'.
	 * @see protocolosv2.Medication#isControlled()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Controlled();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isConsigned <em>Consigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consigned</em>'.
	 * @see protocolosv2.Medication#isConsigned()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Consigned();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see protocolosv2.Medication#isCritical()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Critical();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isInvasive <em>Invasive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invasive</em>'.
	 * @see protocolosv2.Medication#isInvasive()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Invasive();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see protocolosv2.Medication#isOutpatient()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see protocolosv2.Medication#getUnit()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Unit();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see protocolosv2.Medication#getAccess()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Access();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getDaily_dosage <em>Daily dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily dosage</em>'.
	 * @see protocolosv2.Medication#getDaily_dosage()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Daily_dosage();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see protocolosv2.Medication#getCycles()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Cycles();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getTreatement_time <em>Treatement time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatement time</em>'.
	 * @see protocolosv2.Medication#getTreatement_time()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Treatement_time();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see protocolosv2.Medication#getFrequency()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Medication#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see protocolosv2.Medication#getStandard()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Standard();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see protocolosv2.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Procedure#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Procedure#getUrl()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Procedure#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure</em>'.
	 * @see protocolosv2.Procedure#getProcedure()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Procedure#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see protocolosv2.Procedure#getFrequency()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Procedure#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see protocolosv2.Procedure#getQuantity()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Quantity();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Admission <em>Admission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admission</em>'.
	 * @see protocolosv2.Admission
	 * @generated
	 */
	EClass getAdmission();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Admission#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see protocolosv2.Admission#getUrl()
	 * @see #getAdmission()
	 * @generated
	 */
	EAttribute getAdmission_Url();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Admission#getAdmission <em>Admission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admission</em>'.
	 * @see protocolosv2.Admission#getAdmission()
	 * @see #getAdmission()
	 * @generated
	 */
	EAttribute getAdmission_Admission();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Admission#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see protocolosv2.Admission#getReason()
	 * @see #getAdmission()
	 * @generated
	 */
	EAttribute getAdmission_Reason();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Admission#getClinical_indication <em>Clinical indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical indication</em>'.
	 * @see protocolosv2.Admission#getClinical_indication()
	 * @see #getAdmission()
	 * @generated
	 */
	EAttribute getAdmission_Clinical_indication();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Admission#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see protocolosv2.Admission#getQuantity()
	 * @see #getAdmission()
	 * @generated
	 */
	EAttribute getAdmission_Quantity();

	/**
	 * Returns the meta object for class '{@link protocolosv2.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see protocolosv2.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the attribute '{@link protocolosv2.Operand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see protocolosv2.Operand#getName()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Name();

	/**
	 * Returns the meta object for enum '{@link protocolosv2.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see protocolosv2.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link protocolosv2.NewEnum2 <em>New Enum2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum2</em>'.
	 * @see protocolosv2.NewEnum2
	 * @generated
	 */
	EEnum getNewEnum2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Protocolosv2Factory getProtocolosv2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link protocolosv2.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.VariableImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.NumericImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC__ID = eINSTANCE.getNumeric_Id();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC__WEIGHT = eINSTANCE.getNumeric_Weight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC__VALUE = eINSTANCE.getNumeric_Value();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.YesOrNoImpl <em>Yes Or No</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.YesOrNoImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getYesOrNo()
		 * @generated
		 */
		EClass YES_OR_NO = eINSTANCE.getYesOrNo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YES_OR_NO__ID = eINSTANCE.getYesOrNo_Id();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YES_OR_NO__WEIGHT = eINSTANCE.getYesOrNo_Weight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YES_OR_NO__VALUE = eINSTANCE.getYesOrNo_Value();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.AuxiliaryConductImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getAuxiliaryConduct()
		 * @generated
		 */
		EClass AUXILIARY_CONDUCT = eINSTANCE.getAuxiliaryConduct();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_CONDUCT__QUESTIONS = eINSTANCE.getAuxiliaryConduct_Questions();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.QuestionImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__URL = eINSTANCE.getQuestion_Url();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__CATEGORY = eINSTANCE.getQuestion_Category();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.ProtocolImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__ID = eINSTANCE.getProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__URL = eINSTANCE.getProtocol_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__CODE = eINSTANCE.getProtocol_Code();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__ELEMENTO = eINSTANCE.getProtocol_Elemento();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__SEQUENCE = eINSTANCE.getProtocol_Sequence();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__CATEGORY = eINSTANCE.getProtocol_Category();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__OPERATION = eINSTANCE.getProtocol_Operation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__VARIABLE = eINSTANCE.getProtocol_Variable();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.ElementImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Type verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE_VERBOSE = eINSTANCE.getElement_Type_verbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__URL = eINSTANCE.getElement_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_INITIAL = eINSTANCE.getElement_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_TERMINAL = eINSTANCE.getElement_IsTerminal();

		/**
		 * The meta object literal for the '<em><b>Input Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__INPUT_SEQUENCES = eINSTANCE.getElement_InputSequences();

		/**
		 * The meta object literal for the '<em><b>Output Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OUTPUT_SEQUENCES = eINSTANCE.getElement_OutputSequences();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MANDATORY = eINSTANCE.getElement_Mandatory();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.PrescriptionImpl <em>Prescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.PrescriptionImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getPrescription()
		 * @generated
		 */
		EClass PRESCRIPTION = eINSTANCE.getPrescription();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTION__MEDICATION = eINSTANCE.getPrescription_Medication();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.DischargeImpl <em>Discharge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.DischargeImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getDischarge()
		 * @generated
		 */
		EClass DISCHARGE = eINSTANCE.getDischarge();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.ReferralImpl <em>Referral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.ReferralImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getReferral()
		 * @generated
		 */
		EClass REFERRAL = eINSTANCE.getReferral();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRAL__PROTOCOL = eINSTANCE.getReferral_Protocol();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.TreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.TreatmentImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getTreatment()
		 * @generated
		 */
		EClass TREATMENT = eINSTANCE.getTreatment();

		/**
		 * The meta object literal for the '<em><b>Examination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__EXAMINATION = eINSTANCE.getTreatment_Examination();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__MEDICATION = eINSTANCE.getTreatment_Medication();

		/**
		 * The meta object literal for the '<em><b>Admission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__ADMISSION = eINSTANCE.getTreatment_Admission();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PROCEDURE = eINSTANCE.getTreatment_Procedure();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.InformationImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__TEXT = eINSTANCE.getInformation_Text();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.SequenceImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Input Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__INPUT_STEP = eINSTANCE.getSequence_InputStep();

		/**
		 * The meta object literal for the '<em><b>Output Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__OUTPUT_STEP = eINSTANCE.getSequence_OutputStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__ID = eINSTANCE.getSequence_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TYPE = eINSTANCE.getSequence_Type();

		/**
		 * The meta object literal for the '<em><b>Type verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TYPE_VERBOSE = eINSTANCE.getSequence_Type_verbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__URL = eINSTANCE.getSequence_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__DESCRIPTION = eINSTANCE.getSequence_Description();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__OPERATION = eINSTANCE.getSequence_Operation();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.OperationImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATOR = eINSTANCE.getOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERAND = eINSTANCE.getOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ID = eINSTANCE.getOperation_Id();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.CategoryImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__QUESTION = eINSTANCE.getCategory_Question();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.ExaminationImpl <em>Examination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.ExaminationImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getExamination()
		 * @generated
		 */
		EClass EXAMINATION = eINSTANCE.getExamination();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__URL = eINSTANCE.getExamination_Url();

		/**
		 * The meta object literal for the '<em><b>Exam id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__EXAM_ID = eINSTANCE.getExamination_Exam_id();

		/**
		 * The meta object literal for the '<em><b>Limb side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__LIMB_SIDE = eINSTANCE.getExamination_Limb_side();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__QUANTITY = eINSTANCE.getExamination_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__REASON = eINSTANCE.getExamination_Reason();

		/**
		 * The meta object literal for the '<em><b>Clinical indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__CLINICAL_INDICATION = eINSTANCE.getExamination_Clinical_indication();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.MedicationImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__URL = eINSTANCE.getMedication_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CODE = eINSTANCE.getMedication_Code();

		/**
		 * The meta object literal for the '<em><b>Med id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__MED_ID = eINSTANCE.getMedication_Med_id();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__ID = eINSTANCE.getMedication_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__NAME = eINSTANCE.getMedication_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__DESCRIPTION = eINSTANCE.getMedication_Description();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__BRAND = eINSTANCE.getMedication_Brand();

		/**
		 * The meta object literal for the '<em><b>Standardized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__STANDARDIZED = eINSTANCE.getMedication_Standardized();

		/**
		 * The meta object literal for the '<em><b>Controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CONTROLLED = eINSTANCE.getMedication_Controlled();

		/**
		 * The meta object literal for the '<em><b>Consigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CONSIGNED = eINSTANCE.getMedication_Consigned();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CRITICAL = eINSTANCE.getMedication_Critical();

		/**
		 * The meta object literal for the '<em><b>Invasive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__INVASIVE = eINSTANCE.getMedication_Invasive();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__OUTPATIENT = eINSTANCE.getMedication_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__UNIT = eINSTANCE.getMedication_Unit();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__ACCESS = eINSTANCE.getMedication_Access();

		/**
		 * The meta object literal for the '<em><b>Daily dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__DAILY_DOSAGE = eINSTANCE.getMedication_Daily_dosage();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CYCLES = eINSTANCE.getMedication_Cycles();

		/**
		 * The meta object literal for the '<em><b>Treatement time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__TREATEMENT_TIME = eINSTANCE.getMedication_Treatement_time();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__FREQUENCY = eINSTANCE.getMedication_Frequency();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__STANDARD = eINSTANCE.getMedication_Standard();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.ProcedureImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__URL = eINSTANCE.getProcedure_Url();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__PROCEDURE = eINSTANCE.getProcedure_Procedure();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__FREQUENCY = eINSTANCE.getProcedure_Frequency();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__QUANTITY = eINSTANCE.getProcedure_Quantity();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.AdmissionImpl <em>Admission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.AdmissionImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getAdmission()
		 * @generated
		 */
		EClass ADMISSION = eINSTANCE.getAdmission();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMISSION__URL = eINSTANCE.getAdmission_Url();

		/**
		 * The meta object literal for the '<em><b>Admission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMISSION__ADMISSION = eINSTANCE.getAdmission_Admission();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMISSION__REASON = eINSTANCE.getAdmission_Reason();

		/**
		 * The meta object literal for the '<em><b>Clinical indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMISSION__CLINICAL_INDICATION = eINSTANCE.getAdmission_Clinical_indication();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMISSION__QUANTITY = eINSTANCE.getAdmission_Quantity();

		/**
		 * The meta object literal for the '{@link protocolosv2.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.impl.OperandImpl
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__NAME = eINSTANCE.getOperand_Name();

		/**
		 * The meta object literal for the '{@link protocolosv2.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.Operator
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link protocolosv2.NewEnum2 <em>New Enum2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see protocolosv2.NewEnum2
		 * @see protocolosv2.impl.Protocolosv2PackageImpl#getNewEnum2()
		 * @generated
		 */
		EEnum NEW_ENUM2 = eINSTANCE.getNewEnum2();

	}

} //Protocolosv2Package
