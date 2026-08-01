/*
 * ==========================================================
 * DESAFIO 017 - Controle de Consumo de Combustível de Frota
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays, métodos, if/else e operadores aritméticos para analisar o consumo de
 * veículos de uma frota.
 *
 * ENUNCIADO:
 * Desenvolva um programa que analisa o consumo de combustível de uma frota de veículos. Para
 * cada veículo, informe a placa, os quilômetros rodados e os litros de combustível
 * consumidos. Calcule a autonomia (km/litro) de cada veículo e classifique-o quanto à
 * eficiência.
 *
 * REGRAS:
 * - Autonomia = km rodados / litros consumidos.
 * - Classificação: autonomia >= 12 é 'Eficiente'; entre 8 e 11.99 é 'Regular'; abaixo de 8 é
 * - 'Ineficiente'.
 * - Crie um método calcularAutonomia(double km, double litros) que trata o caso de litros
 * - igual a zero, retornando 0 e evitando divisão por zero.
 * - Ao final, exiba a placa do veículo mais eficiente e a autonomia média da frota.
 *
 * ENTRADA:
 * Quantidade de veículos e, para cada um, placa, km rodados e litros consumidos.
 *
 * SAIDA ESPERADA:
 * Autonomia e classificação de cada veículo, o mais eficiente e a autonomia média da frota.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   2
 *   ABC1234
 *   480
 *   40
 *   XYZ9876
 *   300
 *   50
 * Saida:
 *   ABC1234 - Autonomia: 12.0 km/l - Eficiente
 *   XYZ9876 - Autonomia: 6.0 km/l - Ineficiente
 *   Veiculo mais eficiente: ABC1234
 *   Autonomia media da frota: 9.0 km/l
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Veículo com litros consumidos igual a zero (evitar divisão por zero).
 * Caso 2: Frota inteira com veículos ineficientes.
 * Caso 3: Empate na autonomia entre dois veículos (considere o primeiro encontrado como o
 * mais eficiente).
 *
 * OBSERVACOES IMPORTANTES:
 * Utilize arrays paralelos para placas, quilometragens e litros. Trate cuidadosamente a divisão por zero.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
