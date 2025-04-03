package com.br.comunicationapi.infra.entity;

import com.br.comunicationapi.core.enums.EnumStatusNotificacao;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificacaoId;
    private String remetente;
    private String destinatario;
    private String mensagem;
    private LocalDateTime dataEnvio;
    private EnumStatusNotificacao status;

    public Notificacao(AgendarNotificacaoInput agendarNotificacaoInput) {
        this.destinatario = agendarNotificacaoInput.destinatario();
        this.mensagem = agendarNotificacaoInput.mensagem();
        this.dataEnvio = agendarNotificacaoInput.dataEnvio();
        this.status = EnumStatusNotificacao.AGENDADA;
    }
}