package com.br.comunicationapi.infra.entity;

import com.br.comunicationapi.core.enums.EnumStatusNotificacao;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

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
        this.dataEnvio = agendarNotificacaoInput.getDataEnvio();
        this.destinatario = agendarNotificacaoInput.getDestinatario();
        this.mensagem = agendarNotificacaoInput.getMensagem();
    }
}