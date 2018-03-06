/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdsconnect.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aamir
 */
@Entity
@Table(name = "new_table", catalog = "amer", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewTable.findAll", query = "SELECT n FROM NewTable n")
    , @NamedQuery(name = "NewTable.findById", query = "SELECT n FROM NewTable n WHERE n.id = :id")
    , @NamedQuery(name = "NewTable.findByDate", query = "SELECT n FROM NewTable n WHERE n.date = :date")
    , @NamedQuery(name = "NewTable.findByTime", query = "SELECT n FROM NewTable n WHERE n.time = :time")
    , @NamedQuery(name = "NewTable.findByDescription", query = "SELECT n FROM NewTable n WHERE n.description = :description")})
public class NewTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "DATE")
    private String date;
    @Column(name = "TIME")
    private String time;
    @Column(name = "DESCRIPTION")
    private String description;

    public NewTable() {
    }

    public NewTable(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewTable)) {
            return false;
        }
        NewTable other = (NewTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mdsconnect.entity.NewTable[ id=" + id + " ]";
    }
    
}
