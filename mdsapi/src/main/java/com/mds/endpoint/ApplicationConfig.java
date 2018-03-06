/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mds.endpoint;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author aamir
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application
{

    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new java.util.HashSet<>();

            
        resources.add(com.mds.endpoint.Mdsselect.class);
        resources.add(com.mds.endpoint.MdsAdd.class);
        
        return resources;
    }
}
