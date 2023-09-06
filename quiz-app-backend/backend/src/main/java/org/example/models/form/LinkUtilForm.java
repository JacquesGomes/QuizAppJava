package org.example.models.form;

import lombok.Data;

@Data
public class LinkUtilForm {
    private String descricao;
    private String titulo;
    private String url;
    private Long question_id;

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl() {
        return url;
    }

    public Long getQuestion_id() {
        return question_id;
    }
}
