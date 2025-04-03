package com.br.comunicationapi.infra.controller.notificacao;

import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoInput;
import com.br.comunicationapi.core.notificacao.agendar.AgendarNotificacaoOutput;
import com.br.comunicationapi.usecase.notificacao.agendar.AgendarNotificacaoUsecase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("notificacao")
public class NotificacaoController {

    private AgendarNotificacaoUsecase agendarNotificacaoUsecase;

    @PostMapping
    public ResponseEntity<AgendarNotificacaoOutput> agendarNotificacao(@RequestBody AgendarNotificacaoInput agendarNotificacaoInput) {
        try {
            AgendarNotificacaoOutput output = agendarNotificacaoUsecase.execute(agendarNotificacaoInput);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}