package org.slin.app.doorkeeper.controller;

import org.slin.app.doorkeeper.entity.News;
import org.slin.app.doorkeeper.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getHome () {
        News news = new News();

        newsRepository.save(news);
        return "home:".concat(String.valueOf(System.currentTimeMillis()));
    }
}
