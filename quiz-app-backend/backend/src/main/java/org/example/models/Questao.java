package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_questions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private List<String> opcoes;

    private String resposta;

    @Basic(fetch = FetchType.LAZY)
    private List<String> gabarito_comentado;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void setGabarito_comentado(List<String> gabarito_comentado) {
        this.gabarito_comentado = gabarito_comentado;
    }

    public List<String> getGabarito_comentado() {
        return gabarito_comentado;
    }
}
