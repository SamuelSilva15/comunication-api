package com.br.comunicationapi.core.notificacao.agendar;

import com.br.comunicationapi.core.enums.EnumStatusNotificacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendarNotificacaoOutput {
    private String destinatario;
    private String mensagem;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataEnvio;
    private EnumStatusNotificacao status;
}