/*
 * ==========================================================
 * DESAFIO 004 - Controle de Estoque com Reposição Automática
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar arrays paralelos, do-while, if/else e operadores para simular a gestão de um
 * pequeno estoque.
 *
 * ENUNCIADO:
 * Crie um programa que gerencia o estoque de produtos de uma loja. Cada produto tem nome,
 * quantidade em estoque e quantidade mínima. O programa deve permitir registrar vendas
 * (baixa de estoque) através de um menu que se repete até a opção de sair ser escolhida, e
 * deve alertar automaticamente quando um produto atingir o nível mínimo.
 *
 * REGRAS:
 * - Cadastre inicialmente 5 produtos com nome, quantidade e quantidade mínima definidos no
 * - código.
 * - O menu deve conter: 1 - Vender produto, 2 - Listar estoque, 3 - Sair.
 * - Ao vender, peça o índice do produto e a quantidade vendida; valide se há estoque
 * - suficiente.
 * - Sempre que uma venda deixar o produto com quantidade <= quantidade mínima, exiba um alerta
 * - de reposição.
 * - Utilize um laço do-while para garantir que o menu apareça pelo menos uma vez.
 *
 * ENTRADA:
 * Opções de menu, índice do produto e quantidade a vender, quando aplicável.
 *
 * SAIDA ESPERADA:
 * Confirmação da venda, alertas de estoque baixo, listagem do estoque e mensagem de encerramento.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   0
 *   8
 *   3
 * Saida:
 *   Venda realizada!
 *   ALERTA: estoque do produto 0 esta baixo!
 *   
 *   Saindo...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Tentar vender mais unidades do que o disponível.
 * Caso 2: Vender uma quantidade que deixa o estoque exatamente no mínimo.
 * Caso 3: Listar o estoque sem realizar nenhuma venda antes.
 *
 * OBSERVACOES IMPORTANTES:
 * Utilize dois ou três arrays paralelos (nomes, quantidades, quantidadesMinimas) já que ainda não estudamos classes.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
