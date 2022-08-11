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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Notice {

    @Id
    @Column(name = "NOTICE_ID")
    private String noticeId;

    @Column(name = "NOTICE_SUMMARY")
    private String noticeSummary;

    @Column(name = "NOTICE_DETAILS")
    private String noticeDetails;

    @Column(name = "NOTICE_BEG_DT")
    private Date noticBegDt;

    @Column(name = "NOTICE_END_DT")
    private Date noticEndDt;

    @Column(name = "CREATE_DT")
    private Date createDt;

    @Column(name = "UPDATE_DT")
    private Date updateDt;
}
