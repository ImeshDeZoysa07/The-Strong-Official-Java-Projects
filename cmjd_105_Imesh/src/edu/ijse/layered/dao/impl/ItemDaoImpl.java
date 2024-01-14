/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.impl;

import edu.ijse.layered.dao.CrudUtill;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.entity.ItemEntity;
import java.util.List;

/**
 *
 * @author user
 */
public class ItemDaoImpl implements ItemDao {
     @Override
    public boolean save(ItemEntity t) throws Exception {
        return CrudUtill.executeUpdate("INSERT INTO Item VALUES(?,?,?,?,?)", 
                t.getItemCode(),
                t.getDescription(),
                t.getPackSize(),
                t.getUnitPrice(),
                t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public List<ItemEntity> getAll() throws Exception {
        return null;
    }
}
