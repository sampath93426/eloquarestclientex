/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eloqua.ws.rc.models;

/**
 *
 * @author sbarengo
 */
public class EloquaUrls {
    private String base;
    private EloquaApis apis;

    public EloquaApis getApis() {
        return apis;
    }

    public void setApis(EloquaApis apis) {
        this.apis = apis;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

}
