/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Identifier;
import cs.queensu.ca.unity.Ref;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.IdentifierImpl#getRefrence <em>Refrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierImpl extends ExpressionImpl implements Identifier
{
  /**
   * The cached value of the '{@link #getRefrence() <em>Refrence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefrence()
   * @generated
   * @ordered
   */
  protected Ref refrence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifierImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnityPackage.Literals.IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref getRefrence()
  {
    return refrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefrence(Ref newRefrence, NotificationChain msgs)
  {
    Ref oldRefrence = refrence;
    refrence = newRefrence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.IDENTIFIER__REFRENCE, oldRefrence, newRefrence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefrence(Ref newRefrence)
  {
    if (newRefrence != refrence)
    {
      NotificationChain msgs = null;
      if (refrence != null)
        msgs = ((InternalEObject)refrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.IDENTIFIER__REFRENCE, null, msgs);
      if (newRefrence != null)
        msgs = ((InternalEObject)newRefrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.IDENTIFIER__REFRENCE, null, msgs);
      msgs = basicSetRefrence(newRefrence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.IDENTIFIER__REFRENCE, newRefrence, newRefrence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UnityPackage.IDENTIFIER__REFRENCE:
        return basicSetRefrence(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnityPackage.IDENTIFIER__REFRENCE:
        return getRefrence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnityPackage.IDENTIFIER__REFRENCE:
        setRefrence((Ref)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.IDENTIFIER__REFRENCE:
        setRefrence((Ref)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.IDENTIFIER__REFRENCE:
        return refrence != null;
    }
    return super.eIsSet(featureID);
  }

} //IdentifierImpl
