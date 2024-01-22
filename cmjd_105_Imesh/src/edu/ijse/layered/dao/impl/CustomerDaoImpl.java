/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.impl;

import edu.ijse.layered.dao.CrudUtill;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.entity.CustomerEntity;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public abstract class CustomerDaoImpl implements CustomerDao {

    /**
     *
     * @param t
     * @return
     * @throws Exception
     */
   public boolean Save(CustomerEntity t) throws Exception {
        return CrudUtill.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)",
                t.getCustId(),
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getZip());
    }

    public boolean Update(CustomerEntity t) throws Exception {
        return CrudUtill.executeUpdate("UPDATE Customer SET CustTitle=?, CustName=?, "
                + "DOB=?, salary=?, CustAddress=?, City=? , Province=?, PostalCode=? "
                + "WHERE CustID=?",
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getZip(),
                t.getCustId());
    }

    public boolean Delete(String id) throws Exception {
        return CrudUtill.executeUpdate("DELETE FROM Customer WHERE CustID=?", id);
    }

  
    public CustomerEntity Get(String id) throws Exception {
        ResultSet rst = CrudUtill.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        while (rst.next()) {
            return new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode"));
        }
        
        return null;
    }

    public List<CustomerEntity> GetAll() throws Exception {
        ResultSet rst = CrudUtill.executeQuery("SELECT * FROM Customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"),
                    rst.getString("DOB"),
                    rst.getDouble("salary"),
                    rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"),
                    rst.getString("PostalCode")));
        }
        
        return customerEntities;
    }
}
