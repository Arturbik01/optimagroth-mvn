package com.optimagrowth.organization.service;

import com.optimagrowth.organization.model.Organization;
import com.optimagrowth.organization.repository.OrganizationRepo;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Service
public class OrganizationService {

    private final OrganizationRepo organizationRepo;

    public OrganizationService(OrganizationRepo organizationRepo) {
        this.organizationRepo = organizationRepo;
    }

    public Organization findById(@NotNull String organizationId){
        return organizationRepo.findById(organizationId).orElse(null);
    }

    public Organization create(Organization organization){
        organization.setId(UUID.randomUUID().toString());
        organizationRepo.save(organization);
        return organization;
    }

    public void update(Organization organization){
        organizationRepo.save(organization);
    }

    public void delete(Organization organization){
        organizationRepo.delete(organization);
    }


}
