package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
    private int numeroCRP; //registro do Conselho Regional de Psicologia
    private String classe; //informações sobre o profissional
    private String especialidade; //Áreas de Especialização

    public int getNumeroCRP() {
        return numeroCRP;
    }

    public void setNumeroCRP(int numeroCRP) {
        this.numeroCRP = numeroCRP;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
