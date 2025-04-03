package com.br.comunicationapi.infra.repository.notificacao;

import com.br.comunicationapi.infra.entity.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
}
