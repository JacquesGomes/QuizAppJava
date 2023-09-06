package org.example.services.impl;




import org.example.models.LinkUtil;
import org.example.models.form.LinkUtilForm;
import org.example.repositories.LinkUtilRepository;
import org.example.services.ILinkUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkUtilServiceImpl implements ILinkUtilService {

    private final LinkUtilRepository repository;
    public LinkUtilServiceImpl(LinkUtilRepository repository){
        this.repository = repository;
    }


    @Override
    public List<LinkUtil> getAll() {
        return repository.findAll();
    }

    @Override
    public LinkUtil create(LinkUtilForm form) {
        LinkUtil link = new LinkUtil();
        link.setDescricao(form.getDescricao());
        link.setTitulo(form.getTitulo());
        link.setUrl(form.getUrl());
        link.setQuestion_id(form.getQuestion_id());
        return repository.save(link);
    }
}
