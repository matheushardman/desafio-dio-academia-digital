package me.dio.academia.digital.entity;

import me.dio.academia.digital.entity.Aluno;

import java.time.LocalDateTime;

public class Matricula {
    private Long id;

    private Aluno aluno;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();

}