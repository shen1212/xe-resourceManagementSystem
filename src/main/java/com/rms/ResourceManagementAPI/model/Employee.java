package com.rms.ResourceManagementAPI.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
@NamedNativeQuery(name = "Employee.findSquadPriority",
        query = "SELECT e.squad as squad,e.tribe as tribe, COUNT(e.squad) as empl_number, ROUND(AVG(CASE WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=90 THEN 3 WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=120 THEN 2 ELSE 1 END)) as AVGPRIORITY FROM employee e GROUP BY e.squad, e.tribe",
        resultSetMapping = "Mapping.AvgPriority")
@SqlResultSetMapping(name = "Mapping.AvgPriority", classes = @ConstructorResult(targetClass = AvgPriority.class,
        columns = {@ColumnResult(name = "squad"),
        @ColumnResult(name = "tribe"), @ColumnResult(name = "empl_number"), @ColumnResult(name = "AVGPRIORITY")}))
@NamedNativeQuery(name = "Employee.findEmpData",
        query = "SELECT e.NAME as name, e.EMAIL as email, e.end_date as end_contract, (CASE WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=90 THEN 3 WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=120 THEN 2 ELSE 1 END) as Priority FROM employee e WHERE e.squad= :squad",
        resultSetMapping = "Mapping.EmployeeData")
@SqlResultSetMapping(name = "Mapping.EmployeeData", classes = @ConstructorResult(targetClass = EmployeeData.class,
        columns = {@ColumnResult(name = "name"),
                @ColumnResult(name = "email"), @ColumnResult(name = "end_contract"), @ColumnResult(name = "priority")}))

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String full_name;
    private String nick_name;
    private String email;
    private String phone_number;
    private String contractor;
    private String job_title;
    private String role;
    private String tribe;
    private String squad;
    private String status;
    private String skillsets;
    private String password;
    private String usertype;
    private Date end_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
