package com.alok.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.sql.Date;

import javax.persistence.Column;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountTransactions {

    @Id
    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name="ACCOUNT_NUMBER")
    private long accountNumber;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name="TRANSACTION_DT")
    private Date transactionDt;

    @Column(name = "TRANSACTION_SUMMARY")
    private String transactionSummary;

    @Column(name="TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "TRANSACTION_AMT")
    private int transactionAmt;

    @Column(name = "CLOSING_BALANCE")
    private int closingBalance;

    @Column(name = "CREATE_DT")
    private String createDt;
}
