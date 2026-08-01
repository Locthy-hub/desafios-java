/*
 * ==========================================================
 * DESAFIO 006 - Carrinho de Compras de Loja Virtual
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays, for, métodos e operadores aritméticos para simular um carrinho de compras
 * com desconto.
 *
 * ENUNCIADO:
 * Desenvolva um programa que simula um carrinho de compras. O usuário informa quantos itens
 * deseja comprar e, para cada item, o nome, o preço unitário e a quantidade. O programa deve
 * calcular o subtotal de cada item, o total da compra e aplicar desconto progressivo
 * conforme o valor total.
 *
 * REGRAS:
 * - Regras de desconto: total >= 500 aplica 15% de desconto; total >= 200 aplica 10%; total >=
 * - 100 aplica 5%; caso contrário, sem desconto.
 * - Crie um método calcularDesconto(double total) que retorna o percentual de desconto
 * - aplicável.
 * - Crie um método calcularSubtotal(double preco, int quantidade) que retorna o subtotal do
 * - item.
 * - Exiba o subtotal de cada item, o total bruto, o percentual de desconto aplicado e o total
 * - final.
 *
 * ENTRADA:
 * Quantidade de itens e, para cada item, nome, preço unitário e quantidade.
 *
 * SAIDA ESPERADA:
 * Subtotal de cada item, total bruto, percentual de desconto e valor final da compra.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   2
 *   Mouse
 *   50.0
 *   2
 *   Teclado
 *   150.0
 *   1
 * Saida:
 *   Mouse - Subtotal: R$ 100.0
 *   Teclado - Subtotal: R$ 150.0
 *   Total bruto: R$ 250.0
 *   Desconto aplicado: 10%
 *   Total final: R$ 225.0
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Compra que não atinge nenhum patamar de desconto.
 * Caso 2: Compra que atinge exatamente o valor limite de um patamar (ex.: total = 200.0).
 * Caso 3: Compra com um único item de alto valor que ultrapassa R$ 500,00.
 *
 * OBSERVACOES IMPORTANTES:
 * Os métodos de cálculo devem ser reutilizáveis; evite repetir a lógica de desconto diretamente na main.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
