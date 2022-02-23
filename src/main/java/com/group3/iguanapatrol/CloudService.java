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
public class CloudService implements SelfCheckCapable {

	private String serviceProvider;
	private String SaaS;
	
	public void establishRemoteConnection() {
		//
	}
	
	public void sendCloudIguanaBiometricUpdate() {
		//
	}

	public void sendFirmwareUpdate() {
		//
	}
	
	public void sendSoftwareUpdate() {
		//
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Iguana Patrol Cloud Service";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
}
