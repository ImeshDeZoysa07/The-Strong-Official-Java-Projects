/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

import java.util.List;

/**
 *
 * @author user
 */
public class OrderDTO {
     private String id;
    private String date;
    private String custId;
    
    private List<OrderDetailDTO> orderDetailDtos;

    public OrderDTO() {
    }

    public OrderDTO(String id, String date, String custId, List<OrderDetailDTO> orderDetailDtos) {
        this.id = id;
        this.date = date;
        this.custId = custId;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderDetailDtos
     */
    public List<OrderDetailDTO> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDTOs(List<OrderDetailDTO> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "id=" + id + ", date=" + date + ", custId=" + custId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }
}
