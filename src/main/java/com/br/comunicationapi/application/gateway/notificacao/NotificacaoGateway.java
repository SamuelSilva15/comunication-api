package com.br.comunicationapi.application.gateway.notificacao;

import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;
import com.br.comunicationapi.infra.entity.Notificacao;

import java.util.List;

public interface NotificacaoGateway {
    AgendarNotificacaoOutput agendarNotificacao(AgendarNotificacaoInput agendarNotificacaoInput);
    List<Notificacao> buscarNotificacao();
}
