package com.alok.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.sql.Date;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loans {

        @Id
        @Column(name = "LOAN_NUMBER")
        private String loanNumber;
        @Column(name = "CUSTOMER_ID")
        private int customerId;

        @Column(name = "START_DT")
        private Date startDate;

        @Column(name = "LOAN_TYPE")
        private String loanType;

        @Column(name = "TOTAL_LOAN")
        private int totalLoan;

        @Column(name = "AMOUNT_PAID")
        private int amountPaid;

        @Column(name = "OUTSTANDING_AMOUNT")
        private int outstandingAmount;

        @Column(name = "CREATE_DT")
        private String createDt;

    }
