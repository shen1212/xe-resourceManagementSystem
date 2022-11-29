package com.rms.ResourceManagementAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.math.BigInteger;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AvgPriority  {

      String SQUAD;
      String TRIBE;
      BigInteger EMPL_NUMBER;
      double AVGPRIORITY;

     public double getAVGPRIORITY() {
          return AVGPRIORITY;
     }

     public void setAVGPRIORITY(double AVGPRIORITY) {
          this.AVGPRIORITY = AVGPRIORITY;
     }

     public BigInteger getEMPL_NUMBER() {
          return EMPL_NUMBER;
     }

     public void setEMPL_NUMBER(BigInteger EMPL_NUMBER) {
          this.EMPL_NUMBER = EMPL_NUMBER;
     }

     public String getSQUAD() {
          return SQUAD;
     }

     public void setSQUAD(String SQUAD) {
          this.SQUAD = SQUAD;
     }

     public String getTRIBE() {
          return TRIBE;
     }

     public void setTRIBE(String TRIBE) {
          this.TRIBE = TRIBE;
     }



}