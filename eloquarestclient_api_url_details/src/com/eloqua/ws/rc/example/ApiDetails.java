/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eloqua.ws.rc.example;

import com.eloqua.ws.rc.connection.Client;
import com.eloqua.ws.rc.connection.Response;
import com.eloqua.ws.rc.models.EloquaApiUrlsDetail;
import com.google.gson.Gson;

/**
 *
 * @author sbarengo
 * Get the Eloqua API Details
 */
public class ApiDetails {

    public static void main(String args[]) {
        /* replace CompanyName, UserName and password with your eloqua instance login credential */
        Client restClient = new Client("Site" + "\\" + "UserName", "password", "https://login.eloqua.com/id");
        Response response = restClient.get("");
       // System.out.println("Response body:" + response.body);
        //System.out.println("Response status:" + response.statusCode);
        Gson gson=new Gson();
       EloquaApiUrlsDetail apiUrlsDet= gson.fromJson(response.body, EloquaApiUrlsDetail.class);
       System.out.println("Your eloqua instance site and API url details as below");
       System.out.println("Eloqua instance site url: "+apiUrlsDet.getUrls().getBase());
       System.out.println("Eloqua instance REST API standard url: "+apiUrlsDet.getUrls().getApis().getRest().getStandard());
       System.out.println("Eloqua instance REST API data url: "+apiUrlsDet.getUrls().getApis().getRest().getStandard());
       System.out.println("Eloqua instance REST API Bulk url: "+apiUrlsDet.getUrls().getApis().getRest().getBulk());
       System.out.println("Eloqua instance SOAP API standard url: "+apiUrlsDet.getUrls().getApis().getSoap().getStandard());
       System.out.println("Eloqua instance SOAP API data transfer url: "+apiUrlsDet.getUrls().getApis().getSoap().getDataTransfer());
       System.out.println("Eloqua instance SOAP API email url: "+apiUrlsDet.getUrls().getApis().getSoap().getEmail());
       System.out.println("Eloqua instance SOAP API external Action url: "+apiUrlsDet.getUrls().getApis().getSoap().getExternalAction());
       
    }
}
