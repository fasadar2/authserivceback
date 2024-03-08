package com.example.vursachbacklogin.repsoitory.subRepos;

import com.example.vursachbacklogin.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    Organization getOrganizationById(int id);
}
