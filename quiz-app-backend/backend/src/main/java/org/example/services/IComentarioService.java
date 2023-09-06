package org.example.services;

import org.example.models.Comentario;
import org.example.models.form.ComentarioForm;

import java.util.List;

public interface IComentarioService {
    List<Comentario> getAllById(Long questionId);
    List<Comentario> getAll();

    Comentario create(ComentarioForm form);
}
