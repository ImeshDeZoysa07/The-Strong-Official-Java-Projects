/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.OrderDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.OrderService;


/**
 *
 * @author user
 */
public class OrderController {
    
     private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    
    public String placeOrder(OrderDTO orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
        
    }

}