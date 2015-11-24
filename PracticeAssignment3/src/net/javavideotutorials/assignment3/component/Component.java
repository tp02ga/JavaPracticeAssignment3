package net.javavideotutorials.assignment3.component;

/**
 * This interface defines the contract of a Component.  A Component, in
 * this case, is a part of a Car that will be built.  A Component can
 * be either an Engine, a Frame, a Tire or a Seat. 
 * @author Trevor Page
 *
 */
public interface Component 
{
  /**
   * This method will build the specific Component. Be sure to use
   * a Thread.sleep() method that pauses for the appropriate amount
   * of time for each unique Component 
   */
  public void build();
  
  /**
   * This is a simple getter that will return <code>true</code> or <code>false</code> depending on if this
   *  specific Component is done being built.
   * @return <code>true</code> if this Component is done building, <code>false</code> otherwise
   */
  public boolean isBuilt();
  
  /**
   * This method should return a String representation of what
   *  this specific Component is.  For example, if the Component
   *  that implements this interface is an Engine, then this method
   *  should return "Engine".
   * @return
   */
  public String getComponentType();
}
