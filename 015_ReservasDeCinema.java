/*
 * ==========================================================
 * DESAFIO 015 - Sistema de Reserva de Assentos de Cinema
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays, for, switch e validações para simular a reserva de assentos em uma sala
 * de cinema.
 *
 * ENUNCIADO:
 * Modele uma sala de cinema com 10 assentos (numerados de 1 a 10), representados por um
 * array de boolean indicando se estão ocupados. O programa deve permitir reservar assentos,
 * cancelar reservas e exibir o mapa da sala através de um menu repetitivo.
 *
 * REGRAS:
 * - Menu: 1 - Reservar assento, 2 - Cancelar reserva, 3 - Exibir mapa da sala, 4 - Sair.
 * - Ao reservar um assento já ocupado, exiba mensagem de erro.
 * - Ao cancelar um assento livre, exiba mensagem de erro.
 * - O mapa da sala deve exibir 'O' para ocupado e 'X' para livre, numerando os assentos de 1 a
 * - 10.
 * - Utilize switch para tratar as opções do menu.
 *
 * ENTRADA:
 * Opções do menu e o número do assento, quando aplicável.
 *
 * SAIDA ESPERADA:
 * Confirmações de reserva/cancelamento, mapa da sala e mensagens de erro.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   3
 *   3
 *   
 *   4
 * Saida:
 *   Assento reservado com sucesso!
 *   1:X 2:X 3:O 4:X 5:X 6:X 7:X 8:X 9:X 10:X
 *   
 *   Encerrando sistema...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Tentar reservar um assento fora do intervalo 1-10.
 * Caso 2: Reservar todos os 10 assentos e tentar reservar mais um.
 * Caso 3: Cancelar um assento que nunca foi reservado.
 *
 * OBSERVACOES IMPORTANTES:
 * Lembre-se de converter entre o número do assento (1 a 10) e o índice do array (0 a 9).
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
