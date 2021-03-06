package net.openwritings.java.lang;

import java.lang.String;

/**
 * Example of what can be done with javadoc.
 * 
 * This is a longer description that can span into
 * multiple lines.
 * 
 * <ul>
 *  <li>{@literal {@value package.class#variable}} shows the value of a public variable 
 *        but it can't show a private variable.
 *  <li>{@literal {@link package.class#variableOrMethod}} links to the variable or method 
 *        but it can't link a private variable or method.
 * </ul>
 * 
 * @author Xuan Ngo
 * @version 1.0
 */
public class JavaDoc
{
  /** The person is a novice in the field. */
  public static final int NOVICE = 0;
  
  /** The person is an expert in the field. */
  public static final int EXPERT = 1;

  /** If a person has more than 10 years of experience, then that person is an expert. */
  private final int m_iExpertYearsOfExperience = 10;
  
  private String m_sFirstname = "";
  private String m_sLastname = "";
  private int m_iExpertise = 0; // By default, the person is a novice.
  
  /**
   * This is the constructor.
   */
  public JavaDoc()
  {
  }
  
  /**
   * Set the names.
   * @param sFirstname  The first name.
   * @param sLastname   The last name.
   */
  public void setNames(final String sFirstname, final String sLastname)
  {
    this.m_sFirstname = sFirstname;
    this.m_sLastname = sLastname;
  }
  
  /**
   * Get the names of the person.
   * @deprecated Don't use this function. It is not flexible. 
   * Use {@link #getFirstname()} and {@link org.javadoc.tutorial.Person#getLastname() Text linked to getLastname()} instead. 
   * @return Get the names of the person.
   */
  public final String getNames()
  {
    return this.m_sFirstname + " " + this.m_sLastname;
  }
  
  /**
   * Set the number of years of experience.
   * @param iYearsOfExperience Number of years of experience.
   */
  public void setYearsOfExperience(final int iYearsOfExperience)
  {
    if(iYearsOfExperience>this.m_iExpertYearsOfExperience)
    {
      this.m_iExpertise = EXPERT;
    }
    else
    {
      this.m_iExpertise = NOVICE;      
    }
  }
  
  /**
   * Get the level of expertise of this person.
   * @return {@value #EXPERT} if the person is an expert. Otherwise, {@value #NOVICE}.
   */
  public final int getExpertise()
  {
    return this.m_iExpertise;
  }
  
  /**
   * Get the first name
   * @return Get the first name
   */
  public final String getFirstname()
  {
    return this.m_sFirstname;
  }
  
  /**
   * Get the last name.
   * @return Get the last name.
   */
  public final String getLastname()
  {
    return this.m_sLastname;
  }

}
