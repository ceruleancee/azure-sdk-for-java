/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.metrics;

import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.management.ManagementConfiguration;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.http.impl.client.HttpClientBuilder;

public class MetricsClientImpl extends ServiceClient<MetricsClient> implements MetricsClient
{
    private URI baseUri;
    
    /**
    * Optional base uri parameter.
    * @return The BaseUri value.
    */
    public URI getBaseUri()
    {
        return this.baseUri;
    }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * Windows Azure subscription id.
    * @return The Credentials value.
    */
    public SubscriptionCloudCredentials getCredentials()
    {
        return this.credentials;
    }
    
    private MetricDefinitionOperations metricDefinitions;
    
    /**
    * @return The MetricDefinitionsOperations value.
    */
    public MetricDefinitionOperations getMetricDefinitionsOperations()
    {
        return this.metricDefinitions;
    }
    
    private MetricSettingOperations metricSettings;
    
    /**
    * @return The MetricSettingsOperations value.
    */
    public MetricSettingOperations getMetricSettingsOperations()
    {
        return this.metricSettings;
    }
    
    private MetricValueOperations metricValues;
    
    /**
    * @return The MetricValuesOperations value.
    */
    public MetricValueOperations getMetricValuesOperations()
    {
        return this.metricValues;
    }
    
    /**
    * Initializes a new instance of the MetricsClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    private MetricsClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        super(httpBuilder, executorService);
        this.metricDefinitions = new MetricDefinitionOperationsImpl(this);
        this.metricSettings = new MetricSettingOperationsImpl(this);
        this.metricValues = new MetricValueOperationsImpl(this);
    }
    
    /**
    * Initializes a new instance of the MetricsClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials Windows Azure subscription id.
    * @param baseUri Optional base uri parameter.
    */
    public MetricsClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, SubscriptionCloudCredentials credentials, URI baseUri)
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        if (baseUri == null)
        {
            throw new NullPointerException("baseUri");
        }
        this.credentials = credentials;
        this.baseUri = baseUri;
    }
    
    /**
    * Initializes a new instance of the MetricsClientImpl class.
    * Initializes a new instance of the MetricsClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials Windows Azure subscription id.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    */
    @Inject
    public MetricsClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials) throws java.net.URISyntaxException
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net");
    }
    
    /**
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected MetricsClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        return new MetricsClientImpl(httpBuilder, executorService, this.getCredentials(), this.getBaseUri());
    }
}
