/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.OrderDTO;
import edu.ijse.layered.service.Superservice;

/**
 *
 * @author user
 */
public interface OrderService extends Superservice {
    String placeOrder(OrderDTO dto) throws Exception;
}
