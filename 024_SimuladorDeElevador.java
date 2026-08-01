/*
 * ==========================================================
 * DESAFIO 024 - Simulador de Elevador Inteligente
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar while, switch, if/else e operadores para simular o deslocamento de um elevador
 * entre andares.
 *
 * ENUNCIADO:
 * Simule o funcionamento de um elevador que atende um prédio de 10 andares (0 a 9), partindo
 * do térreo (andar 0). O usuário informa o andar de destino repetidamente através de um
 * menu, e o programa deve calcular quantos andares o elevador precisa subir ou descer a cada
 * chamada.
 *
 * REGRAS:
 * - O elevador deve manter o andar atual em uma variável que é atualizada a cada movimento.
 * - Valide se o andar solicitado está entre 0 e 9; caso contrário, informe erro e não mova o
 * - elevador.
 * - Se o andar solicitado for igual ao andar atual, informe que o elevador já está no andar.
 * - Utilize switch para tratar as opções do menu: 1 - Chamar elevador, 2 - Ver andar atual, 3
 * - - Encerrar.
 * - Ao final, exiba o total de andares percorridos pelo elevador durante toda a simulação
 * - (soma de todos os deslocamentos).
 *
 * ENTRADA:
 * Opções do menu e o andar de destino, quando aplicável.
 *
 * SAIDA ESPERADA:
 * Mensagens de movimento (subindo/descendo X andares), andar atual e total de andares percorridos ao encerrar.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   5
 *   1
 *   2
 *   3
 * Saida:
 *   Subindo 5 andar(es). Elevador chegou ao andar 5.
 *   Andar atual: 2
 *   Total de andares percorridos: 8
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Chamar o elevador para o andar em que ele já se encontra.
 * Caso 2: Informar um andar inválido, como 15 ou -2.
 * Caso 3: Sequência de chamadas alternando subidas e descidas.
 *
 * OBSERVACOES IMPORTANTES:
 * O total de andares percorridos deve somar o valor absoluto do deslocamento de cada chamada válida.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
