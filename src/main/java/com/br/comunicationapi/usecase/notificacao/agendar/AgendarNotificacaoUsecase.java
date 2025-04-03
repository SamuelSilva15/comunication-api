package com.br.comunicationapi.usecase.notificacao.agendar;

import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;

public interface AgendarNotificacaoUsecase {
    AgendarNotificacaoOutput execute(AgendarNotificacaoInput agendarNotificacaoInput);
}