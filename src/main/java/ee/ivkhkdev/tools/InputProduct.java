package ee.ivkhkdev.tools;

import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Customer;
import ee.ivkhkdev.model.Product;

public class InputProduct {
    public Product newProduct(Input input) {
        Product product = new Product();
        System.out.print("Назваине товара: ");
        product.setName(input.nextLine());
        System.out.print("Кол.Товара: ");
        product.setCount(input.nextInt());
        System.out.print("Цена: ");
        product.setCost(input.nextInt());
        return product;
    }
}

