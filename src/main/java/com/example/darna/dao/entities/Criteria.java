package com.example.darna.dao.entities;

import com.example.darna.dao.entities.enums.TypeTransaction;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
@Table
public class Criteria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    TypeTransaction transaction_type;
    int nbr_bathroom;
    String description;
    float area;
    int nbr_rooms;
}