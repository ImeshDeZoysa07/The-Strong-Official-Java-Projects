/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.dao.custom;

import edu.ijse.layered.entity.CustomerEntity;
import java.util.List;

/**
 *
 * @author user
 */
public interface CustomerDao {

    public boolean save(CustomerEntity customerEntity);

    public boolean update(CustomerEntity customerEntity);

    public boolean delete(String id);

    public CustomerEntity get(String id);

    public List<CustomerEntity> getAll();
    
}
