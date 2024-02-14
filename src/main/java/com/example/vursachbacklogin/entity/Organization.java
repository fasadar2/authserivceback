package com.example.vursachbacklogin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 765)
    @NotNull
    @Column(name = "name_general", nullable = false, length = 765)
    private String nameGeneral;

    @Size(max = 20)
    @NotNull
    @Column(name = "phone_general", nullable = false, length = 20)
    private String phoneGeneral;

    @Size(max = 765)
    @NotNull
    @Column(name = "name_subgeneral", nullable = false, length = 765)
    private String nameSubgeneral;

    @Size(max = 20)
    @NotNull
    @Column(name = "phone_subgeneral", nullable = false, length = 20)
    private String phoneSubgeneral;

    @Size(max = 256)
    @NotNull
    @Column(name = "email_general", nullable = false, length = 256)
    private String emailGeneral;

    @Size(max = 256)
    @NotNull
    @Column(name = "email_subgeneral", nullable = false, length = 256)
    private String emailSubgeneral;

}