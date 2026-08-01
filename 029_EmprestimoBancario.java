/*
 * ==========================================================
 * DESAFIO 029 - Simulador de Empréstimo Bancário com Juros Compostos
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar while, métodos, if/else e operadores matemáticos para simular a evolução de um
 * empréstimo mês a mês.
 *
 * ENUNCIADO:
 * Implemente um simulador que recebe o valor de um empréstimo, a taxa de juros mensal e o
 * valor do pagamento mensal fixo que o cliente pretende pagar. O programa deve simular mês a
 * mês a evolução do saldo devedor até que ele seja quitado, ou informar que o pagamento é
 * insuficiente para quitar a dívida.
 *
 * REGRAS:
 * - A cada mês, o saldo devedor deve ser multiplicado por (1 + taxa/100) e, em seguida,
 * - subtraído do valor do pagamento mensal.
 * - Utilize um laço while que continue enquanto o saldo devedor for maior que zero.
 * - Se, após aplicar os juros, o valor do pagamento mensal for menor ou igual aos juros
 * - gerados no mês (ou seja, a dívida nunca diminui), interrompa a simulação e informe que o
 * - pagamento é insuficiente.
 * - Limite a simulação a, no máximo, 600 meses (50 anos) para evitar loop infinito em casos
 * - extremos.
 * - Ao final, exiba quantos meses foram necessários para quitar o empréstimo e o total pago.
 *
 * ENTRADA:
 * O valor do empréstimo, a taxa de juros mensal (%) e o valor do pagamento mensal.
 *
 * SAIDA ESPERADA:
 * A evolução mês a mês do saldo devedor (opcional detalhar) e o resultado final: quantidade de meses até a quitação e total pago, ou mensagem de pagamento insuficiente.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1000
 *   2
 *   200
 * Saida:
 *   Mes 1 - Saldo devedor: R$ 820.0
 *   Mes 2 - Saldo devedor: R$ 636.4
 *   Mes 3 - Saldo devedor: R$ 449.13
 *   Mes 4 - Saldo devedor: R$ 258.11
 *   Mes 5 - Saldo devedor: R$ 63.27
 *   Mes 6 - Emprestimo quitado!
 *   Total de meses: 6
 *   Total pago: R$ 1063.27
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Pagamento mensal menor que os juros gerados (deve detectar pagamento
 * insuficiente).
 * Caso 2: Empréstimo pequeno quitado em poucos meses.
 * Caso 3: Pagamento mensal muito alto, quitando a dívida logo no primeiro mês.
 *
 * OBSERVACOES IMPORTANTES:
 * Formate os valores monetários com duas casas decimais e trate corretamente o último pagamento, que pode ser menor que o valor mensal fixo.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
