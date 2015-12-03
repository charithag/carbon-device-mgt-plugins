package org.wso2.carbon.device.mgt.iot.androidsense.plugin.impl;

import org.wso2.carbon.device.mgt.common.DeviceIdentifier;
import org.wso2.carbon.device.mgt.common.DeviceManagementException;
import org.wso2.carbon.device.mgt.common.DeviceManager;
import org.wso2.carbon.device.mgt.common.app.mgt.Application;
import org.wso2.carbon.device.mgt.common.app.mgt.ApplicationManagementException;
import org.wso2.carbon.device.mgt.common.app.mgt.ApplicationManager;
import org.wso2.carbon.device.mgt.common.operation.mgt.Operation;
import org.wso2.carbon.device.mgt.common.spi.DeviceManagementService;
import org.wso2.carbon.device.mgt.iot.androidsense.plugin.constants.AndroidSenseConstants;

import java.util.List;

public class AndroidSenseManagerService implements DeviceManagementService {
	private DeviceManager deviceManager;
	@Override
	public String getType() {
		return AndroidSenseConstants.DEVICE_TYPE;
	}

	@Override
	public String getProviderTenantDomain() {
		return "carbon.super";
	}

	@Override
	public boolean isSharedWithAllTenants() {
		return true;
	}

	@Override
	public String[] getSharedTenantsDomain() {
		return new String[0];
	}

	@Override
	public void init() throws DeviceManagementException {
		this.deviceManager=new AndroidSenseManager();
	}

	@Override
	public DeviceManager getDeviceManager() {
		return deviceManager;
	}

	@Override
	public ApplicationManager getApplicationManager() {
		return null;
	}

	@Override public void notifyOperationToDevices(Operation operation, List<DeviceIdentifier> list)
			throws DeviceManagementException {

	}

	@Override
	public Application[] getApplications(String domain, int pageNumber, int size)
			throws ApplicationManagementException {
		return new Application[0];
	}

	@Override
	public void updateApplicationStatus(DeviceIdentifier deviceId, Application application,
										String status) throws ApplicationManagementException {

	}

	@Override
	public String getApplicationStatus(DeviceIdentifier deviceId, Application application)
			throws ApplicationManagementException {
		return null;
	}

	@Override public void installApplicationForDevices(Operation operation, List<DeviceIdentifier> list)
			throws ApplicationManagementException {

	}

	@Override public void installApplicationForUsers(Operation operation, List<String> list)
			throws ApplicationManagementException {

	}

	@Override public void installApplicationForUserRoles(Operation operation, List<String> list)
			throws ApplicationManagementException {

	}

}
