/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.service.Superservice;
import java.util.List;


/**
 *
 * @author user
 */
public interface ItemService extends Superservice {
     String saveItem(ItemDTO itemDto) throws Exception;
    String updateItem(ItemDTO itemDto) throws Exception;
    String deleteItem(String id) throws Exception;
    ItemDTO getItem(String id) throws Exception;
    List<ItemDTO> getAll() throws Exception;
}
