/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lara;

/**
 *
 * @author Acer
 */
public abstract class CursoPosGraduacao extends Curso {

    private String tipoSensu;
    private String strictoSensu;
    private String areaPesquisa;

    public boolean validarTrabalhoFinal(String trabalho) {
        return trabalho.equalsIgnoreCase("dissertacao") || trabalho.equalsIgnoreCase("tese");
    }

    @Override
    public void obterDisciplinas() {
        System.out.println("Disciplinas da pós-graduação");
    }

    @Override
    public void obterAlunosAtivos() {
        System.out.println("Alunos ativos da pós-graduação");
    }

    @Override
    public void obterAlunosEgressos() {
        System.out.println("Alunos egressos da pós-graduação");
    }
}
