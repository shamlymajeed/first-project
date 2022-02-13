package org.dofavour.pachathuruth.controller;

import org.dofavour.pachathuruth.entity.Appuser;
import org.dofavour.pachathuruth.service.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppuserController {
    @Autowired
    AppuserService appuserService;

//test merge log commits 1
//test merge log commits 1
//another test commit
    @RequestMapping(path="/all")
    public  Iterable<Appuser> getAllUsers() {

        return appuserService.listAppusers();
    }

    @GetMapping(path="/user/{username}")
    public  Appuser getAllUsers(@PathVariable String username) {

        return appuserService.findAppuserByusername(username);
    }
    @PostMapping(path="/addUser")
    public void addUser(@RequestBody Appuser appuser){
        appuserService.addUser(appuser);

    }

    @PutMapping(path="/updateuser/{id}")
    public void updateUser(@PathVariable int id,@RequestBody Appuser appuser){
        appuser.setId(id);
        appuserService.updateUser(appuser);

    }
}
