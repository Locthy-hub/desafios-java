/*
 * ==========================================================
 * DESAFIO 025 - Validador de Força de Senha
 * ==========================================================
 *
 * OBJETIVO:
 * Praticar métodos, if/else, operadores lógicos e manipulação de caracteres para validar a
 * robustez de senhas.
 *
 * ENUNCIADO:
 * Desenvolva um validador de força de senha que recebe uma senha digitada pelo usuário e
 * verifica critérios de segurança, classificando-a como Fraca, Media ou Forte. O programa
 * deve permitir validar várias senhas em sequência até que o usuário digite 'sair'.
 *
 * REGRAS:
 * - Critérios avaliados: tamanho mínimo de 8 caracteres, presença de ao menos uma letra
 * - maiúscula, uma letra minúscula, um número e um caractere especial (ex.: !@#$%&*).
 * - Crie métodos separados para cada verificação, por exemplo: temMaiuscula(String senha),
 * - temMinuscula(String senha), temNumero(String senha) e temEspecial(String senha),
 * - percorrendo os caracteres com um for e usando métodos como Character.isUpperCase.
 * - Classificação: 0 ou 1 critério atendido = Fraca; 2 ou 3 critérios = Media; todos os 4
 * - critérios (mais o tamanho mínimo) = Forte.
 * - O laço principal deve continuar pedindo senhas até que o usuário digite exatamente 'sair'.
 *
 * ENTRADA:
 * Senhas digitadas em sequência pelo usuário, finalizando com a palavra 'sair'.
 *
 * SAIDA ESPERADA:
 * Classificação de força de cada senha analisada (Fraca, Media ou Forte).
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   abc123
 *   Senha@123
 *   sair
 * Saida:
 *   Classificacao: Fraca
 *   Classificacao: Forte
 *   Encerrando validador...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Senha que atende a todos os critérios menos o tamanho mínimo.
 * Caso 2: Senha composta apenas por letras minúsculas.
 * Caso 3: Entrada 'sair' logo na primeira linha (nenhuma senha validada).
 *
 * OBSERVACOES IMPORTANTES:
 * Utilize o método charAt() e a classe Character para verificar o tipo de cada caractere da senha.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
