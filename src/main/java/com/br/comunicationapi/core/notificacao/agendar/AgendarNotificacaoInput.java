package com.br.comunicationapi.core.notificacao.agendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendarNotificacaoInput(@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
                                      LocalDateTime dataEnvio, String destinatario, String mensagem) {}