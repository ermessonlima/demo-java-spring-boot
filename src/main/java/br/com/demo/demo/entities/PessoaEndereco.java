package br.com.demo.demo.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PessoaEndereco
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String rua;

    public long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String value) {
        this.rua = value;
    }

    public void setId(long id) {
        this.id = id;
    }
}