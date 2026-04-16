package com.CoreService.model;

import com.CoreService.model.enums.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUsuario;

    @NotBlank(message = "Nombre es obligatorio")
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String Nombre;

    private String Email; // viene del Auth0

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Rol es obligatorio")
    @Column(nullable = false, length = 20)
    private Rol Rol;






}
