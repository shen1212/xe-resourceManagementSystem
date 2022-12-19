package com.rms.ResourceManagementAPI.model;

import lombok.*;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.math.BigInteger;
import java.util.List;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AvgPriority  {

      String squad;
      String tribe;
      BigInteger empl_number;
      double avgpriority;

}