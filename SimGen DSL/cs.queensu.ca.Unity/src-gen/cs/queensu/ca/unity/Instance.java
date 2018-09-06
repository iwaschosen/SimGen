/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Instance#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Instance#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cs.queensu.ca.unity.UnityPackage#getInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instance Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Type</em>' reference.
   * @see #setInstanceType(UnityObject)
   * @see cs.queensu.ca.unity.UnityPackage#getInstance_InstanceType()
   * @model
   * @generated
   */
  UnityObject getInstanceType();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Instance#getInstanceType <em>Instance Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Type</em>' reference.
   * @see #getInstanceType()
   * @generated
   */
  void setInstanceType(UnityObject value);

} // Instance
