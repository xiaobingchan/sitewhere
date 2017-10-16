/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.microservice.spi.security;

import org.springframework.security.core.Authentication;

import com.sitewhere.spi.SiteWhereException;

/**
 * Support access to a global "superuser" for authorizing calls between
 * microservices.
 * 
 * @author Derek
 */
public interface ISystemUser {

    /**
     * Get authentication information for superuser.
     * 
     * @return
     * @throws SiteWhereException
     */
    public Authentication getAuthentication() throws SiteWhereException;
}