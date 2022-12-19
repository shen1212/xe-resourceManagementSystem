package com.rms.ResourceManagementAPI.dao;

import com.rms.ResourceManagementAPI.model.AvgPriority;
import com.rms.ResourceManagementAPI.service.DashboardDataService;
import com.rms.ResourceManagementAPI.model.Dashboard_Data;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDataInterface{
    List<Dashboard_Data> FEDashboardReponse();
}
