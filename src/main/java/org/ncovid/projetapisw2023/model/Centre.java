package org.ncovid.projetapisw2023.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "centre")
@NoArgsConstructor
@Getter
@Setter
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomCentre;

    @Column
    private String positionCentre;

    @Column
    private String contactCentre;

    @Column
    private String regionCentre;

    @Column
    private String villeCentre;

    @Column
    private String communeCentre;

    @Column(columnDefinition = "TEXT")
    private String adresseCentre;

}
