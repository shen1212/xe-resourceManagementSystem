package com.rms.ResourceManagementAPI.controller;

import com.rms.ResourceManagementAPI.model.Contractor;
import com.rms.ResourceManagementAPI.model.User;
import com.rms.ResourceManagementAPI.response.ResponseHandler;
import com.rms.ResourceManagementAPI.service.ContractorService;
import com.rms.ResourceManagementAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    private ContractorService contractorService;

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody Contractor contractor){
        //Check if there's existing user with given user_id
        //if no, throw bad request
        //else, add contractor data with an existing user_id

//        contractorService.saveContractor(contractor);
//        System.out.println("Contractor ID given: "+contractor.getContractorId());
//        return "New contractor added";

        if(userService.existsUserByUserId(contractor.getContractorId())){
            System.out.println("Contractor ID given: "+contractor.getContractorId());
            contractorService.saveContractor(contractor);
            return "New contractor added";
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND).toString();
        }

        //**When a specific user is deleted, check if there's a contract with same user_id
        //if got, then delete contractor row with user_id
        //else continue


    }

//    @PostMapping("/add")
//    public String add(@PathVariable(value="user_id") UUID user_id,
//                      @RequestBody Contractor contractor){
//        Optional<User> user = userService.getSpecificUser(user_id);
//        contractor.setId(user_id);
//        contractorService.saveContractor(contractor);
//        return "New contractor added";
//    }



    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllContractors(){
        return ResponseHandler.reponseBuilder("Requested All Contractors",
                HttpStatus.OK,
                contractorService.getAllContractors());
    }


    @GetMapping("/{contractorUUID}")
    public ResponseEntity<Object> getSpecificContractor(@PathVariable("contractorUUID") UUID contractorUUID) {
        return ResponseHandler.reponseBuilder("Requested Specific Contractor",
                HttpStatus.OK,
                contractorService.getSpecificContractor(contractorUUID));
    }
}
