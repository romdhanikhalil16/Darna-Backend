package com.example.darna.dao.entities;

import com.example.darna.dao.entities.enums.TypeArticle;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name="id")
    int id;
    float montant;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
    String title;
    @Temporal(TemporalType.DATE)
    Date date_modification;
    @Temporal(TemporalType.DATE)
    Date date_creation;
    @OneToOne
    private Criteria criteria ;
    @OneToOne
    private Forum forum ;
    @OneToOne
    private Adresse adresse ;


}
