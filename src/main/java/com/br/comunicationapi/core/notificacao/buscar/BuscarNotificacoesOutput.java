package com.br.comunicationapi.core.notificacao.buscar;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BuscarNotificacoesOutput {

    private Page<NotificacoesOutput> notificacoesOutputList;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public class NotificacoesOutput {
        private String destinatario;
        private String mensagem;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
        private LocalDateTime dataEnvio;
    }
}
