/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eloqua.ws.rc.models;

/**
 *
 * @author sbarengo
 */
public class SoapApi {
    private String standard;
    private String dataTransfer;
    private String email;
    private String externalAction;

    public String getDataTransfer() {
        return dataTransfer;
    }

    public void setDataTransfer(String dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExternalAction() {
        return externalAction;
    }

    public void setExternalAction(String externalAction) {
        this.externalAction = externalAction;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
         

}
