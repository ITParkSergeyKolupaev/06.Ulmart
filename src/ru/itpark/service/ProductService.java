package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getAllSorted(Comparator<Product> comparator) {
        List<Product> resultSorted = repository.getAll();
        resultSorted.sort(comparator);
        return resultSorted;
    }

    public List<Product> findByCategory(String category) {
        List<Product> findCategory = new ArrayList<>();
        category = category.toLowerCase();

        for (Product product : repository.getAll()) {
            if (product.getCategory().toLowerCase().contains(category)) {
                findCategory.add(product);
            }
        }
        return findCategory;
    }

    public List<Product> findAllName(String name) {
        List<Product> findName = new ArrayList<>();
        name = name.toLowerCase();

        for (Product product : repository.getAll()) {
            if (product.getName().toLowerCase().contains(name)) {
                findName.add(product);
            }
        }
        return findName;
    }
}
