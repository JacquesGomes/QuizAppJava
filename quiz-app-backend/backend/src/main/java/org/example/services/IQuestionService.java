package org.example.services;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionService {

    Questao create(QuestaoForm form);

    Page<Questao> getPaginatedQuestions(Pageable pageable);

    List<String> getGabarito(Long id);
}
