/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.impl;

import edu.ijse.layered.dao.custom.OrderDao;
import edu.ijse.layered.entity.OrderEntity;
import java.util.List;


/**
 *
 * @author user
 */
public abstract class OrderDaoImpl implements OrderDao {
    public boolean save(OrderEntity t) throws Exception {
        return false;
    }

    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    public OrderEntity Get(String id) throws Exception {
        return null;
    }

    public List<OrderEntity> GetAll() throws Exception {
        return null;
    }    
}
