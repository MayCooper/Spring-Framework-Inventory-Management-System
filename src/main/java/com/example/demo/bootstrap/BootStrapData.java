package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // Clearing repositories for multiple test runs
        // partRepository.deleteAll();
        // productRepository.deleteAll();
        // outsourcedPartRepository.deleteAll();

        if (partRepository.count() == 0) {
            OutsourcedPart motor = new OutsourcedPart();
            motor.setCompanyName("DroneParts Co");
            motor.setName("Motor");
            motor.setPrice(50.0);
            motor.setInv(10);
            motor.setMinimum(1);
            motor.setMaximum(20);

            OutsourcedPart propeller = new OutsourcedPart();
            propeller.setCompanyName("Propeller Inc.");
            propeller.setName("Propeller");
            propeller.setPrice(5.0);
            propeller.setInv(100);
            propeller.setMinimum(10);
            propeller.setMaximum(200);

            OutsourcedPart camera = new OutsourcedPart();
            camera.setCompanyName("CameraTech");
            camera.setName("Camera");
            camera.setPrice(150.0);
            camera.setInv(15);
            camera.setMinimum(1);
            camera.setMaximum(30);

            OutsourcedPart battery = new OutsourcedPart();
            battery.setCompanyName("BatteryWorld");
            battery.setName("Battery");
            battery.setPrice(40.0);
            battery.setInv(25);
            battery.setMinimum(5);
            battery.setMaximum(50);

            OutsourcedPart controller = new OutsourcedPart();
            controller.setCompanyName("ControlSystems");
            controller.setName("Controller");
            controller.setPrice(60.0);
            controller.setInv(30);
            controller.setMinimum(2);
            controller.setMaximum(40);

            partRepository.save(motor);
            partRepository.save(propeller);
            partRepository.save(camera);
            partRepository.save(battery);
            partRepository.save(controller);
        }

        if (productRepository.count() == 0) {
            Product quadcopter = new Product("Quadcopter", 500.0, 10);
            Product racingDrone = new Product("Racing Drone", 700.0, 5);
            Product cameraDrone = new Product("Camera Drone", 800.0, 8);
            Product sparePartsKit = new Product("Spare Parts Kit", 100.0, 20);
            Product miniDrone = new Product("Mini Drone", 300.0, 12);

            productRepository.save(quadcopter);
            productRepository.save(racingDrone);
            productRepository.save(cameraDrone);
            productRepository.save(sparePartsKit);
            productRepository.save(miniDrone);
        }

        System.out.println("Sample inventory added");

        // Debugging information to verify parts and products
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

        List<Product> products = (List<Product>) productRepository.findAll();
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getInv()); // Assuming getInv() is the method to get the inventory
            for (Part part : product.getParts()) {
                System.out.println(" - " + part.getName());
            }
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + partRepository.count());
        System.out.println(partRepository.findAll());
    }

    // Search functionality
    public List<Product> searchProducts(String keyword) {
        return productRepository.search(keyword);
    }

    public List<Part> searchParts(String keyword) {
        // Assuming a similar search method is available for PartRepository
        return partRepository.search(keyword);
    }
}
