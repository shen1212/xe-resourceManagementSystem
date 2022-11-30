package com.rms.ResourceManagementAPI.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
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

}
