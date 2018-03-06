/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mds.handler;

import com.mds.bean.MdsSelectBean;
import com.mdsconnect.entity.NewTable;
import com.mdsconnect.service.NewTableService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.ws.rs.core.GenericEntity;

/**
 *
 * @author aamir
 */
@Dependent
public class MdsSelectQuery {

    @Inject
    private NewTableService newTableService;

    public MdsSelectQuery() {
    }

    public GenericEntity<List<NewTable>> mdsSelectQueryBuilder(String desc) {

        String query = "SELECT n FROM NewTable n WHERE n.description like '%tes%'";
//String query = "SELECT n FROM NewTable n WHERE n.description like '%"+desc+"%'";

        System.out.print("Query is +" + query);
        List<NewTable> filteredNewTableDesc = newTableService.findNewTableByFilter(query);

        GenericEntity<List<NewTable>> list = new GenericEntity<List<NewTable>>(filteredNewTableDesc) {
        };
        return list;
    }

    public void mdsCreateNewTableBuilder(String desc) {
        NewTable entity = new NewTable();
        // Create an instance of SimpleDateFormat used for formatting 
// the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat dftime = new SimpleDateFormat("HH:mm:ss");

// Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
// Using DateFormat format method we can create a string 
// representation of a date with the defined format.
        String date = df.format(today);
        String time=dftime.format(today);

        entity.setDate(date);
        entity.setTime(time);
        entity.setDescription(desc);

        newTableService.create(entity);
    }

}
