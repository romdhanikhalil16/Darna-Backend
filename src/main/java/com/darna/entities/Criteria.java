package com.darna.entities;

import com.darna.entities.enums.TypeTransaction;
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
public class Criteria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int criteria_id;
    @Enumerated(EnumType.STRING)
    TypeTransaction transaction_type;
int nbr_bathroom;
String description;
float area;
int nbr_rooms;
}
