package org.example.controllers;


import org.example.models.Comentario;
import org.example.models.Questao;
import org.example.models.form.ComentarioForm;
import org.example.models.form.QuestaoForm;
import org.example.services.impl.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {


    private final ComentarioServiceImpl service;
    public ComentarioController (ComentarioServiceImpl service){
        this.service = service;
    }
    @PostMapping
    public Comentario create(@RequestBody ComentarioForm form){
        return service.create(form);
    }
    @CrossOrigin(origins = "https://jacquesgomes.com.br/quizTech/")
    @GetMapping("/{questionId}")
    public List<Comentario> getAllById(@PathVariable Long questionId){
        return service.getAllById(questionId);
    }

    @CrossOrigin(origins = "https://jacquesgomes.com.br/quizTech/")
    @GetMapping
    public List<Comentario> getAll(){
        return service.getAll();
    }




}
