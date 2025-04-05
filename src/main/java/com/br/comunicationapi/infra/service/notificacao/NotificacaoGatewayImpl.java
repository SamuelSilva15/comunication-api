package com.br.comunicationapi.infra.service.notificacao;

import com.br.comunicationapi.application.gateway.notificacao.NotificacaoGateway;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;
import com.br.comunicationapi.infra.entity.Notificacao;
import com.br.comunicationapi.infra.repository.notificacao.NotificacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotificacaoGatewayImpl implements NotificacaoGateway {

    private NotificacaoRepository notificacaoRepository;

    @Override
    public AgendarNotificacaoOutput agendarNotificacao(AgendarNotificacaoInput agendarNotificacaoInput) {
        Notificacao notificacao = new Notificacao(agendarNotificacaoInput);
        notificacaoRepository.save(notificacao);
        return new AgendarNotificacaoOutput(notificacao.getDestinatario(), notificacao.getMensagem(), notificacao.getDataEnvio(), notificacao.getStatus());
    }

    @Override
    public List<Notificacao> buscarNotificacao() {
        return notificacaoRepository.findAll();
    }
}