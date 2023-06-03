package com.example.darna.entities;


import com.example.darna.entities.enums.RoleType;
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
    int user_id;
    String username ;
    String password ;
    String email;
    String tel;
    String adresse;
    Date date_creation;
    @Enumerated(EnumType.STRING)
    RoleType roleType;



}
