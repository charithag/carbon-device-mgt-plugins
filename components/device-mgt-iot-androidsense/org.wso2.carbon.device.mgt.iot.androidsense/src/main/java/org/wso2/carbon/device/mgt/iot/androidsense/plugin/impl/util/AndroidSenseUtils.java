/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.device.mgt.iot.androidsense.plugin.impl.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

/**
 * Contains utility methods used by Android plugin.
 */
public class AndroidSenseUtils {

    private static Log log = LogFactory.getLog(AndroidSenseUtils.class);

    public static String getDeviceProperty(Map<String, String> deviceProperties, String property) {

        String deviceProperty = deviceProperties.get(property);

        if (deviceProperty == null) {
            return "";
        }

        return deviceProperty;
    }


}
