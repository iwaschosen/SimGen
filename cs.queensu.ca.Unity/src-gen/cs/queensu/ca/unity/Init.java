/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Init#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getInit()
 * @model
 * @generated
 */
public interface Init extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link cs.queensu.ca.unity.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see cs.queensu.ca.unity.UnityPackage#getInit_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Init
