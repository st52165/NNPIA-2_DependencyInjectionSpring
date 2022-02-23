package cz.upce.nnpia.dispring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    EmailService emailService;

    public void publishArticle() {
        //publish article code
        emailService.sendEmail("fanda.silar@email.cz", "Hello Fanda! New article was published.");
    }
}
