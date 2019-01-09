package org.sd.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 董文强
 * @version 1.0
 * @date 2018年12月18日
 */

@Controller
@RequestMapping("/user")
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);


    @GetMapping
    public void getUser(Integer id) {
        return;
    }

    @PostMapping
    public void addUser(){

    }
    @DeleteMapping
    public void deleteUser(){

    }
    @PutMapping
    public void updateUser(){

    }

}
