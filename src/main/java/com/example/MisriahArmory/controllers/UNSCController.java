package com.example.MisriahArmory.controllers;

import com.example.MisriahArmory.models.UNSCWeapon;
import com.example.MisriahArmory.repos.UNSCRepository;
import com.example.MisriahArmory.services.UNSCWeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UNSC")
public class UNSCController {

    private UNSCWeaponService unscWeaponService;

    @Autowired
   public UNSCController(UNSCWeaponService unscWeaponService){this.unscWeaponService = unscWeaponService;}

   @GetMapping("/all")
    public ResponseEntity<Iterable<UNSCWeapon>> getAllUNSCWeapons(){
        Iterable<UNSCWeapon> unscWeapons = unscWeaponService.findAllUNSCWeapons();
        return new ResponseEntity<>(unscWeapons, HttpStatus.OK);
   }

   //making a find by id function for the unsc weapon
    //if it was completed successfully then a 201 status will be sent
   @GetMapping("/find/{id}")
    public ResponseEntity<UNSCWeapon> findUNSCWeaponById(@PathVariable("id") int id){
        UNSCWeapon unscWeapon = unscWeaponService.findUNSCWeaponById(id);
        return new ResponseEntity<>(unscWeapon, HttpStatus.OK);
   }

   //Posting to the database the data we want to add
   @PostMapping("weapon/add")
    public ResponseEntity<UNSCWeapon> addUNSCWeapon(@RequestBody UNSCWeapon unscWeapon){
        UNSCWeapon newlyAddedWeapon = unscWeaponService.addUNSCWeapon(unscWeapon);
        return new ResponseEntity<>(newlyAddedWeapon, HttpStatus.CREATED);
   }

}
