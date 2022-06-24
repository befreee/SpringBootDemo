package org.ostretsov.spd.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "developers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
