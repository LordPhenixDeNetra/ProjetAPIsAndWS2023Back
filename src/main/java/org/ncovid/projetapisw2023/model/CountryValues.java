package org.ncovid.projetapisw2023.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CountryValues {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String pays;

    @Column
    private Long confirme;

    @Column
    private Long deces;

    @Column
    private Long guerisons;
}
