/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.CustomerDTO;
import edu.ijse.layered.service.Superservice;
import java.util.List;


/**
 *
 * @author user
 */
public interface CustomerService extends Superservice {
     String addCustomer(CustomerDTO dto) throws Exception;

    String updateCustomer(CustomerDTO dto) throws Exception;

    String deleteCustomer(String id) throws Exception;
    
    CustomerDTO getCustomer(String id) throws Exception;
    
    List<CustomerDTO> getAll() throws Exception;
}
