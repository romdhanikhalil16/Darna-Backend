package com.example.darna.entities;

import com.example.darna.entities.enums.TypeArticle;
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
    int article_id;
    float montant;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
    String title;

    Date date_modification;

    Date date_creation;


}
