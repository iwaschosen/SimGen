/*
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.ide.contentassist.antlr;

import com.google.inject.Inject;
import cs.queensu.ca.ide.contentassist.antlr.internal.InternalUnityParser;
import cs.queensu.ca.services.UnityGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UnityParser extends AbstractContentAssistParser {

	@Inject
	private UnityGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUnityParser createParser() {
		InternalUnityParser result = new InternalUnityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSpecificationAccess().getSpecAlternatives_0(), "rule__Specification__SpecAlternatives_0");
					put(grammarAccess.getMetaObjectAccess().getKindAlternatives_3_0(), "rule__MetaObject__KindAlternatives_3_0");
					put(grammarAccess.getMetaObjectAccess().getAlternatives_5(), "rule__MetaObject__Alternatives_5");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getVarTypeAccess().getNameAlternatives_0(), "rule__VarType__NameAlternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getUnityObjectAccess().getAlternatives_5(), "rule__UnityObject__Alternatives_5");
					put(grammarAccess.getENVAccess().getAlternatives_3(), "rule__ENV__Alternatives_3");
					put(grammarAccess.getChannelAccess().getAlternatives_5(), "rule__Channel__Alternatives_5");
					put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
					put(grammarAccess.getInterfaceTypeAccess().getNameAlternatives_0(), "rule__InterfaceType__NameAlternatives_0");
					put(grammarAccess.getComparisonOperatorsAccess().getAlternatives_1_0_0(), "rule__ComparisonOperators__Alternatives_1_0_0");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0_0(), "rule__Addition__Alternatives_1_0_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0_0(), "rule__Multiplication__Alternatives_1_0_0");
					put(grammarAccess.getUnaryAccess().getAlternatives(), "rule__Unary__Alternatives");
					put(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getAlternatives(), "rule__UnaryExpressionNotPlusMinus__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralOrIdentifierAccess().getAlternatives(), "rule__LiteralOrIdentifier__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getMetaObjectAccess().getGroup(), "rule__MetaObject__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_5(), "rule__Action__Group_5__0");
					put(grammarAccess.getPayloadAccess().getGroup(), "rule__Payload__Group__0");
					put(grammarAccess.getPayloadAccess().getGroup_1(), "rule__Payload__Group_1__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getDotExpressionAccess().getGroup(), "rule__DotExpression__Group__0");
					put(grammarAccess.getDotExpressionAccess().getGroup_1(), "rule__DotExpression__Group_1__0");
					put(grammarAccess.getSingleRefAccess().getGroup(), "rule__SingleRef__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getValueAccess().getGroup_0(), "rule__Value__Group_0__0");
					put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
					put(grammarAccess.getUnityObjectAccess().getGroup(), "rule__UnityObject__Group__0");
					put(grammarAccess.getOverrideActionAccess().getGroup(), "rule__OverrideAction__Group__0");
					put(grammarAccess.getConfigAssignmentAccess().getGroup(), "rule__ConfigAssignment__Group__0");
					put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
					put(grammarAccess.getENVAccess().getGroup(), "rule__ENV__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getChannelAccess().getGroup(), "rule__Channel__Group__0");
					put(grammarAccess.getChannelAccess().getGroup_2(), "rule__Channel__Group_2__0");
					put(grammarAccess.getChannelAccess().getGroup_3(), "rule__Channel__Group_3__0");
					put(grammarAccess.getChannelAccess().getGroup_5_1(), "rule__Channel__Group_5_1__0");
					put(grammarAccess.getChannelAccess().getGroup_7(), "rule__Channel__Group_7__0");
					put(grammarAccess.getInitAccess().getGroup(), "rule__Init__Group__0");
					put(grammarAccess.getMapAccess().getGroup(), "rule__Map__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getAreaNameAccess().getGroup(), "rule__AreaName__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getIPAccess().getGroup(), "rule__IP__Group__0");
					put(grammarAccess.getAssignAccess().getGroup(), "rule__Assign__Group__0");
					put(grammarAccess.getAssignAccess().getGroup_1(), "rule__Assign__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup(), "rule__ComparisonOperators__Group__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1(), "rule__ComparisonOperators__Group_1__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0(), "rule__ComparisonOperators__Group_1_0__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_0(), "rule__ComparisonOperators__Group_1_0_0_0__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_1(), "rule__ComparisonOperators__Group_1_0_0_1__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_2(), "rule__ComparisonOperators__Group_1_0_0_2__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_3(), "rule__ComparisonOperators__Group_1_0_0_3__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_4(), "rule__ComparisonOperators__Group_1_0_0_4__0");
					put(grammarAccess.getComparisonOperatorsAccess().getGroup_1_0_0_5(), "rule__ComparisonOperators__Group_1_0_0_5__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0(), "rule__Addition__Group_1_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0_0(), "rule__Addition__Group_1_0_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0_1(), "rule__Addition__Group_1_0_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0(), "rule__Multiplication__Group_1_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0_0(), "rule__Multiplication__Group_1_0_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0_1(), "rule__Multiplication__Group_1_0_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0_2(), "rule__Multiplication__Group_1_0_0_2__0");
					put(grammarAccess.getUnaryAccess().getGroup_1(), "rule__Unary__Group_1__0");
					put(grammarAccess.getNotBooleanExpressionAccess().getGroup(), "rule__NotBooleanExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getIntLiteralAccess().getGroup(), "rule__IntLiteral__Group__0");
					put(grammarAccess.getBoolLiteralAccess().getGroup(), "rule__BoolLiteral__Group__0");
					put(grammarAccess.getStLiteralAccess().getGroup(), "rule__StLiteral__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSpecificationAccess().getSpecAssignment(), "rule__Specification__SpecAssignment");
					put(grammarAccess.getMetaObjectAccess().getNameAssignment_1(), "rule__MetaObject__NameAssignment_1");
					put(grammarAccess.getMetaObjectAccess().getKindAssignment_3(), "rule__MetaObject__KindAssignment_3");
					put(grammarAccess.getMetaObjectAccess().getPropertiesAssignment_5_0(), "rule__MetaObject__PropertiesAssignment_5_0");
					put(grammarAccess.getMetaObjectAccess().getActionsAssignment_5_1(), "rule__MetaObject__ActionsAssignment_5_1");
					put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
					put(grammarAccess.getActionAccess().getPayloadAssignment_3(), "rule__Action__PayloadAssignment_3");
					put(grammarAccess.getActionAccess().getReturnPayloadAssignment_5_2(), "rule__Action__ReturnPayloadAssignment_5_2");
					put(grammarAccess.getActionAccess().getExpressionsAssignment_7(), "rule__Action__ExpressionsAssignment_7");
					put(grammarAccess.getPayloadAccess().getParamsAssignment_0(), "rule__Payload__ParamsAssignment_0");
					put(grammarAccess.getPayloadAccess().getParamsAssignment_1_1(), "rule__Payload__ParamsAssignment_1_1");
					put(grammarAccess.getParamAccess().getNameAssignment_0(), "rule__Param__NameAssignment_0");
					put(grammarAccess.getParamAccess().getTypeAssignment_2(), "rule__Param__TypeAssignment_2");
					put(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2(), "rule__DotExpression__TailAssignment_1_2");
					put(grammarAccess.getSingleRefAccess().getSingleRefAssignment_1(), "rule__SingleRef__SingleRefAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getPropertyTypeAssignment_3(), "rule__Attribute__PropertyTypeAssignment_3");
					put(grammarAccess.getAttributeAccess().getRangeAssignment_4_1(), "rule__Attribute__RangeAssignment_4_1");
					put(grammarAccess.getVarTypeAccess().getNameAssignment(), "rule__VarType__NameAssignment");
					put(grammarAccess.getRangeAccess().getFromAssignment_1(), "rule__Range__FromAssignment_1");
					put(grammarAccess.getRangeAccess().getToAssignment_3(), "rule__Range__ToAssignment_3");
					put(grammarAccess.getValueAccess().getMinuesAssignment_0_0(), "rule__Value__MinuesAssignment_0_0");
					put(grammarAccess.getValueAccess().getValueAssignment_0_1(), "rule__Value__ValueAssignment_0_1");
					put(grammarAccess.getValueAccess().getFixedPointValueAssignment_1(), "rule__Value__FixedPointValueAssignment_1");
					put(grammarAccess.getRealLiteralAccess().getIntPartAssignment_0(), "rule__RealLiteral__IntPartAssignment_0");
					put(grammarAccess.getRealLiteralAccess().getDecimalPartAssignment_2(), "rule__RealLiteral__DecimalPartAssignment_2");
					put(grammarAccess.getUnityObjectAccess().getNameAssignment_1(), "rule__UnityObject__NameAssignment_1");
					put(grammarAccess.getUnityObjectAccess().getTypeAssignment_3(), "rule__UnityObject__TypeAssignment_3");
					put(grammarAccess.getUnityObjectAccess().getConfigurationsAssignment_5_0(), "rule__UnityObject__ConfigurationsAssignment_5_0");
					put(grammarAccess.getUnityObjectAccess().getNewActionsAssignment_5_1(), "rule__UnityObject__NewActionsAssignment_5_1");
					put(grammarAccess.getUnityObjectAccess().getOverrideActionsAssignment_5_2(), "rule__UnityObject__OverrideActionsAssignment_5_2");
					put(grammarAccess.getUnityObjectAccess().getPropertiesAssignment_5_3(), "rule__UnityObject__PropertiesAssignment_5_3");
					put(grammarAccess.getOverrideActionAccess().getActionNameAssignment_1(), "rule__OverrideAction__ActionNameAssignment_1");
					put(grammarAccess.getOverrideActionAccess().getExpressionsAssignment_3(), "rule__OverrideAction__ExpressionsAssignment_3");
					put(grammarAccess.getConfigAssignmentAccess().getConfigsAssignment_3(), "rule__ConfigAssignment__ConfigsAssignment_3");
					put(grammarAccess.getConfigAccess().getPropertyNameAssignment_0(), "rule__Config__PropertyNameAssignment_0");
					put(grammarAccess.getConfigAccess().getPropertyValueAssignment_2(), "rule__Config__PropertyValueAssignment_2");
					put(grammarAccess.getENVAccess().getNameAssignment_1(), "rule__ENV__NameAssignment_1");
					put(grammarAccess.getENVAccess().getChannelsAssignment_3_0(), "rule__ENV__ChannelsAssignment_3_0");
					put(grammarAccess.getENVAccess().getMapsAssignment_3_1(), "rule__ENV__MapsAssignment_3_1");
					put(grammarAccess.getENVAccess().getInstancesAssignment_3_2(), "rule__ENV__InstancesAssignment_3_2");
					put(grammarAccess.getENVAccess().getPropertiesAssignment_3_3(), "rule__ENV__PropertiesAssignment_3_3");
					put(grammarAccess.getENVAccess().getInitCodesAssignment_4(), "rule__ENV__InitCodesAssignment_4");
					put(grammarAccess.getInstanceAccess().getNameAssignment_1(), "rule__Instance__NameAssignment_1");
					put(grammarAccess.getInstanceAccess().getInstanceTypeAssignment_3(), "rule__Instance__InstanceTypeAssignment_3");
					put(grammarAccess.getChannelAccess().getNameAssignment_1(), "rule__Channel__NameAssignment_1");
					put(grammarAccess.getChannelAccess().getDirectionAssignment_2_1(), "rule__Channel__DirectionAssignment_2_1");
					put(grammarAccess.getChannelAccess().getTypeAssignment_3_1(), "rule__Channel__TypeAssignment_3_1");
					put(grammarAccess.getChannelAccess().getPortAssignment_5_0(), "rule__Channel__PortAssignment_5_0");
					put(grammarAccess.getChannelAccess().getAreanameAssignment_5_1_0(), "rule__Channel__AreanameAssignment_5_1_0");
					put(grammarAccess.getChannelAccess().getQnameAssignment_5_1_2(), "rule__Channel__QnameAssignment_5_1_2");
					put(grammarAccess.getChannelAccess().getBoundInstancesAssignment_7_1(), "rule__Channel__BoundInstancesAssignment_7_1");
					put(grammarAccess.getInitAccess().getExpressionsAssignment_2(), "rule__Init__ExpressionsAssignment_2");
					put(grammarAccess.getMapAccess().getMapNameAssignment_2(), "rule__Map__MapNameAssignment_2");
					put(grammarAccess.getMapAccess().getPathNameAssignment_4(), "rule__Map__PathNameAssignment_4");
					put(grammarAccess.getMessageAccess().getNameAssignment_2(), "rule__Message__NameAssignment_2");
					put(grammarAccess.getMessageAccess().getContentAssignment_5(), "rule__Message__ContentAssignment_5");
					put(grammarAccess.getQNameAccess().getNameAssignment_2(), "rule__QName__NameAssignment_2");
					put(grammarAccess.getAreaNameAccess().getNameAssignment_2(), "rule__AreaName__NameAssignment_2");
					put(grammarAccess.getPortAccess().getPortnumberAssignment_2(), "rule__Port__PortnumberAssignment_2");
					put(grammarAccess.getIPAccess().getIpAddrAssignment_2(), "rule__IP__IpAddrAssignment_2");
					put(grammarAccess.getInterfaceTypeAccess().getNameAssignment(), "rule__InterfaceType__NameAssignment");
					put(grammarAccess.getAssignAccess().getRightAssignment_1_2(), "rule__Assign__RightAssignment_1_2");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getComparisonOperatorsAccess().getRestAssignment_1_1(), "rule__ComparisonOperators__RestAssignment_1_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getUnaryAccess().getExpAssignment_1_2(), "rule__Unary__ExpAssignment_1_2");
					put(grammarAccess.getNotBooleanExpressionAccess().getExpAssignment_1(), "rule__NotBooleanExpression__ExpAssignment_1");
					put(grammarAccess.getIntLiteralAccess().getIntAssignment_1(), "rule__IntLiteral__IntAssignment_1");
					put(grammarAccess.getBoolLiteralAccess().getBoolAssignment_1(), "rule__BoolLiteral__BoolAssignment_1");
					put(grammarAccess.getStLiteralAccess().getStringAssignment_1(), "rule__StLiteral__StringAssignment_1");
					put(grammarAccess.getIdentifierAccess().getRefrenceAssignment(), "rule__Identifier__RefrenceAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UnityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UnityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
