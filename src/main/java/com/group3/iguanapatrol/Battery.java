/**
 * 
 */
package com.group3.iguanapatrol;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Michael La Rocca
 *
 */
public class Battery implements SelfCheckCapable {

	private String type;
	private String capacity;
	
	public void charge() {
		//
	}
	
	public void supplyPower() {
		//
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Device Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
