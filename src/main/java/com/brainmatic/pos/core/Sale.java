package com.brainmatic.pos.core;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sale {
    private int id;
    private LocalDateTime time;

    private Employee cashier;
    //private ArrayList<Product> products; diganti dengan SaleLineItem
    private ArrayList<SaleLineItem> lineItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    public Employee getCashier() {
        return cashier;
    }

    public void setCashier(Employee cashier) {
        this.cashier = cashier;
    }

    public ArrayList<SaleLineItem> getLineItems() {
        return lineItems;
    }
/* diganti dengan array list SaleLineItem
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
*/
    public Sale() {
        time = LocalDateTime.now();
        lineItems = new ArrayList<>();
    }

/* diganti dengan add LineItem
    public void addProduct(Product product) {
        lineItems.add(product);
    }*/

    public void addLineItem(Product product, int quantity){
        SaleLineItem sli = new SaleLineItem(product, quantity);
        lineItems.add(sli);

    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (SaleLineItem sli: lineItems ) {
            total = total.add(sli.getSubtotal());
        }
        return total;
    }
}
