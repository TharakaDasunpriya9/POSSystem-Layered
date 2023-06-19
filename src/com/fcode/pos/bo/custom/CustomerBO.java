/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcode.pos.bo.custom;

import com.fcode.pos.bo.SuperBO;
import com.fcode.pos.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO{
    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;
    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;
    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException;
    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException;
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException ;
}
