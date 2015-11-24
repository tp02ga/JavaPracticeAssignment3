package net.javavideotutorials.assignment3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import net.javavideotutorials.assignment3.component.Component;

public class AssemblyLine implements Runnable
{
  private Queue<Component> neededPartsQueue = new LinkedList<Component>();
  protected List<Component> componentsBeingBuilt = new ArrayList<Component>();
  private List<Car> carsBuilt = new ArrayList<Car>();
  public boolean assemblyLineWorking = false;
  
  /**
   * This method should return the single instance of the AssemblyLine object.
   * @return the Singleton instance of the <code>AssemblyLine</code> object
   */
  public static AssemblyLine getInstance()
  {
    return null;
  }
  
  /**
   * This method should be used to start the process of building a car.  Remember that
   * each new Car should be built on a new Thread.
   */
  public void buildCar()
  {
  }
  
  /**
   * This method is used to start building a Component.  If the assembly line has room
   * to build a <code>Component</code>, then construction can start immediately, if the assembly line
   * is already at maximum capacity (3 <code>Components</code>), then this <code>Component</code> should be placed
   * on the <code>neededPartsQueue</code>. 
   * @param component to be built
   */
  public void addComponentToBeBuilt(Component component)
  {
  }

  /**
   * This method should remove the completed component from the ArrayList
   * of components being built.  It should also pull the next component to 
   * be built from the Queue of parts that are waiting to be built.  If there
   * are no more Components to build, then the assembly line should be marked
   * as no longer working.
   * @param component to remove from assembly line
   */
  public void notifyComponentDoneAssembly(Component component) 
  {
  }


  /**
   * This method should return a list of all successfully built cars
   * @return list of all cars built
   */
  public List<Car> getCarsBuilt() 
  {
    return null;
  }

  public void setCarsBuilt(List<Car> carsBuilt) 
  {
    this.carsBuilt = carsBuilt;
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    
  }
  
}
