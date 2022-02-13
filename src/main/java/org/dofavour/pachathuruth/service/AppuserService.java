package org.dofavour.pachathuruth.service;

import org.dofavour.pachathuruth.entity.Appuser;

public interface AppuserService {

    public  Iterable<Appuser>  listAppusers();

    public Appuser findAppuserByusername(String username);
    public void addUser(Appuser appuser);

    public void updateUser(Appuser appuser);
}
