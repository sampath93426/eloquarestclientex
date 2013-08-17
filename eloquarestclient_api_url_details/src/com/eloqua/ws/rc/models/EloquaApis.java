/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eloqua.ws.rc.models;

/**
 *
 * @author sbarengo
 */
public class EloquaApis {
    private SoapApi soap;
    private RestApi rest;

    public RestApi getRest() {
        return rest;
    }

    public void setRest(RestApi rest) {
        this.rest = rest;
    }

    public SoapApi getSoap() {
        return soap;
    }

    public void setSoap(SoapApi soap) {
        this.soap = soap;
    }
    
    

}
