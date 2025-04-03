package com.br.comunicationapi.application.usecaseimpl.notificacao.agendamento;

import com.br.comunicationapi.application.gateway.notificacao.NotificacaoGateway;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;
import com.br.comunicationapi.usecase.notificacao.agendar.AgendarNotificacaoUsecase;

public class AgendarNotificacaoUsecaseImpl implements AgendarNotificacaoUsecase {

    private final NotificacaoGateway notificacaoGateway;

    public AgendarNotificacaoUsecaseImpl(NotificacaoGateway notificacaoGateway) {
        this.notificacaoGateway = notificacaoGateway;
    }

    @Override
    public AgendarNotificacaoOutput execute(AgendarNotificacaoInput agendarNotificacaoInput) {
        return notificacaoGateway.agendarNotificacao(agendarNotificacaoInput);
    }
}