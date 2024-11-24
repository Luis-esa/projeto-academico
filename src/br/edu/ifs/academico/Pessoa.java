package br.edu.ifs.academico;

public class Pessoa {
    private String nome;
    private String localNascimento;
    private String dataNascimento;
    private char sexo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char s) {    //atribuir 's' para melhor visualização.
        if (s == 'M' || s == 'F' || s == 'O') {
            this.sexo = s;
        } else {
            System.out.println("Digite 'M' , 'F' ou 'O' ");
        }
    }
}
