/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.microservice.spi;

import com.sitewhere.spi.SiteWhereException;

/**
 * Indicates exception due to microservice lifeycle.
 * 
 * @author Derek
 */
public class MicroserviceNotAvailableException extends SiteWhereException {

    /** Serial version UID */
    private static final long serialVersionUID = -1003297732383971503L;

    public MicroserviceNotAvailableException() {
    }

    public MicroserviceNotAvailableException(String message, Throwable cause) {
	super(message, cause);
    }

    public MicroserviceNotAvailableException(String message) {
	super(message);
    }

    public MicroserviceNotAvailableException(Throwable cause) {
	super(cause);
    }
}