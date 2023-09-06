package org.example.services.impl;

import org.example.models.Comentario;
import org.example.models.form.ComentarioForm;
import org.example.repositories.ComentarioRepository;
import org.example.services.IComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements IComentarioService {

    private final ComentarioRepository repository;
    public ComentarioServiceImpl(ComentarioRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Comentario> getAllById(Long questionId) {
        return repository.findByQuestionId(questionId);
    }
    @Override
    public List<Comentario> getAll() {
        return repository.findAll();
    }

    @Override
    public Comentario create(ComentarioForm form) {
        Comentario comentario = new Comentario();
        comentario.setComentario(form.getComentario());
        comentario.setQuestionId(form.getQuestion_id());
        comentario.setUsuario(form.getUsuario());
        return repository.save(comentario);
    }
}
