package org.dofavour.pachathuruth.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="appuser ")// This tells Hibernate to make a table out of this class
public class Appuser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    @CreatedDate
    @Column(name="created_date")
    private Date createdDate;

    @LastModifiedDate
    @Column(name="modified_date")
    private Date modifiedDate;

}



