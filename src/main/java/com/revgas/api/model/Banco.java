package com.revgas.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="banco")
public class Banco {
    @Id
    @Column(name="id")
    private Long codigoCompensacao;

    @Column(name="nome_banco")
    private String nomeBanco;
}
