package com.api.donors.controller;

import com.api.donors.model.Donor;
import com.api.donors.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {
    @Autowired
    private DonorService service;

    @GetMapping(value = "/")
    public List<Donor> getAllDonors() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Donor getDonorById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Donor donor) {
        service.saveOrUpdateDonor(donor);
        return new ResponseEntity("Donor added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDonor(@PathVariable String id) {
        service.deleteDonor(id);
    }
}
