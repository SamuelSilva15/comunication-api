package com.br.comunicationapi.application.gateway.notificacao;

import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;

public interface NotificacaoGateway {
    AgendarNotificacaoOutput agendarNotificacao(AgendarNotificacaoInput agendarNotificacaoInput);
    AgendarNotificacaoOutput buscarNotificacao();
}
