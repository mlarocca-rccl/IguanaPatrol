/**
 * 
 */
package edu.fiu.jit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.group3.iguanapatrol.IguanaPatrolHub;

/**
 * A JUnit Test class that checks to ensure that all your
 * components can be self-checked. 
 * 
 * @author asengupt
 *
 */
public class SelfCheckTester {
	
	/**
	 * Update this test case and change the first line in the 
	 * test below to create an instance of your Main class.
	 */
	@Test
	public void test() {
		// Change the following line after "new"
		// To create an instance of YOUR main class
		GenericComponent testTarget = new IguanaPatrolHub();
		assertNotEquals(testTarget.getComponentName(), "Template main component");
		try {
			assertTrue(checkComponents(testTarget, testTarget.getSubComponents()));			
		} catch(Exception e){
			fail(e.getLocalizedMessage());
		}
	}

	
	/** reset color */ public static final String ANSI_RESET = "\u001B[0m"; 
	/** ANSI black */ public static final String ANSI_BLACK = "\u001B[30m"; 
	/** ANSI red */ public static final String ANSI_RED = "\u001B[31m"; 
	/** ANSI green */ public static final String ANSI_GREEN = "\u001B[32m"; 
	/** ANSI yellow */ public static final String ANSI_YELLOW = "\u001B[33m"; 
	/** ANSI blue */ public static final String ANSI_BLUE = "\u001B[34m"; 
	/** ANSI purple */ public static final String ANSI_PURPLE = "\u001B[35m";
	/** ANSI cyan */ public static final String ANSI_CYAN = "\u001B[36m"; 
	/** ANSI white */ public static final String ANSI_WHITE = "\u001B[37m"; 

	/**
	 * Runs a self-check and pretty-print the result of the check.
	 * Note that the colors may not show correctly in some terminals.
	 * 
	 * DO NOT USE THIS AS THE ACTUAL SELF-CHECK method! 
	 * This will call self-check method
	 * of the item passed in, so if you call it from the self-check method
	 * you will end up creating an infinite recursion!
	 * 
	 * @param item the item to be tested
	 * @return the colorized version of the run. Colors may not show in all terminals
	 */
	public static boolean basicSelfCheckRunner(SelfCheckCapable item) {
		boolean result = item.selfCheck();
		System.out.println("Checking " + item.getComponentName() + "... " + prettify(result));
		return result;
	}

	/**
	 * This tester tests all componets that are provided as parameters.
	 * If any component is implemented as a GenericComponent, its subcomponents
	 * are also tested. Note that the count will only reflect the top-level
	 * components for the time being.
	 * 
	 * SelfCheckUtils.checkComponents(wheels, sensors, camera);
	 * 
	 * @param items A comma separated list of items - can be any object, but
	 * only those that implement SelfCheckCapable will be tested.
	 * Supports Arrays of SelfCheckCapable objects
	 * Supports Lists of SelfCheckCapable objects
	 * @return a single boolean result telling you if the final test was successful
	 */
	public static boolean checkComponents(Object ...items) {
		int count = 0;
		boolean result = true;
		for (Object i:items) {
			if (i instanceof SelfCheckCapable) {
				count++;
				result &= basicSelfCheckRunner((SelfCheckCapable)i);
			} else if (i instanceof List) {
				for (Object l:(List<?>)i) {
					if (l instanceof SelfCheckCapable) {
						count++;
						result &= basicSelfCheckRunner((SelfCheckCapable)l);
						if (l instanceof GenericComponent) {
							List<SelfCheckCapable> comps = ((GenericComponent)l).getSubComponents();
							result &= checkComponents(comps);
						}
					}
				}
			} else if (i instanceof Object[]) {
				for (Object l:(Object[])i) {
					if (l instanceof SelfCheckCapable) {
						count++;
						result &= basicSelfCheckRunner((SelfCheckCapable)l);
						if (l instanceof GenericComponent) {
							List<SelfCheckCapable> comps = ((GenericComponent)l).getSubComponents();
							result &= checkComponents(comps);
						}
					}
				}				
			}
		}
		System.out.println("Tested " + count + " components... " + prettify(count > 0 && result));
		return (count > 0 && result);
	}
	
	
	/**
	 * An internal method to "prettify" the test result
	 * If the test result is false, a red FAILED string is returned
	 * If the test result is true, a green check ok string is returned
	 * If terminal is not set, no colors are applied.
	 * @param result the result of the self-check
	 * @return prettified string (check ok / FAILED)
	 */
	private static String prettify(boolean result) {
		if (System.console() != null && System.getenv().get("TERM") != null) {
			return ( result ? ANSI_GREEN + "check ok" + ANSI_RESET
							: ANSI_RED + "FAILED!" + ANSI_RESET);
		} else return (result ? "check ok" : "FAILED!");
	}
	
}
