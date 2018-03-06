/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mds.endpoint;

import com.mds.handler.MdsSelectQuery;
import com.mdsconnect.entity.NewTable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author aamir
 *
 */
@Stateless
@Path("mdsselect")
public class Mdsselect {

    public Mdsselect() {
    }
   

    @Inject
    private MdsSelectQuery mdsSelectQuery;
     @GET
     @Produces(MediaType.APPLICATION_JSON)
    @Asynchronous
    public void find()
    {
        System.out.println("dsf");
    }
    
   
   
    
    @GET
    @Path("{desc}")
    @Produces(MediaType.APPLICATION_JSON)
    @Asynchronous
    public void findgh(@Suspended final AsyncResponse asyncResponse, @PathParam(value = "desc") final String desc)
    {
        asyncResponse.resume(doExecutefindall(desc));
    }
    
    
  
    
    private Response doExecutefindall(String desc) {
        
        try {
            System.out.println("test");
             GenericEntity<List<NewTable>> list=mdsSelectQuery.mdsSelectQueryBuilder(desc);
             
             return Response.ok().entity(list).build();
                        //res = Response.status(Status.PRECONDITION_FAILED).entity(list).build();
                      
        } catch (Exception ex) {
            Logger.getLogger(Mdsselect.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().header("Mdsselect", "Error occured while reading ").build();
       
        }

    }
    
  

}
