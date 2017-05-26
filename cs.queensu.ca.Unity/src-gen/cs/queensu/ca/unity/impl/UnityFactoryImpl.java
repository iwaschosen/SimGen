/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnityFactoryImpl extends EFactoryImpl implements UnityFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnityFactory init()
  {
    try
    {
      UnityFactory theUnityFactory = (UnityFactory)EPackage.Registry.INSTANCE.getEFactory(UnityPackage.eNS_URI);
      if (theUnityFactory != null)
      {
        return theUnityFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UnityFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnityFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UnityPackage.SPECIFICATION: return createSpecification();
      case UnityPackage.META_OBJECT: return createMetaObject();
      case UnityPackage.ACTION: return createAction();
      case UnityPackage.PAYLOAD: return createPayload();
      case UnityPackage.PARAM: return createParam();
      case UnityPackage.REF: return createRef();
      case UnityPackage.SINGLE_REF: return createSingleRef();
      case UnityPackage.PROPERTY: return createProperty();
      case UnityPackage.ATTRIBUTE: return createAttribute();
      case UnityPackage.VAR_TYPE: return createVarType();
      case UnityPackage.RANGE: return createRange();
      case UnityPackage.VALUE: return createValue();
      case UnityPackage.REAL_LITERAL: return createRealLiteral();
      case UnityPackage.UNITY_OBJECT: return createUnityObject();
      case UnityPackage.OVERRIDE_ACTION: return createOverrideAction();
      case UnityPackage.CONFIG_ASSIGNMENT: return createConfigAssignment();
      case UnityPackage.CONFIG: return createConfig();
      case UnityPackage.ENV: return createENV();
      case UnityPackage.INSTANCE: return createInstance();
      case UnityPackage.CHANNEL: return createChannel();
      case UnityPackage.INIT: return createInit();
      case UnityPackage.MAP: return createMap();
      case UnityPackage.MESSAGE: return createMessage();
      case UnityPackage.QNAME: return createQName();
      case UnityPackage.AREA_NAME: return createAreaName();
      case UnityPackage.PORT: return createPort();
      case UnityPackage.INTERFACE_TYPE: return createinterfaceType();
      case UnityPackage.EXPRESSION: return createExpression();
      case UnityPackage.NOT_BOOLEAN_EXPRESSION: return createNotBooleanExpression();
      case UnityPackage.LITERAL: return createLiteral();
      case UnityPackage.INT_LITERAL: return createIntLiteral();
      case UnityPackage.BOOL_LITERAL: return createBoolLiteral();
      case UnityPackage.ST_LITERAL: return createStLiteral();
      case UnityPackage.IDENTIFIER: return createIdentifier();
      case UnityPackage.DOT_EXPRESSION: return createDotExpression();
      case UnityPackage.ASSIGN: return createAssign();
      case UnityPackage.OR_EXPRESSION: return createOrExpression();
      case UnityPackage.AND_EXPRESSION: return createAndExpression();
      case UnityPackage.GT: return createGT();
      case UnityPackage.LT: return createLT();
      case UnityPackage.GE: return createGE();
      case UnityPackage.LE: return createLE();
      case UnityPackage.EQ: return createEQ();
      case UnityPackage.NE: return createNE();
      case UnityPackage.ADDITION: return createAddition();
      case UnityPackage.MINUS: return createMinus();
      case UnityPackage.MULTIPLICATION: return createMultiplication();
      case UnityPackage.DIVIDE: return createDivide();
      case UnityPackage.MODULO: return createModulo();
      case UnityPackage.UNARY_EXPRESSION: return createUnaryExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaObject createMetaObject()
  {
    MetaObjectImpl metaObject = new MetaObjectImpl();
    return metaObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Payload createPayload()
  {
    PayloadImpl payload = new PayloadImpl();
    return payload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleRef createSingleRef()
  {
    SingleRefImpl singleRef = new SingleRefImpl();
    return singleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarType createVarType()
  {
    VarTypeImpl varType = new VarTypeImpl();
    return varType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnityObject createUnityObject()
  {
    UnityObjectImpl unityObject = new UnityObjectImpl();
    return unityObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverrideAction createOverrideAction()
  {
    OverrideActionImpl overrideAction = new OverrideActionImpl();
    return overrideAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigAssignment createConfigAssignment()
  {
    ConfigAssignmentImpl configAssignment = new ConfigAssignmentImpl();
    return configAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENV createENV()
  {
    ENVImpl env = new ENVImpl();
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Channel createChannel()
  {
    ChannelImpl channel = new ChannelImpl();
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName createQName()
  {
    QNameImpl qName = new QNameImpl();
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AreaName createAreaName()
  {
    AreaNameImpl areaName = new AreaNameImpl();
    return areaName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interfaceType createinterfaceType()
  {
    interfaceTypeImpl interfaceType = new interfaceTypeImpl();
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotBooleanExpression createNotBooleanExpression()
  {
    NotBooleanExpressionImpl notBooleanExpression = new NotBooleanExpressionImpl();
    return notBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLiteral createStLiteral()
  {
    StLiteralImpl stLiteral = new StLiteralImpl();
    return stLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotExpression createDotExpression()
  {
    DotExpressionImpl dotExpression = new DotExpressionImpl();
    return dotExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GT createGT()
  {
    GTImpl gt = new GTImpl();
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LT createLT()
  {
    LTImpl lt = new LTImpl();
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GE createGE()
  {
    GEImpl ge = new GEImpl();
    return ge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LE createLE()
  {
    LEImpl le = new LEImpl();
    return le;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQ createEQ()
  {
    EQImpl eq = new EQImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NE createNE()
  {
    NEImpl ne = new NEImpl();
    return ne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modulo createModulo()
  {
    ModuloImpl modulo = new ModuloImpl();
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnityPackage getUnityPackage()
  {
    return (UnityPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UnityPackage getPackage()
  {
    return UnityPackage.eINSTANCE;
  }

} //UnityFactoryImpl
