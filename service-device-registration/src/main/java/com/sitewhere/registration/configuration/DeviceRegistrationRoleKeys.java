/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.registration.configuration;

import com.sitewhere.spi.microservice.configuration.model.IRoleKey;

public enum DeviceRegistrationRoleKeys implements IRoleKey {

    /** Device registration */
    DeviceRegistration("device_reg"),

    /** Device registration manager */
    DeviceRegistrationManager("dev_reg_mgr");

    private String id;

    private DeviceRegistrationRoleKeys(String id) {
	this.id = id;
    }

    /*
     * @see com.sitewhere.spi.microservice.configuration.model.IRoleKey#getId()
     */
    @Override
    public String getId() {
	return id;
    }
}