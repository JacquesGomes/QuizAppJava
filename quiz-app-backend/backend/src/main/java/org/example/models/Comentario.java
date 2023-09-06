package org.example.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;

    private String comentario;

    @Column(name ="question_id")
    private Long questionId;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
