package org.example.controllers;


import io.swagger.v3.oas.models.links.Link;
import org.example.models.LinkUtil;
import org.example.models.form.LinkUtilForm;
import org.example.services.impl.LinkUtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkUtilController {

    private final LinkUtilServiceImpl service;
    public LinkUtilController (LinkUtilServiceImpl service){
        this.service = service;
    }

    @CrossOrigin(origins = "https://jacquesgomes.com.br/quizTech/")
    @GetMapping
    public List<LinkUtil> getAll(){return service.getAll();}

    @PostMapping
    public LinkUtil createLink(@RequestBody LinkUtilForm form){
        return service.create(form);
    }
}
