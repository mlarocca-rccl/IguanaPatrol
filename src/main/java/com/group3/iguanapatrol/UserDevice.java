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
public class UserDevice implements SelfCheckCapable {

	private String operatingSystem;
	private String appVersion;
	
	public void viewLiveFeed() {
		//
	}
	
	public void alertNotification() {
		//
	}
	
	public void changeSecurityMode() {
		//
	}
	
	public void requestSoftwareUpdate() {
		//
	}
	
	public void requestFirmwareUpdate() {
		//
	}
	
	public void manualAlarmActivation() {
		//
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "User's Mobile Device";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
}
