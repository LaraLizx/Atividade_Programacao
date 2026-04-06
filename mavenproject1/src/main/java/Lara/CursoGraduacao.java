/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lara;

/**
 *
 * @author Acer
 */

public abstract class CursoGraduacao extends Curso {

    private String tipo;
    private boolean tccObrigatorio;

    public boolean validarTCC(String tcc) {
        if (tccObrigatorio && tcc.equalsIgnoreCase("entregue")) {
            return true;
        } else if (!tccObrigatorio) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void obterDisciplinas() {
        System.out.println("Disciplinas da graduação");
    }

    @Override
    public void obterAlunosAtivos() {
        System.out.println("Alunos ativos da graduação");
    }

    @Override
    public void obterAlunosEgressos() {
        System.out.println("Alunos egressos da graduação");
    }
}
