package com.brainmatic.pos.infra.data.mongodb;

import com.brainmatic.pos.core.Product;
import com.brainmatic.pos.core.ProductRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ProductMongoRepo implements ProductRepo {

//    private static ArrayList<Product> data = new ArrayList<>(); //menggunakan static sehingga dapat digunakan oleh class lain


    public int getCount(){
        return 1;
    };

    //cek id product dan return valuenya
    public Product getById(int id) {
        System.out.println("from mongodb");
        return new Product();

    }

    public ArrayList<Product> getAll(){
        return new ArrayList<>();    }

   //simpan
   public void save(Product product) {
    }

    //remove
    public void remove(int id){  }



}
