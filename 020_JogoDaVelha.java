/*
 * ==========================================================
 * DESAFIO 020 - Validador de Jogadas do Jogo da Velha
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar arrays, if/else, métodos e operadores lógicos para validar jogadas e verificar
 * vencedor em um jogo da velha simplificado.
 *
 * ENUNCIADO:
 * Implemente a lógica de validação de um jogo da velha (tabuleiro representado por um array
 * de 9 posições, de índice 0 a 8). Dois jogadores ('X' e 'O') se alternam informando a
 * posição onde desejam jogar. O programa deve validar a jogada, atualizar o tabuleiro e
 * verificar se há um vencedor após cada jogada.
 *
 * REGRAS:
 * - O tabuleiro deve iniciar vazio (use espaço ' ' ou '-' para posições livres).
 * - Antes de aceitar uma jogada, valide se a posição está dentro do intervalo 0-8 e se está
 * - livre.
 * - Crie um método verificarVencedor(char[] tabuleiro) que checa as 8 combinações possíveis de
 * - vitória (3 linhas, 3 colunas, 2 diagonais).
 * - O jogo deve alternar entre os jogadores automaticamente após cada jogada válida.
 * - Se todas as 9 posições forem preenchidas sem vencedor, declare empate.
 *
 * ENTRADA:
 * A posição escolhida (0 a 8) em cada jogada, alternando entre os jogadores X e O.
 *
 * SAIDA ESPERADA:
 * Confirmação de cada jogada, o tabuleiro atualizado e o resultado final (vencedor ou empate).
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   0
 *   3
 *   1
 *   4
 *   2
 * Saida:
 *   Jogador X venceu!
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Jogada em uma posição já ocupada (deve ser rejeitada sem consumir a vez do
 * jogador).
 * Caso 2: Jogada em uma posição inválida, como 9 ou -1.
 * Caso 3: Partida que termina em empate, preenchendo todas as 9 posições sem vencedor.
 *
 * OBSERVACOES IMPORTANTES:
 * Não é necessário implementar interface gráfica; a exibição do tabuleiro pode ser feita em texto simples, 3 posições por linha.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
