/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcode.pos.controller;


import java.sql.SQLException;
import java.util.ArrayList;

import com.fcode.pos.bo.BOFactory;
import com.fcode.pos.bo.custom.CustomerBO;
import com.fcode.pos.dto.CustomerDTO;


public class CustomerFormController {

    CustomerBO bo = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.addCustomer(customer);
    }

    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.updateCustomer(customer);
    }

    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.removeCustomer(customerID);
    }

    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.searchCustomer(customerID);
    }

    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        return bo.getAllCustomers();
    }

}
