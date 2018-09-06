/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Param#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends Property
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(VarType)
   * @see cs.queensu.ca.unity.UnityPackage#getParam_Type()
   * @model containment="true"
   * @generated
   */
  VarType getType();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Param#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(VarType value);

} // Param
