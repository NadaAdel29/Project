/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mosta
 */
public class InvoiceHeader {
    public String itemName;
    public String itemPrice;
    public String count;

    public InvoiceHeader(String itemName, String itemPrice, String count) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getCount() {
        return count;
    }
    
}
