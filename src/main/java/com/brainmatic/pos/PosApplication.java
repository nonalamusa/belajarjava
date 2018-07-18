package com.brainmatic.pos;

import com.brainmatic.pos.core.*;
import com.brainmatic.pos.infra.data.inmemory.ProductMemRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class PosApplication
{
	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
//		ApplicationContext ctx = SpringApplication.run(PosApplication.class, args);
//		ProductService service = ctx.getBean(ProductService.class);
//		System.out.println(service.generateCode());

	}


	public static void main2(String[] args) {

		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Momogi");
		p1.setPrice(BigDecimal.valueOf(500));

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Pepsi");
		p2.setPrice(BigDecimal.valueOf(5_000));

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Ayam");
		p3.setPrice(BigDecimal.valueOf(50_000));
/*
		ProductMemRepo repo = new ProductMemRepo();
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);
*/
		//tampilkan semua produk
/*
		ArrayList<Product> all = repo.getAll();

		for (Product p : all ) {
			System.out.println(p.getName());
		}*/
/*
		Product prd2 = repo.getById(1);
		System.out.println(prd2.getName());
*/

		ProductService service = new ProductService(new ProductMemRepo());
		System.out.println(service.generateCode());

	}

	public static void main1(String[] args) {
		//SpringApplication.run(PosApplication.class, args);

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Michael Suyama");
		e1.setBirthdate(LocalDate.of(1970, 3, 20));
		System.out.println(e1.getAge());

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Nancy Davolio");
		e2.setBirthdate(LocalDate.of( 1960, 2, 27));

		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Momogi");
		p1.setPrice(BigDecimal.valueOf(500));

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Pepsi");
		p2.setPrice(BigDecimal.valueOf(5_000));

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Ayam");
		p3.setPrice(BigDecimal.valueOf(50_000));

		Sale s1 = new Sale();
		//       s1.setProducts(new ArrayList<>());
		s1.setId(1);
		//       s1.setTime(LocalDateTime.now());
		s1.setCashier(e1);
		//Tampil nama penjualnya s1
		System.out.println(s1.getCashier().getName());
//		s1.addProduct(p1);
//		s1.addProduct(p1);
//		s1.addProduct(p2);

//		for (Product p: s1.getProducts()) {
//			System.out.println(p.getName());
//		}

		System.out.println(s1.getTotal());

		Sale s2 = new Sale();
		s2.setId(2);
		s2.setTime(LocalDateTime.now());
		s2.setCashier(e2);
	}
}
