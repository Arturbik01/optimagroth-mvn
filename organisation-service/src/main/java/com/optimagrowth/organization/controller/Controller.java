package com.optimagrowth.organization.controller;

import com.optimagrowth.organization.model.Organization;
import com.optimagrowth.organization.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/organization")
public class Controller {

    private final OrganizationService organizationService;

    public Controller(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping(value = "/{organizationId}")
    public ResponseEntity<Organization> findOrganization(@PathVariable String organizationId) {
        return ResponseEntity.ok(organizationService.findById(organizationId));
    }

    @PutMapping(value = "/{organizationId}")
    public void update(@PathVariable String organizationId, @RequestBody Organization organization) {
        organizationService.update(organization);
    }

    @PostMapping()
    public ResponseEntity<Organization> save(@RequestBody Organization organization) {
        return ResponseEntity.ok(organizationService.create(organization));
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Organization organization) {
        organizationService.delete(organization);
    }
}
