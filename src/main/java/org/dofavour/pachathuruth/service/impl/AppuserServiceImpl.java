package org.dofavour.pachathuruth.service.impl;

import org.dofavour.pachathuruth.entity.Appuser;
import org.dofavour.pachathuruth.repository.AppuserRepository;
import org.dofavour.pachathuruth.service.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppuserServiceImpl implements AppuserService {

    @Autowired
    private AppuserRepository appuserRepository ;


    public Iterable<Appuser> listAppusers(){

        return appuserRepository.findAll();

    }

    public Appuser findAppuserByusername(String username){
        return appuserRepository.findByUsername(username);
    }

    @Override
    public void addUser(Appuser appuser) {

        appuserRepository.save(appuser);

    }

    @Override
    public void updateUser(Appuser appuser) {
        appuserRepository.save(appuser);
    }


}
