/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.entity.request;

/**
 *
 * @author ASUS
 */
public class OrderItemRequest {
    private int inventory;
    private int beverage;
    private int orders;

    public OrderItemRequest(int inventory, int beverage, int orders) {
        this.inventory = inventory;
        this.beverage = beverage;
        this.orders = orders;
    }

    public OrderItemRequest() {
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getBeverage() {
        return beverage;
    }

    public void setBeverage(int beverage) {
        this.beverage = beverage;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
    
}
