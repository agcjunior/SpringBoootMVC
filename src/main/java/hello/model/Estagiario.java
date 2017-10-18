package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estagiarios")
public class Estagiario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nome;
    private String instituicao;

    public Estagiario() {}

    public Estagiario(String nome, String instituicao) {
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return this.nome;
    }
}