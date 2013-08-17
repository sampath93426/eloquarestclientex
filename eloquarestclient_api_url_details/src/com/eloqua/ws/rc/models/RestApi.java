/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eloqua.ws.rc.models;

/**
 *
 * @author sbarengo
 */
public class RestApi {
  private String standard;
  private String data;
  private String bulk;

    public String getBulk() {
        return bulk;
    }

    public void setBulk(String bulk) {
        this.bulk = bulk;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
