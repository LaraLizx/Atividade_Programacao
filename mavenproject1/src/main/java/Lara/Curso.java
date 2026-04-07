/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lara;

/**
 *
 * @author Acer
 */
public abstract class Curso {

    private int codigo;
    private String nome;
    private int chTotal;
    private int duracao;
    private String tipoDuracao;
    private String modalidade;
    private String status;
    private List<Disciplinas> disciplinas = new ArrayList()<Disciplina>();
    
    public abstract void obterDisciplinas();
    public abstract void obterAlunosAtivos();
    public abstract void obterAlunosEgressos();

    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int _codigo) {
        codigo = _codigo;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String _nome) {
        nome = _nome;
    }

    public int getchTotal() {
        return chTotal;
    }

    public void setchTotal(int _chTotal) {
        chTotal = _chTotal;
    }

    public int getduracao() {
        return duracao;
    }

    public void setduracao(int _duracao) {
        duracao = _duracao;
    }

    public String gettipoDuracao() {
        return tipoDuracao;
    }

    public void settipoDuracao(String _tipoDuracao) {
        tipoDuracao = _tipoDuracao;
    }

    public String getmodalidade() {
        return modalidade;
    }

    public void setmodalidade(String _modalidade) {
        modalidade = _modalidade;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String _status) {
        status = _status;
    }
    public abstract void realizarMatricula();
}



