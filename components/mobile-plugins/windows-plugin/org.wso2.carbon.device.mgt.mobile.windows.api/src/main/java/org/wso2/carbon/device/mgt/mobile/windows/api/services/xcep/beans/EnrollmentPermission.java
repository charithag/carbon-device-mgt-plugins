/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.device.mgt.mobile.windows.api.services.xcep.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for EnrollmentPermission complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EnrollmentPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enroll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoEnroll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollmentPermission", propOrder = {
		"enroll",
		"autoEnroll"
})
@SuppressWarnings("unused")
public class EnrollmentPermission {

	protected boolean enroll;
	protected boolean autoEnroll;

	/**
	 * Gets the value of the enroll property.
	 */
	public boolean isEnroll() {
		return enroll;
	}

	/**
	 * Sets the value of the enroll property.
	 */
	public void setEnroll(boolean value) {
		this.enroll = value;
	}

	/**
	 * Gets the value of the autoEnroll property.
	 */
	public boolean isAutoEnroll() {
		return autoEnroll;
	}

	/**
	 * Sets the value of the autoEnroll property.
	 */
	public void setAutoEnroll(boolean value) {
		this.autoEnroll = value;
	}

}
