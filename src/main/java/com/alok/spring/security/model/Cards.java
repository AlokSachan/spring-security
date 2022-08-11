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
public class Cards {
    @Id
    @Column(name = "CARD_ID")
    private String cardId;
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "CARD_TYPE")
    private String cardType;
    @Column(name = "TOTAL_LIMIT")
    private int totalLimit;
    @Column(name = "AMOUNT_USED")
    private int amountUsed;
    @Column(name = "CREATE_DATE")
    private Date date;

}
