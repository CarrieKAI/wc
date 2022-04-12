/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getSeparation <em>Separation</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getEquation_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.group19.easySql.easySql.Operator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.Operator
   * @see #setOperator(Operator)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getEquation_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(MultiType)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getEquation_Value()
   * @model containment="true"
   * @generated
   */
  MultiType getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.Equation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MultiType value);

  /**
   * Returns the value of the '<em><b>Separation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separation</em>' attribute list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getEquation_Separation()
   * @model unique="false"
   * @generated
   */
  EList<String> getSeparation();

} // Equation