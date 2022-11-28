package com.rms.ResourceManagementAPI.service;

import com.rms.ResourceManagementAPI.model.Contractor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContractorService {

    public Contractor saveContractor(Contractor contractor);
    public List<Contractor> getAllContractors();
    public Optional<Contractor> getSpecificContractor(UUID contractorUUID);

}
