/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcode.pos.dao.custom;

import com.fcode.pos.dao.CRUDDAO;
import com.fcode.pos.entity.Customer;

public interface CustomerDAO extends CRUDDAO<Customer, String>{
    public String getCustomerLastID(String id)throws Exception;
}
