/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdsconnect.service;

import com.mdsconnect.entity.NewTable;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aamir
 */
@Dependent
public class NewTableService extends AbstractFacade<NewTable> {

    @PersistenceContext(unitName = "com.mdsconnect.war_0.9PU")
    private EntityManager em;

    public NewTableService() {
        super(NewTable.class);
    }

    @Override
    public void create(NewTable entity) {
        em.clear();
        super.create(entity);
        em.flush();
    }

    @Override
    public void edit(NewTable entity) {
        em.clear();
        super.edit(entity);
        em.flush();
    }

  
    
    
    public List<NewTable> findNewTableByFilter(String query)
    {
       
        em.clear();
        
        
        List<NewTable> emplist = em.createQuery(query, NewTable.class)
                            .getResultList();
        em.flush();

        return emplist;
    }


    @Override
    public List<NewTable> findAll() {
        return super.findAll();
    }


    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        em.clear();
        em.getEntityManagerFactory().getCache().evictAll();
        return em;
    }

}
