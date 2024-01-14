/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.ijse.layered.controller;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.ItemService;

/**
 *
 * @author user
 */
public class ItemController {
      private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDTO itemDto) throws Exception{
        return itemService.saveItem(itemDto);
    }
}
