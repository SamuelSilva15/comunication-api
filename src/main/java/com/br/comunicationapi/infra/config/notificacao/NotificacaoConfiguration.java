package com.br.comunicationapi.infra.config.notificacao;

import com.br.comunicationapi.application.gateway.notificacao.NotificacaoGateway;
import com.br.comunicationapi.application.usecaseimpl.notificacao.agendamento.AgendarNotificacaoUsecaseImpl;
import com.br.comunicationapi.usecase.notificacao.agendar.AgendarNotificacaoUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfiguration {

    @Bean
    public AgendarNotificacaoUsecase agendarNotificacaoUsecase(NotificacaoGateway notificacaoGateway) {
        return new AgendarNotificacaoUsecaseImpl(notificacaoGateway);
    }
}