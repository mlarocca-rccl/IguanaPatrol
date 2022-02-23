/**
 This is a flat package that will includes some classes
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
 * This will essentially be a class of Static methods that you can 
 * use to test anything in your own classes. I will be adding more
 * features to this as time goes on.
 * 
 * @author asengupt (Arijit Sengupta - FIU)
 *
 */
public class SelfCheckUtils {
	

	/**
	 * Super simple random check utility - simply calls a random function
	 * and returns true for half the cases, and false for half.
	 * 
	 * To call this, you can simply do a 
	 * 
	 * return SelfCheckUtils.randomCheck();
	 * 
	 * @return true for half the cases, false otherwise
	 */
	public static boolean randomCheck() {
		return randomCheck(0.5); 
	}
	
	/**
	 * Another check utility - simply calls a random function
	 * and returns true for half the cases, and false for half.
	 * 
	 * To call this, you can simply do a 
	 * return SelfCheckUtils.randomCheck(0.25); // 25% chance of failure
	 * 
	 * @param failprobability - the probability of a failure - send as a 
	 * value between 0 and 1. 1 means 100% probability of failure, 
	 * 0 means it will always be successful.
	 * @return true for half the cases, false otherwise
	 */
	public static boolean randomCheck(double failprobability) {
		return Math.random() > failprobability; 
	}
	
}
