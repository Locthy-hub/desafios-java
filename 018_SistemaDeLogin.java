/*
 * ==========================================================
 * DESAFIO 018 - Sistema de Login com Bloqueio por Tentativas
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar while, do-while, métodos e operadores lógicos para simular autenticação com
 * bloqueio de segurança.
 *
 * ENUNCIADO:
 * Implemente um sistema de login simples com usuário e senha fixos no código. O usuário tem
 * no máximo 3 tentativas para acertar a senha; ao errar todas, a conta deve ser bloqueada e
 * o programa deve encerrar informando o bloqueio.
 *
 * REGRAS:
 * - Usuário e senha corretos devem ser constantes no código (ex.: 'admin' e '1234').
 * - Utilize um laço do-while para repetir a solicitação de senha até acertar ou esgotar as
 * - tentativas.
 * - Crie um método validarLogin(String usuarioDigitado, String senhaDigitada) que retorna um
 * - valor booleano.
 * - A cada tentativa errada, informe quantas tentativas ainda restam.
 * - Se o login for bem-sucedido, exiba mensagem de boas-vindas e encerre normalmente.
 *
 * ENTRADA:
 * Nome de usuário e senha digitados a cada tentativa.
 *
 * SAIDA ESPERADA:
 * Mensagens de erro com tentativas restantes, mensagem de boas-vindas ou mensagem de bloqueio.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   admin
 *   0000
 *   admin
 *   1234
 * Saida:
 *   Senha incorreta! Tentativas restantes: 2
 *   Login efetuado com sucesso! Bem-vindo, admin!
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Usuário erra todas as 3 tentativas e a conta é bloqueada.
 * Caso 2: Usuário acerta na última tentativa disponível.
 * Caso 3: Nome de usuário incorreto mas senha correta (deve ser considerado login inválido).
 *
 * OBSERVACOES IMPORTANTES:
 * O método de validação deve comparar tanto o usuário quanto a senha, utilizando o método equals para Strings.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
