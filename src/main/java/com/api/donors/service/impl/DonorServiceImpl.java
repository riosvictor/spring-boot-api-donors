package com.api.donors.service.impl;

import com.api.donors.model.Donor;
import com.api.donors.repository.DonorRepository;
import com.api.donors.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {
    @Autowired
    private DonorRepository repository;

    @Override
    public List<Donor> findAll() {
        return repository.findAll();
    }

    @Override
    public Donor findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdateDonor(Donor donor) {
        repository.save(donor);
    }

    @Override
    public void deleteDonor(String id) {
        repository.deleteById(id);
    }
}
