package com.gabriel.model;

import javax.persistence.*;

@Entity
public class ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private Integer idade;

    public ModelPessoa() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "ModelPessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }

}
