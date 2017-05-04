/*
 *  Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *  This file is part of Alfresco Activiti Client.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.alfresco.client.services.process.activiti.api;

import java.io.IOException;
import java.util.Map;

import org.alfresco.client.services.process.activiti.ActivitiAPITestCase;
import org.alfresco.client.services.process.activiti.core.api.EngineAPI;
import org.alfresco.client.services.process.activiti.core.model.representation.ProcessEngineInfoResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EngineAPITest extends ActivitiAPITestCase
{
    @BeforeClass
    public void prepare() throws Exception
    {
        client = prepareClient(TEST_ENDPOINT, TEST_USERNAME, TEST_PASSWORD);
    }

    @Test
    public void engineInfoTest() throws IOException
    {
        EngineAPI engineAPI = client.getAPI(EngineAPI.class);

        ProcessEngineInfoResponse response = engineAPI.getEngineInfoCall().execute().body();
        Assert.assertEquals(response.getName(), "default");
        Assert.assertNotNull(response.getVersion());
        Assert.assertNull(response.getResourceUrl());
        Assert.assertNull(response.getException());

        Map<String, String> properties = engineAPI.getPropertiesCall().execute().body();
        Assert.assertNotNull(properties);

    }
}