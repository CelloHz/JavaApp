package model;

import controller.Exceptions.*;

public class JogadorModel {

    private Integer _id;

    private String nome, idade, cidade, estado, pais, nomeMae, posicao, pernaChute, altura;

    @Override
    public String toString() {
        return "JogadorModel{" +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", posicao='" + posicao + '\'' +
                ", pernaChute='" + pernaChute + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }

    public JogadorModel(){}

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {   this._id = _id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NotStringException {
        if (nome.matches("^[a-zA-Z á]*$") && !nome.isEmpty()) this.nome = nome;
        else throw new NotStringException("Não é só String");
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) throws MoreThanTwoException, NotNumberException {

        if(idade.matches("[0-9]+"))
        {
            if(idade.length() == 2 || idade.length() == 1){
                this.idade = idade;
            }else{
                throw new MoreThanTwoException("IDADE ERRADA");
            }
        }else throw new NotNumberException("Não tem só numeros");


    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws NotStringException {

        if (cidade.matches("^[ a-zA-Z á]*$") && !cidade.isEmpty()) this.cidade = cidade;
        else throw new NotStringException("Não é só String");
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws NotStringException {

        if (estado.matches("^[ a-zA-Z á]*$") && !estado.isEmpty()) this.estado = estado;
        else throw new NotStringException("Não é só String");

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws NotStringException {

        if (pais.matches("^[ a-zA-Z á]*$") && !pais.isEmpty()) this.pais = pais;
        else throw new NotStringException("Não é só String");
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) throws NotStringException {

        if (nomeMae.matches("^[ a-zA-Z á]*$") && !nomeMae.isEmpty()) this.nomeMae = nomeMae;
        else throw new NotStringException("Não é só String");
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) throws NullException {
        if (posicao == null){
            throw new NullException("Nulo!");
        }else {
            this.posicao = posicao;
        }
    }

    public String getPernaChute() {
        return pernaChute;
    }

    public void setPernaChute(String pernaChute) throws NullException {
       if (pernaChute == null){
           throw new NullException("Nulo!");
       }else {
           this.pernaChute = pernaChute;
       }
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) throws NotNumberException, MoreThanThreeException {
        if (altura.matches("[0-9]+")){
            if(altura.length() == 3){
                this.altura = altura;
            }else{
                throw new MoreThanThreeException("Não tem 3");
            }
        }else{
            throw new NotNumberException("Não é só número");
        }

    }



}
