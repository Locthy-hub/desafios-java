/*
 * ==========================================================
 * DESAFIO 027 - Calculadora de Conta de Água por Faixas de Consumo
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar switch, métodos, if/else e operadores aritméticos para simular o cálculo de uma
 * conta de água com tarifas progressivas.
 *
 * ENUNCIADO:
 * Desenvolva uma calculadora de conta de água que recebe o consumo mensal em metros cúbicos
 * de vários imóveis e calcula o valor a pagar de acordo com faixas de tarifação progressiva,
 * semelhante a uma companhia de saneamento real.
 *
 * REGRAS:
 * - Faixas de tarifa por m³: até 10 m³, R$ 2,50/m³; de 11 a 20 m³, R$ 4,00/m³ sobre o
 * - excedente; acima de 20 m³, R$ 6,50/m³ sobre o excedente, mantendo os valores das faixas
 * - anteriores.
 * - Crie um método calcularConta(double consumo) que aplica corretamente o cálculo progressivo
 * - por faixas (e não a tarifa única sobre o total).
 * - O programa deve processar vários imóveis em sequência (quantidade informada pelo usuário)
 * - e, ao final, exibir o total arrecadado de todos os imóveis somados.
 * - Utilize switch (baseado em uma faixa calculada) apenas para exibir uma mensagem de
 * - categoria de consumo: 'Economico', 'Moderado' ou 'Alto'.
 *
 * ENTRADA:
 * Quantidade de imóveis e o consumo em m³ de cada um.
 *
 * SAIDA ESPERADA:
 * Valor da conta de cada imóvel, categoria de consumo e o total arrecadado somando todos os imóveis.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   25
 * Saida:
 *   Valor da conta: R$ 82.5 - Categoria: Alto
 *   Total arrecadado: R$ 82.5
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Consumo exatamente igual a 10 m³ (limite da primeira faixa).
 * Caso 2: Consumo igual a zero.
 * Caso 3: Vários imóveis com consumos variados, somando corretamente o total arrecadado.
 *
 * OBSERVACOES IMPORTANTES:
 * Lembre-se de que o cálculo progressivo soma os valores de cada faixa parcial, não aplica a tarifa da faixa final sobre o consumo total.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
