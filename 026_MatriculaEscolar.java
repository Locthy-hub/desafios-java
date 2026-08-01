/*
 * ==========================================================
 * DESAFIO 026 - Sistema de Matrícula Escolar com Turmas
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays paralelos, métodos, switch e for para gerenciar matrículas de alunos em
 * turmas escolares.
 *
 * ENUNCIADO:
 * Implemente um sistema que matricula alunos em uma de três turmas (A, B ou C), cada uma com
 * capacidade máxima de 3 alunos para fins deste exercício. O programa deve controlar as
 * vagas disponíveis, permitir consultar a lista de alunos de uma turma e impedir matrícula
 * em turma lotada.
 *
 * REGRAS:
 * - Utilize arrays de Strings, um para cada turma (tamanho fixo 3), controlando quantas
 * - posições estão ocupadas.
 * - Menu: 1 - Matricular aluno, 2 - Listar turma, 3 - Ver vagas disponiveis, 4 - Sair.
 * - Utilize switch para direcionar a matrícula para o array da turma escolhida (A, B ou C).
 * - Se a turma estiver lotada, informe o erro e sugira outra turma com vaga disponível, se
 * - houver.
 * - Crie um método contarVagas(String[] turma, int ocupadas) que retorna quantas vagas restam.
 *
 * ENTRADA:
 * Opções do menu, nome do aluno e letra da turma escolhida, quando aplicável.
 *
 * SAIDA ESPERADA:
 * Confirmações de matrícula, listas de alunos por turma, vagas disponíveis e mensagens de erro.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   Julia
 *   A
 *   3
 * Saida:
 *   Aluno matriculado na turma A!
 *   Turma A: 2 vagas | Turma B: 3 vagas | Turma C: 3 vagas
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Matricular alunos até lotar completamente uma turma e tentar matricular mais um.
 * Caso 2: Listar uma turma que ainda não possui nenhum aluno matriculado.
 * Caso 3: Informar uma letra de turma inválida (diferente de A, B ou C).
 *
 * OBSERVACOES IMPORTANTES:
 * Cada turma deve ser controlada por um contador independente de alunos matriculados.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
