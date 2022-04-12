/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Update#getModification <em>Modification</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.Update#getUpdatecondition <em>Updatecondition</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getUpdate()
 * @model
 * @generated
 */
public interface Update extends ManipulateStatement
{
  /**
   * Returns the value of the '<em><b>Modification</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group19.easySql.easySql.Equation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modification</em>' containment reference list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getUpdate_Modification()
   * @model containment="true"
   * @generated
   */
  EList<Equation> getModification();

  /**
   * Returns the value of the '<em><b>Updatecondition</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.group19.easySql.easySql.Equation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updatecondition</em>' containment reference list.
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getUpdate_Updatecondition()
   * @model containment="true"
   * @generated
   */
  EList<Equation> getUpdatecondition();

} // Update