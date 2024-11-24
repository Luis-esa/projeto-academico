package br.edu.ifs.academico;

public class Pedagogo extends Pessoa {
    private int anoFormacao;
    private String experiencia; //Área que possui experiência.

    public int getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(int anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
