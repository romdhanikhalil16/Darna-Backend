package com.darna.entities;

import com.darna.entities.enums.Gouvernorat;
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
public class Adresse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int adresse_id;
    @Enumerated(EnumType.STRING)
    Gouvernorat gouvernorat;
    float area;
    float longitude;
    float latitude;


}
