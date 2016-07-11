package net.javacasts.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javacasts.example.props.Document;
import net.javacasts.example.props.DocumentService;

@SpringBootApplication
public class NullPointerApplication implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(NullPointerApplication.class);

    @Autowired
    private DocumentService     documents;

    public static void main(String[] args) {
        SpringApplication.run(NullPointerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        Document document = documents.find(123l);
        if (document != null && document.isPublic()) {
            LOGGER.info("Found document: " + document.getName());
        } else {
            LOGGER.info("Could not find document");
        }

    }

}
