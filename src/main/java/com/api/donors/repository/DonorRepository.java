package com.api.donors.repository;

import com.api.donors.model.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "donors", path = "donors")
public interface DonorRepository extends MongoRepository<Donor, String> {
    Donor findByName(@Param("name") String name);
}
