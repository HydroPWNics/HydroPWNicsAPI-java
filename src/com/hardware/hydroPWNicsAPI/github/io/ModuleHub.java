package com.hardware.hydroPWNicsAPI.github.io;

import java.util.ArrayList;

import com.neuronrobotics.sdk.common.BowlerAbstractConnection;
import com.neuronrobotics.sdk.common.BowlerAbstractDevice;
import com.neuronrobotics.sdk.common.BowlerDatagram;
import com.neuronrobotics.sdk.common.IConnectionEventListener;
import com.neuronrobotics.sdk.common.MACAddress;
import com.neuronrobotics.sdk.dyio.IDyIOEventListener;
import com.neuronrobotics.sdk.namespace.bcs.pid.IPidControlNamespace;
import com.neuronrobotics.sdk.pid.GenericPIDDevice;
import com.neuronrobotics.sdk.pid.IPIDEventListener;
import com.neuronrobotics.sdk.pid.PDVelocityConfiguration;
import com.neuronrobotics.sdk.pid.PIDChannel;
import com.neuronrobotics.sdk.pid.PIDCommandException;
import com.neuronrobotics.sdk.pid.PIDConfiguration;


public class ModuleHub extends BowlerAbstractDevice implements IPidControlNamespace, IConnectionEventListener{
	
	@SuppressWarnings("unused")
	private static final String HYDROPWNICS_MODULEHUB_1_0 = "hydropwnics.modulehub.*;1.0";
	private ArrayList<IDyIOEventListener> listeners = new ArrayList<IDyIOEventListener>();

	
	private byte [] firmware = {0, 0, 0};
	private String info = "MODULE_HUB";
	
	private boolean cachedMode=false;
	private boolean muteResyncOnModeChange=false;
	private static boolean checkFirmware=false;
	private boolean resyncing = false;
	private boolean haveBeenSynced =false;
	
	private boolean legacyParser = false;
	private Boolean enableBrownOut=null;
	
	private GenericPIDDevice pid = new GenericPIDDevice();
	
	/**
	 * Default Constructor.
	 * Builds a generic ModuleHub that has the default broadcast address and no default connection.
	 */
	public ModuleHub(){
		setAddress(new MACAddress(MACAddress.BROADCAST));
		getPid().setAddress(new MACAddress(MACAddress.BROADCAST));
	}
	
	/**
	 * Builds a ModuleHub that has the given address and no default connection.
	 * @param address
	 */
	public ModuleHub(MACAddress address) {
		setAddress(address);
		getPid().setAddress(address);
	}
	
	/**
	 * Builds a ModuleHub with the given connection and the broadcast address.
	 * @param connection
	 */
	public ModuleHub(BowlerAbstractConnection connection) {
		setAddress(new MACAddress(MACAddress.BROADCAST));
		setConnection(connection);
		getPid().setConnection(connection);
		getPid().setAddress(new MACAddress(MACAddress.BROADCAST));
	}
	
	/**
	 * Builds a ModuleHub with the given address and connection.
	 * @param address
	 * @param connection
	 */
	public ModuleHub(MACAddress address, BowlerAbstractConnection connection) {
		setAddress(address);
		setConnection(connection);
		getPid().setConnection(connection);
		getPid().setAddress(address);
	}

	private BowlerAbstractDevice getPid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * 
	 * @param port_num
	 */
	public void AttachAnalogSensorModule(int port_num){
		
	}
	
	
	/**
	 * 
	 * @param port_num
	 */
	public void AttachDigitalSensorModule(int port_num){
		
	}
	

	@Override
	public void onAsyncResponse(BowlerDatagram arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConnect(BowlerAbstractConnection arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDisconnect(BowlerAbstractConnection arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ConfigurePDVelovityController(PDVelocityConfiguration arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ConfigurePIDController(PIDConfiguration arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] GetAllPIDPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GetPIDPosition(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ResetPIDChannel(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SetAllPIDSetPoint(int[] arg0, double arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SetPDVelocity(int arg0, int arg1, double arg2)
			throws PIDCommandException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SetPIDInterpolatedVelocity(int arg0, int arg1, double arg2)
			throws PIDCommandException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SetPIDSetPoint(int arg0, int arg1, double arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPIDEventListener(IPIDEventListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flushPIDChannels(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PDVelocityConfiguration getPDVelocityConfiguration(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PIDChannel getPIDChannel(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPIDChannelCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PIDConfiguration getPIDConfiguration(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean killAllPidGroups() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removePIDEventListener(IPIDEventListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
}// end class 