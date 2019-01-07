package ru.itpark;

import ru.itpark.comparator.SortingByNameComparator;
import ru.itpark.comparator.SortingByPriceComparator;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Product;
import ru.itpark.domain.Video;
import ru.itpark.domain.Сlothes;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new ProductRepository());
        service.add(new Video(1, "Sony", "Home theatr", 30_000, "4K resolution support", "black"));
        service.add(new Video(2, "IconBit", "Media player", 4_090, "Built-In Wi-Fi", "black"));
        service.add(new Сlothes(3, "Nike", "Men's sportswear", 7_140, "Men", 52));
        service.add(new Сlothes(4, "Reebok", "Women's sports shoes", 5_340,"Women", 36));
        service.add(new Computer(5, "Nexport", "Home", 27_810, "Radeon", "AMD"));
        service.add(new Computer(6, "MXP", "Game", 104_990, "Nvidia", "Intel"));

        List<Product> sortByName = service.findAllName("Nike");
        sortByName.sort(new SortingByNameComparator());
        System.out.println(sortByName);

        List<Product> findByCategory = service.findByCategory("Home");
        findByCategory.sort(new SortingByNameComparator());
        System.out.println(findByCategory);

        System.out.println(service.getAllSorted(new SortingByPriceComparator()));
    }
}
