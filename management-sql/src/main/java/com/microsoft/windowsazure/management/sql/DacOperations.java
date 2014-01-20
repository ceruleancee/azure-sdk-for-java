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

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.DacExportParameters;
import com.microsoft.windowsazure.management.sql.models.DacGetStatusResponse;
import com.microsoft.windowsazure.management.sql.models.DacImportExportResponse;
import com.microsoft.windowsazure.management.sql.models.DacImportParameters;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Includes operations for importing and exporting SQL Databases into and out of
* Windows Azure blob storage.
*/
public interface DacOperations
{
    /**
    * Export DAC into Windows Azure blob storage.
    *
    * @param serverName The name of the server being exported from.
    * @param parameters Export parameters.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for an DAC Import/Export request.
    */
    DacImportExportResponse exportDatabase(String serverName, DacExportParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Export DAC into Windows Azure blob storage.
    *
    * @param serverName The name of the server being exported from.
    * @param parameters Export parameters.
    * @return Response for an DAC Import/Export request.
    */
    Future<DacImportExportResponse> exportDatabaseAsync(String serverName, DacExportParameters parameters);
    
    /**
    * Gets the status of the DAC.
    *
    * @param serverName The name of the server.
    * @param fullyQualifiedServerName The fully qualified name of the server.
    * @param username The server's username.
    * @param password The server's password.
    * @param requestId The request ID of the operation being queried.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return The response structure for the DAC GetStatus operation.
    */
    DacGetStatusResponse getStatus(String serverName, String fullyQualifiedServerName, String username, String password, String requestId) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException, ParseException;
    
    /**
    * Gets the status of the DAC.
    *
    * @param serverName The name of the server.
    * @param fullyQualifiedServerName The fully qualified name of the server.
    * @param username The server's username.
    * @param password The server's password.
    * @param requestId The request ID of the operation being queried.
    * @return The response structure for the DAC GetStatus operation.
    */
    Future<DacGetStatusResponse> getStatusAsync(String serverName, String fullyQualifiedServerName, String username, String password, String requestId);
    
    /**
    * Import DAC from Windows Azure blob storage.
    *
    * @param serverName The name of the server being imported to.
    * @param parameters Import parameters.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for an DAC Import/Export request.
    */
    DacImportExportResponse importDatabase(String serverName, DacImportParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Import DAC from Windows Azure blob storage.
    *
    * @param serverName The name of the server being imported to.
    * @param parameters Import parameters.
    * @return Response for an DAC Import/Export request.
    */
    Future<DacImportExportResponse> importDatabaseAsync(String serverName, DacImportParameters parameters);
}
