package com.tianjiaxu.controller;

import com.tianjiaxu.entity.Menu;
import com.tianjiaxu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RequestMapping("/menu")
@RestController
public class MenuController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/index")
    public String index() {
        return port;
    };

    @GetMapping("/findAll")
    public List<Menu> findAll(){
        return menuRepository.findAll();
    }


}
