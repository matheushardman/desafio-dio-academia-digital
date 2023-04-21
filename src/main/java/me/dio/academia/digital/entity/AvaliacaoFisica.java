package me.dio.academia.digital.entity;

import me.dio.academia.digital.entity.Aluno;

import java.time.LocalDateTime;

public class AvaliacaoFisica {
    private Long id;

    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    private double peso;

    private double altura;
}