/*
 * ==========================================================
 * DESAFIO 005 - Simulador de Conta Bancária com Operações via Menu
 * ==========================================================
 *
 * OBJETIVO:
 * Integrar métodos, switch, while, operadores e validações em um simulador de operações
 * bancárias.
 *
 * ENUNCIADO:
 * Implemente um simulador de conta bancária com saldo inicial de R$ 500,00. O usuário deve
 * poder realizar depósitos, saques e consultar o extrato através de um menu repetido em
 * while, sendo que cada operação deve ser implementada como um método separado que recebe e
 * retorna o saldo atualizado.
 *
 * REGRAS:
 * - Crie métodos: depositar(double saldo, double valor), sacar(double saldo, double valor) e
 * - exibirExtrato(double saldo).
 * - O saque não pode deixar o saldo negativo; caso a operação seja inválida, exiba mensagem de
 * - erro e não altere o saldo.
 * - Toda operação deve receber um valor positivo; valores negativos ou zero devem ser
 * - rejeitados.
 * - O programa deve continuar pedindo operações até que o usuário escolha 'Sair'.
 * - Utilize switch para direcionar a opção escolhida ao método correspondente.
 *
 * ENTRADA:
 * Opções do menu (1-Depositar, 2-Sacar, 3-Extrato, 4-Sair) e valores das operações.
 *
 * SAIDA ESPERADA:
 * Confirmações das operações, mensagens de erro quando aplicável e o extrato final ao sair.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   200
 *   2
 *   100
 *   3
 *   4
 * Saida:
 *   Deposito realizado!
 *   Saque realizado!
 *   Saldo atual: R$ 600.0
 *   Encerrando sessao...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Tentativa de saque maior que o saldo disponível.
 * Caso 2: Depósito com valor negativo (deve ser rejeitado).
 * Caso 3: Sequência de várias operações antes de sair, verificando o saldo acumulado.
 *
 * OBSERVACOES IMPORTANTES:
 * O saldo deve ser mantido em uma variável na main e atualizado pelo retorno dos métodos, já que ainda não usamos atributos de classe.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
