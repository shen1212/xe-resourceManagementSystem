package com.rms.ResourceManagementAPI.Service;

import com.rms.ResourceManagementAPI.dao.EmployeeRepository;
import com.rms.ResourceManagementAPI.model.AvgPriority;
import com.rms.ResourceManagementAPI.model.Dashboard_Data;
import com.rms.ResourceManagementAPI.dao.EmployeeDataInterface;
import com.rms.ResourceManagementAPI.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DashboardDataService implements EmployeeDataInterface{
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Dashboard_Data> FEDashboardReponse (){
        List<AvgPriority> squadInfo = repository.findSquadPriority();
        List<Dashboard_Data> result = new ArrayList<>();


        for (AvgPriority x: squadInfo){
            Dashboard_Data new_result = new Dashboard_Data(x.getSQUAD(), x.getTRIBE(), x.getEMPL_NUMBER(), x.getAVGPRIORITY(), null);
            List<EmployeeData> empData = repository.findEmpData(x.getSQUAD());
            new_result.setEmpData(empData);
            result.add(new_result);
        }
        return result;
    }

}
