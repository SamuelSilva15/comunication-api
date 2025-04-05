package com.br.comunicationapi.application.usecaseimpl.notificacao.buscar;

import com.br.comunicationapi.application.gateway.notificacao.NotificacaoGateway;
import com.br.comunicationapi.infra.entity.Notificacao;
import com.br.comunicationapi.usecase.notificacao.buscar.BuscarNotificacaoUsecase;

import java.util.List;

public class BuscarNotificacaoUsecaseImpl implements BuscarNotificacaoUsecase {

    private final NotificacaoGateway notificacaoGateway;

    public BuscarNotificacaoUsecaseImpl(NotificacaoGateway notificacaoGateway) {
        this.notificacaoGateway = notificacaoGateway;
    }

    @Override
    public List<Notificacao> execute() {
        return notificacaoGateway.buscarNotificacao();
    }
}
