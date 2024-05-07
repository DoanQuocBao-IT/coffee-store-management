/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.entity.request;

/**
 *
 * @author ASUS
 */
public class ComboboxDisplay {
    private int id;
    private int value;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComboboxDisplay() {
    }

    public ComboboxDisplay(int id, int value, String name) {
        this.id = id;
        this.value = value;
        this.name = name;
    }


    @Override
    public String toString() {
        return name + "-"+ value;
    }
    
}
