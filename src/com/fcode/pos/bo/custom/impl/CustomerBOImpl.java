/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcode.pos.bo.custom.impl;

import com.fcode.pos.bo.custom.CustomerBO;
import com.fcode.pos.dao.DAOFactory;
import com.fcode.pos.dao.custom.CustomerDAO;
import com.fcode.pos.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import com.fcode.pos.entity.Customer;


public class CustomerBOImpl implements CustomerBO {

    CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {
        return dao.add(new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getCustomerSalary()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {

        return dao.update(new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getCustomerSalary()));
    }

    @Override
    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return dao.delete(customerID);
    }

    @Override
    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        Customer ent = dao.search(customerID);
        return new CustomerDTO(ent.getId(), ent.getName(), ent.getAddress(), ent.getSalary());
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> all = dao.getAll();
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        for (Customer c : all) {
            allCustomers.add(new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary()));
        }
        return allCustomers;
    }

}
