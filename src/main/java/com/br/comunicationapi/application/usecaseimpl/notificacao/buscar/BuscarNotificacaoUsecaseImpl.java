package com.br.comunicationapi.application.usecaseimpl.notificacao.buscar;

import com.br.comunicationapi.application.gateway.notificacao.NotificacaoGateway;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;
import com.br.comunicationapi.usecase.notificacao.buscar.BuscarNotificacaoUsecase;

public class BuscarNotificacaoUsecaseImpl implements BuscarNotificacaoUsecase {

    private final NotificacaoGateway notificacaoGateway;

    public BuscarNotificacaoUsecaseImpl(NotificacaoGateway notificacaoGateway) {
        this.notificacaoGateway = notificacaoGateway;
    }

    @Override
    public AgendarNotificacaoOutput execute() {
        return notificacaoGateway.buscarNotificacao();
    }
}
