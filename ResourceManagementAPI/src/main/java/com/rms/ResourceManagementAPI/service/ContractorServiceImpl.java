package com.rms.ResourceManagementAPI.service;

import com.rms.ResourceManagementAPI.entity.Contractor;
import com.rms.ResourceManagementAPI.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContractorServiceImpl implements ContractorService{
    @Autowired
    private ContractorRepository contractorRepository;

    @Override
    public Contractor saveContractor(Contractor contractor) {
        return contractorRepository.save(contractor);
    }

    @Override
    public List<Contractor> getAllContractors() {
        return contractorRepository.findAll();
    }

    @Override
    public Optional<Contractor> getSpecificContractor(UUID contractorUUID) {
        //if else and throw 404 if not found.
        return contractorRepository.findById(contractorUUID);

//         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
