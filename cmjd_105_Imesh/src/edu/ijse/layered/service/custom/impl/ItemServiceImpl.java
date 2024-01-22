/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anjanathrishakya
 */
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public String saveItem(ItemDTO dto) throws Exception {
        ItemEntity entity = new ItemEntity(dto.getCode(),
                dto.getDescription(), dto.getPack(), dto.getUnitPrice(),
                dto.getQoh());
        if (itemDao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateItem(ItemDTO dto) throws Exception {
        ItemEntity entity = new ItemEntity(dto.getCode(),
                dto.getDescription(), dto.getPack(), dto.getUnitPrice(),
                dto.getQoh());
        if (itemDao.update(entity)) {
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (itemDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public ItemDTO getItem(String id) throws Exception {
        ItemEntity e = itemDao.get(id);
        return new ItemDTO(e.getItemCode(), e.getDescription(), e.getPackSize(), e.getUnitPrice(), e.getQoh());
    }

    @Override
    public List<ItemDTO> getAll() throws Exception {
        List<ItemDTO> itemDtos = new ArrayList<>();
        List<ItemEntity> itemEntities = itemDao.getAll();

        for (ItemEntity e : itemEntities) {
            itemDtos.add(new ItemDTO(e.getItemCode(), e.getDescription(), e.getPackSize(), e.getUnitPrice(), e.getQoh()));
        }
        return itemDtos;
    }

}