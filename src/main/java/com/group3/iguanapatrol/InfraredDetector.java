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
public class InfraredDetector implements SelfCheckCapable {

	private String passiveInfraredSensor;
	private int resolution;
	private int lightIntensity;
	private int chargeState;
	private String motionDetection;
	
	public void pairHun() {
		//
	}
	
	public void detectMotion() {
		//
	}
	
	public void captureObject() {
		//
	}
	
	public void captureHeatPattern() {
		//
	}
	
	public void sendHubInraredReading() {
		//
	}
	
	public void sendLowBattery() {
		//
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Infrared Detector";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
