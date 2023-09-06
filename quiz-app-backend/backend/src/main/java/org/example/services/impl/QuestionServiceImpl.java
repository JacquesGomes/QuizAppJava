package org.example.services.impl;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;
import org.example.repositories.QuestionRepository;
import org.example.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements IQuestionService{

    private final QuestionRepository repository;
    public QuestionServiceImpl(QuestionRepository repository){
        this.repository = repository;
    }

    @Override
    public Questao create(QuestaoForm form) {
        Questao questao = new Questao();
        questao.setTitulo(form.getTitulo());
        questao.setResposta(form.getResposta());
        questao.setOpcoes(form.getOpcoes());
        questao.setGabarito_comentado(form.getGabaritoComentado());
        return repository.save(questao);
    }

    public Page<Questao> getPaginatedQuestions(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<String> getGabarito(Long id) {
        Optional<Questao> optionalQuestao = repository.findById(id);
        Questao questao = optionalQuestao.get();
        return questao.getGabarito_comentado();
    }
}
