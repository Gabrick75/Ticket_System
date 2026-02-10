package com.gabrick.ticket_system.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void deveCriarTicketComStatusAberto() {
        Ticket ticket = new Ticket(1, "Erro no sistema", Prioridade.MEDIA);

        assertEquals(Status.ABERTO, ticket.getStatus());
    }

    @Test
    void deveIniciarAtendimentoQuandoStatusAberto() {
        Ticket ticket = new Ticket(1, "Erro no sistema", Prioridade.ALTA);

        ticket.iniciarAtendimento();

        assertEquals(Status.EM_ANDAMENTO, ticket.getStatus());
        assertNotNull(ticket.getDataAtendimento());
    }

    @Test
    void deveLancarExcecaoAoIniciarAtendimentoDuasVezes() {
        Ticket ticket = new Ticket(1, "Erro crítico", Prioridade.CRITICA);

        ticket.iniciarAtendimento();

        assertThrows(
                IllegalStateException.class,
                ticket::iniciarAtendimento
        );
    }

    @Test
    void deveFinalizarTicketEmAndamento() {
        Ticket ticket = new Ticket(1, "Erro qualquer", Prioridade.BAIXA);

        ticket.iniciarAtendimento();
        ticket.finalizar();

        assertEquals(Status.RESOLVIDO, ticket.getStatus());
        assertNotNull(ticket.getDataConclusao());
    }

    @Test
    void deveLancarExcecaoAoFinalizarSemIniciar() {
        Ticket ticket = new Ticket(1, "Erro qualquer", Prioridade.MEDIA);

        assertThrows(
                IllegalStateException.class,
                ticket::finalizar
        );
    }


}
