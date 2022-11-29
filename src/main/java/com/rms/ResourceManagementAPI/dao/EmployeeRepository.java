package com.rms.ResourceManagementAPI.dao;

import com.rms.ResourceManagementAPI.model.AvgPriority;
import com.rms.ResourceManagementAPI.model.Employee;
import com.rms.ResourceManagementAPI.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

    List<Employee> findByTribe(String tribe);

    @Query(nativeQuery = true, value = "SELECT NAME, EMAIL, end_date, (CASE WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=90 THEN 3 WHEN DATEDIFF(dd, CURRENT_DATE(), e.end_date)<=120 THEN 2 ELSE 1 END) as Priority FROM employee e WHERE squad = {0}")
    List<Employee> findBySquad(String squad);


    @Query(nativeQuery = true)
    List<AvgPriority> findSquadPriority();

    @Query(nativeQuery = true)
    List<EmployeeData> findEmpData(String squad);
}
