package com.api.donors.configuration;

import com.api.donors.model.Donor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;d

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Donor.class);
    }
}
