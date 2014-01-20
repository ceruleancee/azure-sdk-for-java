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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The Get DNS Suffix operation response.
*/
public class WebSpacesListGeoRegionsResponse extends OperationResponse implements Iterable<WebSpacesListGeoRegionsResponse.GeoRegion>
{
    private ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> geoRegions;
    
    /**
    * The available geo regions.
    * @return The GeoRegions value.
    */
    public ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> getGeoRegions()
    {
        return this.geoRegions;
    }
    
    /**
    * The available geo regions.
    * @param geoRegionsValue The GeoRegions value.
    */
    public void setGeoRegions(final ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> geoRegionsValue)
    {
        this.geoRegions = geoRegionsValue;
    }
    
    /**
    * Initializes a new instance of the WebSpacesListGeoRegionsResponse class.
    *
    */
    public WebSpacesListGeoRegionsResponse()
    {
        super();
        this.geoRegions = new ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion>();
    }
    
    /**
    * Gets the sequence of GeoRegions.
    *
    */
    public Iterator<WebSpacesListGeoRegionsResponse.GeoRegion> iterator()
    {
        return this.getGeoRegions().iterator();
    }
    
    /**
    * An available geo region for a web space.
    */
    public static class GeoRegion
    {
        private String description;
        
        /**
        * Geo Region description.
        * @return The Description value.
        */
        public String getDescription()
        {
            return this.description;
        }
        
        /**
        * Geo Region description.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue)
        {
            this.description = descriptionValue;
        }
        
        private String name;
        
        /**
        * Name of the region.
        * @return The Name value.
        */
        public String getName()
        {
            return this.name;
        }
        
        /**
        * Name of the region.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue)
        {
            this.name = nameValue;
        }
        
        private int sortOrder;
        
        /**
        * Sort order.
        * @return The SortOrder value.
        */
        public int getSortOrder()
        {
            return this.sortOrder;
        }
        
        /**
        * Sort order.
        * @param sortOrderValue The SortOrder value.
        */
        public void setSortOrder(final int sortOrderValue)
        {
            this.sortOrder = sortOrderValue;
        }
    }
}
