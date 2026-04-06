/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lara;

/**
 *
 * @author Acer
 */
public abstract class CursoTecnico extends Curso {

    private String eixoTecnologico;
    private int chEstagio;

    public boolean estagioObrigatorio() {
        return chEstagio > 0;
    }

    @Override
    public void obterDisciplinas() {
        System.out.println("Disciplinas do curso técnico");
    }

    @Override
    public void obterAlunosAtivos() {
        System.out.println("Alunos ativos do curso técnico");
    }

    @Override
    public void obterAlunosEgressos() {
        System.out.println("Alunos egressos do curso técnico");
    }
}
