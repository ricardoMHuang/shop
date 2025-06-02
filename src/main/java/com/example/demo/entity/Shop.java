package com.example.demo.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    private Integer id;

    private String name;

    private String address;

    private String area;

    private Integer typeId;

    private String tenantName;

    private String phone;

    private Date rentStartDate;

    private Date rentEndDate;

    private BigDecimal monthlyRent;

    private Boolean isVacant;

    private Boolean hasArrears;

    private Date lastPaymentDate;

    private Integer createdBy;

    private Date createdAt;

    private Date updatedAt;

    private String notes;

}