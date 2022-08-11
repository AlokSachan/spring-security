package com.alok.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.sql.Date;

@Document(collection = "CONTACT_MESSAGES")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Contact {

    @Id
    @Column(name = "CONTACT_ID")
    private String contactId;
    @Column(name = "CONTACT_NAME")
    private String contactName;
    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "CREATE_DT")
    private Date createDt;
}
