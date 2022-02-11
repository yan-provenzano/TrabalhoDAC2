/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.id.ProjetoDAC_API.repository;

import br.uff.id.ProjetoDAC_API.model.Colecao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Yan
 */
@RepositoryRestResource(collectionResourceRel = "colecao", path = "colecao")
public interface ColecaoRepository extends CrudRepository<Colecao, Long>{     
}
