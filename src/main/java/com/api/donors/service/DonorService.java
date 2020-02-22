package com.api.donors.service;

import com.api.donors.model.Donor;

import java.util.List;

public interface DonorService {
    List<Donor> findAll();
    Donor findById(String id);
    void saveOrUpdateDonor(Donor student);
    void deleteDonor(String id);
}