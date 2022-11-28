package com.rms.ResourceManagementAPI.model;

import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(generator = "uuid4")
    @GenericGenerator(name = "UUID", strategy = "uuid4")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)",name="USER_ID")
    private UUID id;

    @Column
    private String EID;
    @Column
    private String name;
    @Column
    private String fullName;
    @Column
    private String nickName;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String isContractor;
    @Column
    private String jobTitle;
    @Column
    private String role;
    @Column
    private String tribe;
    @ElementCollection
    private List<String> squads;
    @Column
    private String status;
    @ElementCollection
    private List<String> skillset;
    @Column
    private String password;
    @Column
    private String userType;

    public User() {}

//    @OneToOne
//    @PrimaryKeyJoinColumn
//    private Contractor contractor;

//    @OneToOne(cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Contractor contractor;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsContractor() {
        return isContractor;
    }

    public void setIsContractor(String isContractor) {
        this.isContractor = isContractor;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public List<String> getSquads() {
        return squads;
    }

    public void setSquads(List<String> squads) {
        this.squads = squads;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(List<String> skillset) {
        this.skillset = skillset;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
