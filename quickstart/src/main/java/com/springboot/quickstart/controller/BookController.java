package com.springboot.quickstart.controller;

import com.springboot.quickstart.dao.BookDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resources;

public class BookController {
    //注入
    @Resources()
    private BookDao bookDao;

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public
}
