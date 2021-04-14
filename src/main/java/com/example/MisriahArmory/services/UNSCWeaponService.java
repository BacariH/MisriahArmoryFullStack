package com.example.MisriahArmory.services;

import com.example.MisriahArmory.exceptions.WeaponNotFoundException;
import com.example.MisriahArmory.models.UNSCWeapon;
import com.example.MisriahArmory.repos.UNSCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UNSCWeaponService {

    private UNSCRepository unscRepository;

    @Autowired
    public UNSCWeaponService(UNSCRepository unscRepository){ this.unscRepository = unscRepository;}

    public UNSCWeapon addUNSCWeapon(UNSCWeapon unscWeapon){
        return unscRepository.save(unscWeapon);
    }

    public Iterable<UNSCWeapon> findAllUNSCWeapons() {return unscRepository.findAll();}

    public UNSCWeapon findUNSCWeaponById(int id){
        return unscRepository.findById(id).orElseThrow(() -> new WeaponNotFoundException("Weapon by this id: " + id +" was not found."));
    }

}
