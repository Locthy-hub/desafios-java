/*
 * ==========================================================
 * DESAFIO 010 - Calculadora de Imposto de Renda Simplificada
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar switch, métodos e operadores aritméticos para simular o cálculo de imposto por
 * faixas.
 *
 * ENUNCIADO:
 * Desenvolva uma calculadora que recebe o salário mensal de um contribuinte e calcula o
 * imposto devido de acordo com faixas progressivas, semelhante ao IRPF simplificado. Utilize
 * um método dedicado para o cálculo e switch para identificar a faixa aplicável.
 *
 * REGRAS:
 * - Faixas: até 2000 isento; de 2000.01 a 3000 aliquota 7,5%; de 3000.01 a 4500 aliquota 15%;
 * - de 4500.01 a 6000 aliquota 22,5%; acima de 6000 aliquota 27,5%.
 * - Crie um método identificarFaixa(double salario) que retorna um código inteiro de 0 a 4
 * - representando a faixa.
 * - Utilize switch sobre o código retornado para calcular o valor do imposto (salario *
 * - aliquota).
 * - Exiba a faixa identificada, a alíquota aplicada e o valor do imposto.
 *
 * ENTRADA:
 * O salário mensal do contribuinte (número decimal).
 *
 * SAIDA ESPERADA:
 * A faixa de tributação, a alíquota aplicada e o valor do imposto calculado.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   3500
 * Saida:
 *   Faixa: 3 - Aliquota: 15.0% - Imposto: R$ 525.0
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Salário exatamente no limite inferior de uma faixa (ex.: 2000.01).
 * Caso 2: Salário isento (menor ou igual a 2000).
 * Caso 3: Salário muito alto, testando a faixa máxima.
 *
 * OBSERVACOES IMPORTANTES:
 * Não é necessário implementar o cálculo por faixas acumuladas (efeito 'degrau'); aplique a alíquota da faixa final sobre o total, como pedido no enunciado.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
