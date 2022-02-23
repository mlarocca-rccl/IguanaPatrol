/**
 * This is a flat package that will includes some classes
 * and interfaces for the Systems Analysis and Design class
 * that anyone can build on.
 * 
 * To use classes/interfaces in this package, you may want to
 * do an
 * 
 * import edu.fiu.sysdesign.*;
 * 
 * At the top of your class.
 */
package edu.fiu.jit;

/**
 * The SelfCheckCapable Interface - creates some basic
 * necessitites for testing - any class that you would like to 
 * test can implement this interface and needs to override two
 * simple methods (see below)
 * 
 * @author asengupt (Arijit Sengupta - FIU)
 *
 */
public interface SelfCheckCapable {
	
	/**
	 * This should be pretty typical for most objects that should include
	 * a getComponentName method that the testers will use. 
	 * 
	 * @return a String representation of the name of the object being tested
	 */
	public String getComponentName();
	
	/**
	 * Any object that is self-check capable must implement this method to 
	 * check itself. Please note that this is only for checking this class only.
	 * You can either implement SelfCheckCapable and take care of testing the
	 * subcomponents yourself here, or implement GenericComponent and implement
	 * the additional method there for testing internal components.
	 * 
	 * @see SelfCheckUtils#randomCheck() for a simple random check function, 
	 * as well as to apply checks on a list of items as needed.
	 * 
	 * @return true if the self-check was successful, false otherwise.
	 */
	public boolean selfCheck();
	
}
