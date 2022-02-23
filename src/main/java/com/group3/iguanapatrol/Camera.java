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
public class Camera implements SelfCheckCapable {
	private String wideAngleLens;
	private int resolution;
	private int lookAngle;
	private String motionDetection;
	
	public void pairHub() {
		//
	}
	
	public void takePicture() {
		//
	}
	
	public void recordVideo() {
		//
	}
	
	public void detectMotion() {
		//
	}
	
	public void captureObject() {
		//	
	}
	
	public void objectMapping() {
		
	}

	public void sendHubBiometrics() {
		//
	}

	public void alertLowBattery() {
		// send alert to hub that device battery is running low
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Motion Detector Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
}
