package com.brainmatic.pos;

import com.brainmatic.pos.core.Product;
import com.brainmatic.pos.core.SaleLineItem;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class SaleLineItemTests {

    @Test
    public void sale_2_momogi_should_be_1000(){

        Product p1 = new Product();
        p1.setPrice(BigDecimal.valueOf(500));

        SaleLineItem sli = new SaleLineItem(p1 , 2);
       // sli.setQuantity(2); sudah didentifikasi pada konstruktor yang ada pada class SaleLineItem
      //  sli.setProduct(p1);
      //  sli.setUnitPrice(p1.getPrice());
        // note: dapat disimpan di function/methode setProduct Tekan Ctrl + Click pada setProduct
        BigDecimal subtotal = sli.getSubtotal();

        assertEquals(BigDecimal.valueOf(1000),subtotal);
    }
}
