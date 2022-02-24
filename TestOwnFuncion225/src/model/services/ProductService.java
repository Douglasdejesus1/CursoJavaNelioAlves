package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filtreredSum(List<Product>list, Predicate<Product>criateria) {
		double sum=0.0;
		for(Product p: list) {
			if(criateria.test(p)) {
				sum+=p.getPrice();
			}
		}
	return sum;
	}
	

}
