package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "sobrinhos")
    List<Tio> tios = new ArrayList<>();

    public Sobrinho() {

    }

    public Sobrinho(String nome) {
        super();
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tio> getTios() {
        return this.tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }

}
