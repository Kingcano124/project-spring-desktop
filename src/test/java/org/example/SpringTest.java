package org.example;

import com.projectSpring.dao.DisqueraDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

import static org.junit.Assert.assertNotNull;

public class SpringTest {

    @Test
    public void testContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        assertNotNull(context);
        System.out.println("Contexto cargado correctamente.");

        DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
        assertNotNull(disqueraDAO);
        System.out.println(disqueraDAO);


        //:::::::::Properties

        Properties properties = (Properties) context.getBean("properties");
        System.out.println(properties.get("spring-username"));
    }

}
