package com.zouqiang.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zouqiang.entity.Book2;
import com.zouqiang.utils.Log4j2;

@Controller
public class BookController3 {
    @RequestMapping(value = "/sendxml", method = RequestMethod.POST)
    public @ResponseBody
    Book2 sendxml(@RequestBody Book2 book2) {
        Log4j2.logger.info(book2);
        Log4j2.logger.info("接收XML数据成功！");
        return book2;
    }

    @RequestMapping(value = "/readxml", method = RequestMethod.POST)
    public @ResponseBody
    Book2 readXml() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Book2.class);
        Unmarshaller unmar = context.createUnmarshaller();
        File file = new File("D:/Git Project/YxWebServer/WebRoot/book.xml");
        InputStream is = new FileInputStream(file);
        Book2 book3 = (Book2) unmar.unmarshal(is);
        Log4j2.logger.info(book3);
        return book3;
    }
}
