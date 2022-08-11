package com.alok.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Accounts {

    @Id
    @Column(name="ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name="ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "BRANCH_ADDRESS")
    private String branchAddress;
    @Column(name = "CREATE_DT")
    private String createDt;
}
