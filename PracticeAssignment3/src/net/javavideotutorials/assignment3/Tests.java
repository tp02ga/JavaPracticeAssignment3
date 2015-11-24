package net.javavideotutorials.assignment3;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.javavideotutorials.assignment3.component.Component;
import net.javavideotutorials.assignment3.component.Engine;
import net.javavideotutorials.assignment3.component.Frame;
import net.javavideotutorials.assignment3.component.Seat;
import net.javavideotutorials.assignment3.component.Tire;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * I have commented out a bunch of tests in this file as they take
 * a little while to run.  Once you have all current tests passing, uncomment
 * the last bunch one by one and test each.  Once all pass, you should be
 * done this assignment!
 * @author Trevor Page
 *
 */
public class Tests 
{
  AssemblyLine assemblyLine = AssemblyLine.getInstance();
  
  @Before
  public void init()
  {
    assemblyLine.setCarsBuilt(new ArrayList<Car>());
  }
  
  @Test
  public void test_assembly_line_constructor () throws NoSuchMethodException, SecurityException
  {
    Constructor<AssemblyLine> constructor = AssemblyLine.class.getDeclaredConstructor();
    
    assertThat("Remember, the AssemblyLine should be a Singleton.", constructor.getModifiers(), is(Modifier.PRIVATE));
  }
  
  @Test
  public void test_engine_component ()
  {
    Component engine = new Engine();
    assertThat(engine.getComponentType(), is("Engine"));
  }
  
  @Test
  public void test_frame_component ()
  {
    Component frame = new Frame();
    assertThat(frame.getComponentType(), is("Frame"));
  }
  
  @Test
  public void test_tire_component ()
  {
    Component tire = new Tire();
    assertThat(tire.getComponentType(), is("Tire"));
  }
  
  @Test
  public void test_seat_component ()
  {
    Component seat = new Seat();
    assertThat(seat.getComponentType(), is("Seat"));
  }

  /**
   * Uncomment the tests below once all tests above are passing... these
   * tests are commented out because they take a while to run, and it's
   * annoying to have them running every time when you're just setting up
   * your code.
   * @throws InterruptedException 
   */
  
//  @Test
//  public void test_engine_completion_time () throws InterruptedException
//  {
//    // we need to wait for the assembly line to finish working
//    // from all tests above
//    while (assemblyLine.assemblyLineWorking)
//    {
//      Thread.sleep(1000);
//    }
//    Date start = new Date();
//    Date end = null; 
//    Component component = new Engine();
//    while (!component.isBuilt())
//    {
//      Thread.sleep(100);
//      end = new Date();
//      if (end.getTime()-start.getTime() > 7900L)
//        Assert.fail(component.getComponentType() + " was not built in the proper amount of time");
//    }
//    
//    long timeItTookToBuild = end.getTime() - start.getTime();
//    assertTrue(component.getComponentType() + " was not built in the proper amount of time", 7000L <= timeItTookToBuild && timeItTookToBuild <= 7999L);
//    
//  }
//  
//  @Test
//  public void test_frame_completion_time () throws InterruptedException
//  {
//    Date start = new Date();
//    Date end = null; 
//    Component component = new Frame();
//    while (!component.isBuilt())
//    {
//      Thread.sleep(100);
//      end = new Date();
//      if (end.getTime()-start.getTime() > 5900L)
//        Assert.fail(component.getComponentType() + " was not built in the proper amount of time");
//    }
//    
//    long timeItTookToBuild = end.getTime() - start.getTime();
//    assertTrue(component.getComponentType() + " was not built in the proper amount of time", 5000L <= timeItTookToBuild && timeItTookToBuild <= 5999L);
//    
//  }
//  
//  @Test
//  public void test_seat_completion_time () throws InterruptedException
//  {
//    Date start = new Date();
//    Date end = null; 
//    Component component = new Seat();
//    while (!component.isBuilt())
//    {
//      Thread.sleep(100);
//      end = new Date();
//      if (end.getTime()-start.getTime() > 3900L)
//        Assert.fail(component.getComponentType() + " was not built in the proper amount of time");
//    }
//    
//    long timeItTookToBuild = end.getTime() - start.getTime();
//    assertTrue(component.getComponentType() + " was not built in the proper amount of time", 3000L <= timeItTookToBuild && timeItTookToBuild <= 3999L);
//    
//  }
//  
//  @Test
//  public void test_tire_completion_time () throws InterruptedException
//  {
//    Date start = new Date();
//    Date end = null; 
//    Component component = new Tire();
//    while (!component.isBuilt())
//    {
//      Thread.sleep(100);
//      end = new Date();
//      if (end.getTime()-start.getTime() > 2900L)
//        Assert.fail(component.getComponentType() + " was not built in the proper amount of time");
//    }
//    
//    long timeItTookToBuild = end.getTime() - start.getTime();
//    assertTrue(component.getComponentType() + " was not built in the proper amount of time", 2000L <= timeItTookToBuild && timeItTookToBuild <= 2999L);
//    
//  }
//  
//  @Test
//  public void should_build_one_car() 
//  {
//    Date start = new Date();
//    assemblyLine.buildCar();
//    
//    int maxSize = 0;
//    while (assemblyLine.assemblyLineWorking)
//    {
//      try {
//        int size = assemblyLine.componentsBeingBuilt.size();
//        if (size > maxSize)
//          maxSize = size;
//        Thread.sleep(100);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
//    Date end = new Date();
//    long difference = end.getTime() - start.getTime();
//    System.out.println("It took " + difference + " milliseconds to build the car");
//
//    List<Car> carsBuilt = assemblyLine.getCarsBuilt();
//    
//    assertTrue(carsBuilt.size() == 1);
//    assertTrue(carsBuilt.get(0).isBuilt());
//    assertThat(maxSize, is(3));
//  }
  
//  @Test
//  public void should_build_10_cars ()
//  {
//    Date start = new Date();
//    
//    for (int i=0; i<10; i++)
//      assemblyLine.buildCar();
//    
//    int maxSize = 0;
//    while (assemblyLine.assemblyLineWorking)
//    {
//      try {
//        int size = assemblyLine.componentsBeingBuilt.size();
//        if (size > maxSize)
//          maxSize = size;
//        Thread.sleep(100);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
//
//    Date end = new Date();
//    
//    long difference = end.getTime() - start.getTime();
//    System.out.println("It took " + difference + " milliseconds to build the cars");
//    List<Car> carsBuilt = assemblyLine.getCarsBuilt();
//    
//    assertThat(carsBuilt.size(), is(10));
//    for (int i=0; i<10; i++)
//      assertThat(carsBuilt.get(i).isBuilt(), is(true));
//    
//    assertThat(maxSize, is(3));
//  }
}
