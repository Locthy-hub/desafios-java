/*
 * ==========================================================
 * DESAFIO 021 - Sistema de Controle de Vacinação
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays, switch, métodos e if/else para gerenciar o status vacinal de um grupo de
 * pessoas.
 *
 * ENUNCIADO:
 * Desenvolva um sistema que registra o status de vacinação de pessoas de um bairro. Para
 * cada pessoa, informe nome, idade e quantas doses já tomou (0, 1 ou 2). O programa deve
 * classificar a situação vacinal de cada pessoa e gerar um resumo estatístico ao final.
 *
 * REGRAS:
 * - Classificação: 0 doses = 'Nao vacinado'; 1 dose = 'Vacinacao incompleta'; 2 doses =
 * - 'Vacinacao completa'.
 * - Utilize switch para determinar a classificação a partir do número de doses.
 * - Pessoas com idade abaixo de 5 anos e 0 doses devem ser marcadas como 'Nao elegivel' em vez
 * - de 'Nao vacinado' (regra especial tratada com if antes do switch).
 * - Ao final, exiba quantas pessoas estão em cada categoria e o percentual de vacinação
 * - completa do grupo.
 *
 * ENTRADA:
 * Quantidade de pessoas e, para cada uma, nome, idade e número de doses (0, 1 ou 2).
 *
 * SAIDA ESPERADA:
 * Classificação individual de cada pessoa e o resumo estatístico final do grupo.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   2
 *   Carlos
 *   30
 *   2
 *   Bia
 *   3
 *   0
 * Saida:
 *   Carlos - Vacinacao completa
 *   Bia - Nao elegivel
 *   Resumo -> Completa:1 Incompleta:0 NaoVacinado:0 NaoElegivel:1
 *   Percentual de vacinacao completa: 50.0%
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Pessoa adulta sem nenhuma dose (deve ser 'Nao vacinado').
 * Caso 2: Criança pequena sem doses (regra especial 'Nao elegivel').
 * Caso 3: Grupo inteiro totalmente vacinado (percentual de 100%).
 *
 * OBSERVACOES IMPORTANTES:
 * O percentual deve ser calculado sobre o total de pessoas cadastradas, formatado com uma casa decimal.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
