/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Join</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getJoin()
 * @model
 * @generated
 */
public enum Join implements Enumerator
{
  /**
   * The '<em><b>Left join</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_JOIN_VALUE
   * @generated
   * @ordered
   */
  LEFT_JOIN(0, "left_join", "left_join"),

  /**
   * The '<em><b>Right join</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_JOIN_VALUE
   * @generated
   * @ordered
   */
  RIGHT_JOIN(1, "right_join", "right_join"),

  /**
   * The '<em><b>Full join</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULL_JOIN_VALUE
   * @generated
   * @ordered
   */
  FULL_JOIN(2, "full_join", "full_join"),

  /**
   * The '<em><b>Inner join</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INNER_JOIN_VALUE
   * @generated
   * @ordered
   */
  INNER_JOIN(3, "inner_join", "inner_join");

  /**
   * The '<em><b>Left join</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_JOIN
   * @model name="left_join"
   * @generated
   * @ordered
   */
  public static final int LEFT_JOIN_VALUE = 0;

  /**
   * The '<em><b>Right join</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_JOIN
   * @model name="right_join"
   * @generated
   * @ordered
   */
  public static final int RIGHT_JOIN_VALUE = 1;

  /**
   * The '<em><b>Full join</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULL_JOIN
   * @model name="full_join"
   * @generated
   * @ordered
   */
  public static final int FULL_JOIN_VALUE = 2;

  /**
   * The '<em><b>Inner join</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INNER_JOIN
   * @model name="inner_join"
   * @generated
   * @ordered
   */
  public static final int INNER_JOIN_VALUE = 3;

  /**
   * An array of all the '<em><b>Join</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Join[] VALUES_ARRAY =
    new Join[]
    {
      LEFT_JOIN,
      RIGHT_JOIN,
      FULL_JOIN,
      INNER_JOIN,
    };

  /**
   * A public read-only list of all the '<em><b>Join</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Join> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Join</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Join get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Join result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Join</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Join getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Join result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Join</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Join get(int value)
  {
    switch (value)
    {
      case LEFT_JOIN_VALUE: return LEFT_JOIN;
      case RIGHT_JOIN_VALUE: return RIGHT_JOIN;
      case FULL_JOIN_VALUE: return FULL_JOIN;
      case INNER_JOIN_VALUE: return INNER_JOIN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Join(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Join