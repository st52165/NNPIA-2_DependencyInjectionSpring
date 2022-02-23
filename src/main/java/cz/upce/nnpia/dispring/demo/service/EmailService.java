package cz.upce.nnpia.dispring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public EmailService() {
        System.out.println("New EmailService instance created!");
    }

    public void sendEmail(String to, String body) {
        System.out.println("Sending email to " + to + " with body:\n" + body);
    }
}
