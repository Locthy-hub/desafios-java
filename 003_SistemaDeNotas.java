/*
 * ==========================================================
 * DESAFIO 003 - Sistema de Notas com Conceito Final por Switch
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays, for, switch e operadores relacionais para classificar o desempenho de
 * alunos por conceito.
 *
 * ENUNCIADO:
 * Desenvolva um sistema que recebe três notas de cada aluno de uma turma, calcula a média
 * ponderada (pesos 2, 3 e 5) e converte essa média em um conceito (A, B, C, D ou E)
 * utilizando uma estrutura switch baseada em faixas de valores convertidas para um código
 * inteiro.
 *
 * REGRAS:
 * - A média ponderada é (nota1*2 + nota2*3 + nota3*5) / 10.
 * - Conceito A: média >= 9. Conceito B: média >= 7 e < 9. Conceito C: média >= 5 e < 7.
 * - Conceito D: média >= 3 e < 5. Conceito E: média < 3.
 * - Para usar switch, transforme a média em uma faixa inteira (ex.: media/1) antes de decidir
 * - o conceito, ou utilize switch com yield sobre uma variável de faixa calculada previamente.
 * - Ao final, exiba quantos alunos ficaram em cada conceito.
 *
 * ENTRADA:
 * Quantidade de alunos e, para cada um, três notas (0 a 10).
 *
 * SAIDA ESPERADA:
 * Conceito de cada aluno e a contagem final de alunos por conceito (A, B, C, D, E).
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   2
 *   9
 *   8
 *   10
 *   4
 *   3
 *   2
 * Saida:
 *   Aluno 1 - Conceito: A
 *   Aluno 2 - Conceito: E
 *   Resumo -> A:1 B:0 C:0 D:0 E:1
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Turma inteira com conceito B.
 * Caso 2: Um aluno exatamente na fronteira entre duas faixas (média 7.0 e média 5.0).
 * Caso 3: Turma com 5 alunos cobrindo todos os conceitos.
 *
 * OBSERVACOES IMPORTANTES:
 * É obrigatório utilizar switch para decidir o conceito, mesmo que uma cadeia de if/else pudesse resolver o problema.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
