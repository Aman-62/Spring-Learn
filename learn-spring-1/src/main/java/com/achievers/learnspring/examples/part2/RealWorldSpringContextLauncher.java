package com.achievers.learnspring.examples.part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

interface DataService {
    public int[] retrieveData();
}

//@Component
@Repository
@Primary
class MongoDbDataService implements DataService {
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    };
}

//@Component
@Repository
class MySqlDbDataService implements DataService {
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    };
}

//@Component
@Service
class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService (DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncher {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncher.class);

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());

    }
}
