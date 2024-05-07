/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.entity.request;

import com.raven.entity.Employee;
import com.raven.entity.Voucher;
import java.util.Date;


/**
 *
 * @author ASUS
 */
public class OrderRequest {
    private int payment;
    private int employeeId;
    private int voucherId;

    /**
     * @return the payment
     */
    public int getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }

    /**
     * @return the created_at
     */
  

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the voucherId
     */
    public int getVoucherId() {
        return voucherId;
    }

    /**
     * @param voucherId the voucherId to set
     */
    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public OrderRequest(int payment, int employeeId, int voucherId) {
        this.payment = payment;
        this.employeeId = employeeId;
        this.voucherId = voucherId;
    }

    public OrderRequest(int payment, int employeeId) {
        this.payment = payment;
        this.employeeId = employeeId;
    }

    public OrderRequest() {
    }
    
}
