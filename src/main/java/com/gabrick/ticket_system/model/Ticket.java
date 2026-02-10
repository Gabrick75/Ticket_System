package com.gabrick.ticket_system.model;

import java.time.LocalDateTime;

public class Ticket {
    private long id;
    private String titulo;
    private Prioridade prioridade;
    private Status status;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtendimento;
    private LocalDateTime dataConclusao;

    public Ticket(long id, String titulo, Prioridade prioridade){
        this.id = id;
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.status = Status.ABERTO;
        this.dataCriacao = LocalDateTime.now();
    }

    public void iniciarAtendimento() {
        if (status != Status.ABERTO) {
            throw new IllegalStateException(
                    "Ticket Só pode ser iniciado se estiver aberto"
            );
        }
        this.status = Status.EM_ANDAMENTO;
        this.dataAtendimento = LocalDateTime.now();
    }
    public void finalizar(){
        if (status != Status.EM_ANDAMENTO)
            throw new IllegalStateException(
                "Ticket so pode ser finalizado se estiver EM_ANDAMENTO"
                );
        this.status = Status.RESOLVIDO;
        this.dataConclusao = LocalDateTime.now();
    }
    public Status getStatus() {
        return status;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }


}
