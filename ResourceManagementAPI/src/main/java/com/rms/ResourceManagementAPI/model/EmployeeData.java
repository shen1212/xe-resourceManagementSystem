package com.rms.ResourceManagementAPI.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeData {
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @JsonFormat(pattern="yyyy-mm-dd")
    @Column(name="end_contract")
    private Date end_contract;
    @Column(name="priority")
    private Integer priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEnd_contract() {
        return end_contract;
    }

    public void setEnd_contract(Date end_contract) {
        this.end_contract = new Date(end_contract.getTime());
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
