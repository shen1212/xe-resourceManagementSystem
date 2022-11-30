package com.rms.ResourceManagementAPI.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(generator = "uuid4")
    @GenericGenerator(name = "UUID", strategy = "uuid4")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)",name="USER_ID")
    private UUID id;

    @Column(name="EID")
    private String eid;
    @Column(name="name")
    private String name;
    @Column(name="full_name")
    private String fullName;
    @Column(name="nick_name")
    private String nickName;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="is_contractor")
    private String isContractor;
    @Column(name="job_title")
    private String jobTitle;
    @Column(name="role")
    private String role;
    @Column(name="tribe")
    private String tribe;

    //ORIGINAL CODE for list of squads column but had foreign key delete issue.
    //    @ElementCollection
    //    private List<String> squads;

    //May be unstable squads
    @ElementCollection
    @CollectionTable(name="user_squads",joinColumns = @JoinColumn(name="user_id"))
    @MapKeyColumn(name = "squads_key")
    @Column(name="squads_value")
    @JoinColumn(name="user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Cascade(value={CascadeType.ALL})
    private List<String> squads;


    //ORIGINAL CODE for list of skillset column but had foreign key delete issue.
    //    @ElementCollection
    //    private List<String> skillset;

    //May be unstable skillset
    @ElementCollection
    @CollectionTable(name="user_skillset",joinColumns = @JoinColumn(name="user_id"))
    @MapKeyColumn(name = "skillset_key")
    @Column(name="skillset_value")
    @JoinColumn(name="user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Cascade(value={CascadeType.ALL})
    private List<String> skillset;

    @Column(name="status")
    private String status;

    @Column(name="password")
    private String password;
    @Column(name="user_type")
    private String userType;

    public User() {}


}
