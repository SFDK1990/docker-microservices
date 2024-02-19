package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter@Setter@ToString
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private  LocalDateTime updateAt;

    @Column(insertable = false)
    private String updateBy;

}
