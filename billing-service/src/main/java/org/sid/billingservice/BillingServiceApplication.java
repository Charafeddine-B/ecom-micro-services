package org.sid.billingservice;

import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;
import org.sid.billingservice.repositories.BillRepository;
import org.sid.billingservice.repositories.ProductItemRepository;
import org.sid.billingservice.service.CustomerRestClient;
import org.sid.billingservice.service.ProductRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

@EnableFeignClients
@SpringBootApplication
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(BillRepository billRepository,
							ProductItemRepository prductItemRepository,
							CustomerRestClient customerRestClient,
							ProductRestClient productRestClient) {
		return args -> {
			Collection<Product> products = productRestClient.allProducts().getContent();
			Long customerId = 1L;
			Customer customer = customerRestClient.findCustomerById(customerId);
			if(customer == null) throw new RuntimeException("Customer not found");
			Bill bill = new Bill();
			bill.setBillingDate(new Date());
			bill.setCustomerId(customerId);
			Bill saveBill = billRepository.save(bill);
			products.forEach(
					p->{
						ProductItem productItem = new ProductItem();
						productItem.setBill(saveBill);
						productItem.setQuantity(1 + new Random().nextInt(10));
						productItem.setPrice(p.getPrice());
						productItem.setProductId(p.getId());
						productItem.setDiscount(Math.random());
						prductItemRepository.save(productItem);
					}
			);
		};
	}

}
