package com.gabrick.ticket_system.model;

import java.time.LocalDateTime;

public class Ticket {
    private long id;
    private String titulo;
    private Prioridade prioridade;
    private Status status;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private LocalDateTime dataAtendimento;
    private LocalDateTime dataConclusao;


}
