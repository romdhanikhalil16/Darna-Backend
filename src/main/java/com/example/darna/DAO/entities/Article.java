package com.example.darna.DAO.entities;

import com.example.darna.DAO.entities.enums.TypeArticle;
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
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    float montant;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
    String title;
    @Temporal(TemporalType.DATE)
    Date date_modification;
    @Temporal(TemporalType.DATE)
    Date date_creation;




}
