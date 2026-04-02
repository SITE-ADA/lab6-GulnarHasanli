package az.edu.ada.wm2.lab6;

import az.edu.ada.wm2.lab6.model.Category;
//import az.edu.ada.wm2.lab6.model.Product;
import az.edu.ada.wm2.lab6.repository.CategoryRepository;
import az.edu.ada.wm2.lab6.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseLoader {

    @Bean
    CommandLineRunner loadData(CategoryRepository categoryRepository) {
        return args -> {

            Category c1 = new Category();
            c1.setName("Laptop");

            Category c2 = new Category();
            c2.setName("Phone");

            Category c3 = new Category();
            c3.setName("Headphones");

            categoryRepository.saveAll(List.of(c1,c2,c3));

            System.out.println("Category loaded!");
        };
    }
}