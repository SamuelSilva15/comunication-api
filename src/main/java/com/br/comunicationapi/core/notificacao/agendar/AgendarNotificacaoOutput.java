package com.br.comunicationapi.core.notificacao.agendar;

import com.br.comunicationapi.core.enums.EnumStatusNotificacao;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendarNotificacaoOutput(String destinatario, String mensagem,
                                       @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
                                       LocalDateTime dataEnvio,
                                       EnumStatusNotificacao status) {}