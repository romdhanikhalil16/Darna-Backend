package com.example.darna.dao.entities;


import com.example.darna.dao.entities.enums.RoleType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String username ;
    String password ;
    String email;
    String tel;
    String adresse;
    Date date_creation;
    @Enumerated(EnumType.STRING)
    RoleType roleType;



}
