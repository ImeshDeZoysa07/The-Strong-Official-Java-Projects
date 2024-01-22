/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.CustomerDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author user
 */
public class CustomerController {
     private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDTO customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
    
    public String updateCustomer(CustomerDTO customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDTO GetCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }
    
    public List<CustomerDTO> getAllCustomer() throws Exception{
        return customerService.getAll();
    }
}
