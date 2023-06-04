package com.example.darna.entities;

import com.example.darna.entities.enums.React;
import lombok.*;
import lombok.experimental.FieldDefaults;
import    com.example.darna.entities.User;

import javax.persistence.*;
import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PRIVATE )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int commentaire_id;
    String message;
    @Enumerated(EnumType.STRING)
    React react;
}
