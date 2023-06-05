package com.example.darna.dao.entities;


import com.example.darna.dao.entities.enums.RoleType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name="id")
    int id;
    String username ;
    String password ;
    String email;
    String tel;
    String adresse;
    Date date_creation;

    @Enumerated(EnumType.STRING)
    RoleType roleType;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> role ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Article> article ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<History> history;
    @OneToMany(mappedBy = "user")
    public List<Reclamation> reclamations= new ArrayList<>();
@OneToMany(mappedBy = "user")
    public List<Commentaire> commentaires=new ArrayList<>();

}
