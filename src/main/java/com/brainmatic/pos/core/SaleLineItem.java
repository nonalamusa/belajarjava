package com.brainmatic.pos.core;

import java.math.BigDecimal;

public class SaleLineItem {

    private int quantity;
    private BigDecimal unitPrice;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        setUnitPrice(product.getPrice());
    }

    //contructor
    public SaleLineItem(Product product, int quantity){
        setProduct(product);
        setQuantity(quantity);
        setUnitPrice(product.getPrice());
    }

    public BigDecimal getSubtotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }



}
