package org.example.models.form;

import lombok.Data;

@Data
public class ComentarioForm {

    private String usuario;

    private String comentario;

    private Long question_id;

    public String getUsuario() {
        return usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public Long getQuestion_id() {
        return question_id;
    }
}
