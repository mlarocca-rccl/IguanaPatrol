/**
 * 
 */
package com.group3.iguanapatrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Michael La Rocca
 *
 */
public class IguanaPatrolHub implements GenericComponent {


	private String networkInterface;
	private String alexaCompatible;
	private String homekitCompatible;
	private String iFTTT;
	private AlarmSpeaker myAlarm;
	private Battery myBattery;
	private CloudService myCloud;
	private Camera myCamera;
	private InfraredDetector myIR;
	private UserDevice myUserDevice;
	public IguanaPatrolHub() {
		 myAlarm = new AlarmSpeaker();
		 myBattery = new Battery();
		 myCamera = new Camera();
		 myCloud = new CloudService();
		 myIR = new InfraredDetector();
		 myUserDevice= new UserDevice();
	
	}

	public void pairDevice() {
		//
	}
	
	public void connectCloud() {
		//
	}
	
	public void receiveCloudBiometricUpdate() {
		//
	}
	
	public void receiveSoftwareUpdate() {
		//
	}
	
	public void receiveFirmwareUpdate() {
		//
	}
	
	public void updateDeviceFirmware() {
		//
	}
	
	public void removePairedDevice() {
		//
	}
	
	public void receiveInfraredData() {
		//
	}

	public void receiveCameraData() {
		//
	}

	public void analyzeBiometrics() {
		//
	}
	
	public void identifyIguana() {
		//
	}

	public void sendAlarmActivation() {
		//
	}

	public void sendDeviceBatteryAlert() {
		//
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Iguana Patrol Security System";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myAlarm, myBattery, myCamera, myCloud, myIR, myUserDevice); // add all your sub components
		return internalComponents;	}

}
