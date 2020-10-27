package org.dofavour.pachathuruth.controller;

import org.dofavour.pachathuruth.entity.Appuser;
import org.dofavour.pachathuruth.repository.AppuserRepository;
import org.dofavour.pachathuruth.service.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppuserController {

    @Autowired
    AppuserService appuserService;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Appuser> getAllUsers() {

        return appuserService.listAppusers();
    }

    @GetMapping(path="/user/{username}")
    public @ResponseBody Appuser getAllUsers(@PathVariable String username) {

        return appuserService.findAppuserByusername(username);
    }
}
