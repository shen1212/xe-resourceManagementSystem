package com.rms.ResourceManagementAPI.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table
public class Contractor {

//    @Id
//    @GeneratedValue(generator = "uuid4")
//    @GenericGenerator(name = "UUID", strategy = "uuid4")
//    @Type(type = "org.hibernate.type.UUIDCharType")
//    @Column(columnDefinition = "CHAR(36)")
//    private UUID contractorId;

    @Id
    @Column(name="CONTRACTOR_ID",columnDefinition = "CHAR(36)")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID contractorId;

    @JsonFormat(pattern="yyyy-mm-dd")
    private Date first_start_date;

    @JsonFormat(pattern="yyyy-mm-dd")
    private Date latest_start_date;

    @JsonFormat(pattern="yyyy-mm-dd")
    private Date latest_end_date;

    private String company;

    private String country;

    private String contractorStatus;

//    @OneToOne(cascade = CascadeType.ALL, optional = false)
//    @PrimaryKeyJoinColumn(name = "contractor_id", referencedColumnName = "id")
//    private User user;

//    @OneToOne(fetch=FetchType.LAZY)
//    @MapsId
//    @JoinColumn(name="user_id")
//    private User user;

    public Contractor(){}

    public UUID getContractorId() {
        return contractorId;
    }

    public void setContractorId(UUID contractorId) {
        this.contractorId = contractorId;
    }

    public Date getFirst_start_date() {
        return first_start_date;
    }

    public void setFirst_start_date(Date first_start_date) {
        this.first_start_date = first_start_date;
    }

    public Date getLatest_start_date() {
        return latest_start_date;
    }

    public void setLatest_start_date(Date latest_start_date) {
        this.latest_start_date = latest_start_date;
    }

    public Date getLatest_end_date() {
        return latest_end_date;
    }

    public void setLatest_end_date(Date latest_end_date) {
        this.latest_end_date = latest_end_date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContractorStatus() {
        return contractorStatus;
    }

    public void setContractorStatus(String contractorStatus) {
        this.contractorStatus = contractorStatus;
    }
}
