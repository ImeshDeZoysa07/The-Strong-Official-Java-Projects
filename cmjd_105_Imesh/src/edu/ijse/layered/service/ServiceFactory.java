/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service;

import edu.ijse.layered.service.custom.impl.ItemServiceImpl;

/**
 *
 * @author user
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public Superservice getService(ServiceType type){
        switch (type) {
            case ITEM:
               // return new ItemServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ITEM, CUSTOMER, ORDER
    }
}
