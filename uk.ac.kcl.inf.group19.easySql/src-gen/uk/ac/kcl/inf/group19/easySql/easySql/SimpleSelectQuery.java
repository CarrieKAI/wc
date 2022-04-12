/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getStable <em>Stable</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getSattributes <em>Sattributes</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getSimplecondition <em>Simplecondition</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getRemoveDup <em>Remove Dup</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getOrdertype <em>Ordertype</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getSCattributes <em>SCattributes</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery()
 * @model
 * @generated
 */
public interface SimpleSelectQuery extends QueryStatement
{
  /**
   * Returns the value of the '<em><b>Stable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stable</em>' reference.
   * @see #setStable(TableDeclaration)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_Stable()
   * @model
   * @generated
   */
  TableDeclaration getStable();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getStable <em>Stable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stable</em>' reference.
   * @see #getStable()
   * @generated
   */
  void setStable(TableDeclaration value);

  /**
   * Returns the value of the '<em><b>Sattributes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group19.easySql.easySql.Value}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sattributes</em>' containment reference list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_Sattributes()
   * @model containment="true"
   * @generated
   */
  EList<Value> getSattributes();

  /**
   * Returns the value of the '<em><b>Simplecondition</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group19.easySql.easySql.Equation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simplecondition</em>' containment reference list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_Simplecondition()
   * @model containment="true"
   * @generated
   */
  EList<Equation> getSimplecondition();

  /**
   * Returns the value of the '<em><b>Remove Dup</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Dup</em>' attribute list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_RemoveDup()
   * @model unique="false"
   * @generated
   */
  EList<String> getRemoveDup();

  /**
   * Returns the value of the '<em><b>Ordertype</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.group19.easySql.easySql.Order}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordertype</em>' attribute.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.Order
   * @see #setOrdertype(Order)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_Ordertype()
   * @model
   * @generated
   */
  Order getOrdertype();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery#getOrdertype <em>Ordertype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordertype</em>' attribute.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.Order
   * @see #getOrdertype()
   * @generated
   */
  void setOrdertype(Order value);

  /**
   * Returns the value of the '<em><b>SCattributes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group19.easySql.easySql.Value}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>SCattributes</em>' containment reference list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getSimpleSelectQuery_SCattributes()
   * @model containment="true"
   * @generated
   */
  EList<Value> getSCattributes();

} // SimpleSelectQuery