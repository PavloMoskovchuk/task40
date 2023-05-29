package com.example.task40.city;

import com.example.task40.country.Country;
import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String city;

    @Column
    private String countryCode;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
