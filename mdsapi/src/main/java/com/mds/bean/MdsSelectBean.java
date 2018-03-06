/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mds.bean;

import java.util.List;

/**
 *
 * @author aamir
 */
public class MdsSelectBean {
    

    List<String> bvList;
    List<String> btList;
    List<String> countryList;
    List<String> jobCodeList;
    boolean andOperation;
    

    public MdsSelectBean() {
    }

    public List<String> getBvList() {
        return bvList;
    }

    public void setBvList(List<String> bvList) {
        this.bvList = bvList;
    }

    public List<String> getBtList() {
        return btList;
    }

    public void setBtList(List<String> btList) {
        this.btList = btList;
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }

    public List<String> getJobCodeList() {
        return jobCodeList;
    }

    public void setJobCodeList(List<String> jobCodeList) {
        this.jobCodeList = jobCodeList;
    }

    public boolean isAndOperation() {
        return andOperation;
    }

    public void setAndOperation(boolean andOperation) {
        this.andOperation = andOperation;
    }
    

}
