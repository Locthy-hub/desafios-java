/*
 * ==========================================================
 * DESAFIO 030 - Desafio Final - Sistema Integrado de Gestão de Supermercado
 * ==========================================================
 *
 * OBJETIVO:
 * Integrar todos os conteúdos estudados (variáveis, tipos, operadores, Scanner, if/else,
 * switch, while, do-while, for, métodos e arrays) em um sistema completo e coeso.
 *
 * ENUNCIADO:
 * Este é o desafio final da coleção. Você deve construir um sistema de gestão de
 * supermercado que combine cadastro de produtos, controle de estoque, um carrinho de compras
 * para o cliente, cálculo de descontos por forma de pagamento e emissão de um relatório
 * final de vendas do dia, tudo por meio de um menu principal.
 *
 * REGRAS:
 * - Cadastre inicialmente 6 produtos (nome, preço e quantidade em estoque) em arrays paralelos
 * - definidos no código.
 * - Menu principal (usando switch, repetido em while até 'Sair'): 1 - Ver produtos, 2 -
 * - Realizar venda (carrinho), 3 - Repor estoque, 4 - Relatorio do dia, 5 - Sair.
 * - Ao realizar uma venda, o cliente deve poder adicionar múltiplos produtos ao carrinho
 * - (repetindo em um laço do-while interno até escolher finalizar), respeitando o estoque
 * - disponível.
 * - Ao finalizar a compra, pergunte a forma de pagamento (1-Dinheiro, 2-Pix, 3-Cartao) e
 * - aplique desconto: Dinheiro e Pix 10%, Cartao sem desconto, usando switch.
 * - Cada venda concluída deve: baixar o estoque dos produtos vendidos, somar o valor ao total
 * - arrecadado no dia e incrementar o contador de vendas realizadas.
 * - A opção 'Repor estoque' deve permitir adicionar unidades a um produto existente, validando
 * - o índice informado.
 * - O relatório do dia deve exibir: total de vendas realizadas, valor total arrecadado,
 * - produto mais vendido (em quantidade) e produtos com estoque abaixo de 5 unidades (alerta
 * - de reposição).
 * - Utilize ao menos 4 métodos distintos no programa (por exemplo: exibirProdutos,
 * - calcularDesconto, processarVenda, gerarRelatorio), evitando concentrar toda a lógica na
 * - main.
 *
 * ENTRADA:
 * Opções do menu, produtos e quantidades escolhidos no carrinho, forma de pagamento e quantidades de reposição.
 *
 * SAIDA ESPERADA:
 * Listagem de produtos, confirmações de venda com valor final, confirmações de reposição e o relatório completo do dia ao final da execução.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   2
 *   0
 *   2
 *   0
 *   1
 *   4
 * Saida:
 *   Item adicionado ao carrinho!
 *   Compra finalizada! Total com desconto: R$ ...
 *   
 *   --- Relatorio do Dia ---
 *   Vendas realizadas: 1
 *   Total arrecadado: R$ ...
 *   Produto mais vendido: ...
 *   Alerta de estoque baixo: ...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Cliente tenta comprar mais unidades de um produto do que o estoque disponível.
 * Caso 2: Um dia inteiro de simulação com múltiplas vendas, testando o cálculo correto do
 * relatório final.
 * Caso 3: Reposição de estoque em um produto que estava com quantidade abaixo de 5 unidades,
 * verificando que ele deixa de aparecer no alerta do relatório.
 *
 * OBSERVACOES IMPORTANTES:
 * Este desafio deve, obrigatoriamente, combinar todas as estruturas da lista de conteúdos. Planeje a estrutura de métodos antes de começar a implementar.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
