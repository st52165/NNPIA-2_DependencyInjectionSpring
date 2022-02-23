package cz.upce.nnpia.dispring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    EmailService emailService;

    public void createAccount() {
        System.out.println("Account created!");
        emailService.sendEmail("fanda.silar@email.cz", "Hello Fanda!");
    }
}
