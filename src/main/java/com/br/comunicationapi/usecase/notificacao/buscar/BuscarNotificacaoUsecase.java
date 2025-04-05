package com.br.comunicationapi.usecase.notificacao.buscar;

import com.br.comunicationapi.infra.entity.Notificacao;

import java.util.List;

public interface BuscarNotificacaoUsecase {
    List<Notificacao> execute();
}
