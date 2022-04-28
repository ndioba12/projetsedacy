package org.edacy.rssfeeds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**@author ndiane*/

@SpringBootApplication
@EnableWebMvc
public class EdacyApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(EdacyApplication.class, args);

    }


}
