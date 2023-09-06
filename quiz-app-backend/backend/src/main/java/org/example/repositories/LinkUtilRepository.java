package org.example.repositories;

import org.example.models.Comentario;

import org.example.models.LinkUtil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkUtilRepository extends JpaRepository<LinkUtil, Long> {

}