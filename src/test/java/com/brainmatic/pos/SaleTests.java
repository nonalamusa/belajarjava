package com.brainmatic.pos;

import com.brainmatic.pos.core.Product;
import com.brainmatic.pos.core.Sale;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SaleTests {

    @Test
    public void new_sale_should_be_totaled_zero(){
        Sale sale = new Sale();
        BigDecimal total = sale.getTotal();
        assertEquals(total, BigDecimal.ZERO);

    }

    @Test
    public void sale_2_momogi_1_pepsi_should_6000(){
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Momogi");
        p1.setPrice(BigDecimal.valueOf(500));

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Pepsi");
        p2.setPrice(BigDecimal.valueOf(5_000));

        Sale sale = new Sale();
        sale.addLineItem(p1,2);
        sale.addLineItem(p2,1);

    //    sale.addProduct(p1);
    //    sale.addProduct(p1);
    //    sale.addProduct(p2);

        assertEquals(BigDecimal.valueOf(6000),sale.getTotal());
    }

    @Test
    public void mmmmmm(){
        Product p1 = new Product();
        p1.setPrice(BigDecimal.valueOf(500));

        Sale sale = new Sale();
    //    sale.addProduct(p1);
        sale.addLineItem(p1,1);

        assertEquals(BigDecimal.valueOf(500),sale.getTotal());





    }

}
