package cz.upce.nnpia.dispring.demo;

import cz.upce.nnpia.dispring.demo.service.ArticleService;
import cz.upce.nnpia.dispring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {
    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext("cz.upce.nnpia.dispring.demo");
        context.getBean(Application.class).process();
    }

    private void process() {
        userService.createAccount();
        articleService.publishArticle();
    }
}
