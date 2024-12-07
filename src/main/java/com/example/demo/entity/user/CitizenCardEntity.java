package com.example.demo.entity.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="java_citizen_card_001")
public class CitizenCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberCard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
