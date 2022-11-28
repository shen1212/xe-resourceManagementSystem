package com.rms.ResourceManagementAPI.repository;

import com.rms.ResourceManagementAPI.model.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContractorRepository extends JpaRepository<Contractor, UUID> {
}
