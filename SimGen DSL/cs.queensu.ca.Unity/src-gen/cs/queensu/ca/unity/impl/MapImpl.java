/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Map;
import cs.queensu.ca.unity.StLiteral;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.MapImpl#getMapName <em>Map Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.MapImpl#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map
{
  /**
   * The default value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapName()
   * @generated
   * @ordered
   */
  protected static final String MAP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapName()
   * @generated
   * @ordered
   */
  protected String mapName = MAP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPathName() <em>Path Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathName()
   * @generated
   * @ordered
   */
  protected StLiteral pathName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapImpl()
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
    return UnityPackage.Literals.MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMapName()
  {
    return mapName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapName(String newMapName)
  {
    String oldMapName = mapName;
    mapName = newMapName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.MAP__MAP_NAME, oldMapName, mapName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLiteral getPathName()
  {
    return pathName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPathName(StLiteral newPathName, NotificationChain msgs)
  {
    StLiteral oldPathName = pathName;
    pathName = newPathName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.MAP__PATH_NAME, oldPathName, newPathName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathName(StLiteral newPathName)
  {
    if (newPathName != pathName)
    {
      NotificationChain msgs = null;
      if (pathName != null)
        msgs = ((InternalEObject)pathName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.MAP__PATH_NAME, null, msgs);
      if (newPathName != null)
        msgs = ((InternalEObject)newPathName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.MAP__PATH_NAME, null, msgs);
      msgs = basicSetPathName(newPathName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.MAP__PATH_NAME, newPathName, newPathName));
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
      case UnityPackage.MAP__PATH_NAME:
        return basicSetPathName(null, msgs);
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
      case UnityPackage.MAP__MAP_NAME:
        return getMapName();
      case UnityPackage.MAP__PATH_NAME:
        return getPathName();
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
      case UnityPackage.MAP__MAP_NAME:
        setMapName((String)newValue);
        return;
      case UnityPackage.MAP__PATH_NAME:
        setPathName((StLiteral)newValue);
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
      case UnityPackage.MAP__MAP_NAME:
        setMapName(MAP_NAME_EDEFAULT);
        return;
      case UnityPackage.MAP__PATH_NAME:
        setPathName((StLiteral)null);
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
      case UnityPackage.MAP__MAP_NAME:
        return MAP_NAME_EDEFAULT == null ? mapName != null : !MAP_NAME_EDEFAULT.equals(mapName);
      case UnityPackage.MAP__PATH_NAME:
        return pathName != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mapName: ");
    result.append(mapName);
    result.append(')');
    return result.toString();
  }

} //MapImpl
