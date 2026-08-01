/*
 * ==========================================================
 * DESAFIO 002 - Simulador de Caixa Eletrônico
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar while, switch, operadores aritméticos e módulo em um problema de dispensação de
 * cédulas.
 *
 * ENUNCIADO:
 * Simule um caixa eletrônico que recebe um valor a ser sacado e informa a menor quantidade
 * possível de cédulas de R$ 100, R$ 50, R$ 20, R$ 10, R$ 5 e R$ 2 necessárias para compor
 * esse valor. O programa deve repetir a operação até que o usuário escolha encerrar, usando
 * um menu.
 *
 * REGRAS:
 * - O valor solicitado deve ser um número inteiro positivo.
 * - Caso o valor não possa ser formado (por exemplo, valores ímpares menores que 2), informe
 * - que não é possível.
 * - O menu deve ter as opções: 1 - Sacar, 2 - Encerrar.
 * - Utilize um laço while controlado pela escolha do menu.
 * - Para cada saque, use o algoritmo guloso: comece pela maior cédula e vá diminuindo.
 * - O programa deve validar se a opção digitada no menu é válida (1 ou 2); caso contrário,
 * - exiba mensagem de erro e peça novamente.
 *
 * ENTRADA:
 * Opções do menu (inteiros) e, quando aplicável, o valor do saque desejado.
 *
 * SAIDA ESPERADA:
 * Quantidade de cada cédula utilizada no saque, ou mensagem de erro quando o valor não é sacável.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   280
 *   2
 * Saida:
 *   2 cedula(s) de R$100
 *   1 cedula(s) de R$50
 *   1 cedula(s) de R$20
 *   2
 *   
 *   Encerrando...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Valor que usa todas as cédulas disponíveis.
 * Caso 2: Valor igual a 1 (não é possível sacar).
 * Caso 3: Opção de menu inválida seguida de uma opção válida.
 *
 * OBSERVACOES IMPORTANTES:
 * Não utilize métodos de bibliotecas prontas para arredondamento de cédulas; implemente a lógica manualmente com divisão e módulo.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
