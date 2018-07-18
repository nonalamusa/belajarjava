package com.brainmatic.pos.infra.data.inmemory;

import com.brainmatic.pos.core.Product;
import com.brainmatic.pos.core.ProductRepo;

import java.util.ArrayList;

public class ProductMemRepo implements ProductRepo {

    private static ArrayList<Product> data = new ArrayList<>(); //menggunakan static sehingga dapat digunakan oleh class lain


    public int getCount(){
        return data.size();
    };

    //cek id product dan return valuenya
    public Product getById(int id) {
        for (Product p: data){
            if(p.getId() == id)
                return p;
        }
        return null;

    }

    public ArrayList<Product> getAll(){
        return data;    }

   //simpan
    public void save(Product product) {
        data.add(product);
    }

    //remove
    public void remove(int id){
        for (Product p: data) {
            if (p.getId() == id)
                data.remove(p);
        }
    }



}
